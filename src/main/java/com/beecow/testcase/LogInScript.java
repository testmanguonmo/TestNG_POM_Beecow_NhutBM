package com.beecow.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beecow.actions.LogInPage;

import CommonPage.CommonTestcase;

public class LogInScript extends CommonTestcase {
	WebDriver driver;

	String email, emailLogin, passwordLogin;

	LogInPage loginPage;

	@Parameters({ "browser", "version", "url" })

	@BeforeClass
	public void beforeClass(String browser, String version, String url) {
		driver = openMultiBrowser(browser, version, url);
		loginPage = PageFactory.initElements(driver, LogInPage.class);
	}

//	@BeforeMethod
	public void beforeMethod() {

		
		loginPage.clickDangNhap_BTT();

	}

	//Null username+password
	@Test
	public void testcase_01() {
		loginPage.clickDangNhap_BTT();
		loginPage.clickPOPUP_DangNhap_BTT();
		verifyEqual(loginPage.getTextPOPUP_DangNhap_BTT(), "Hãy nhập email / số điện thoại và mật khẩu");
		
	}
	//Only type number in username 
	@Test
	public void testcase_02() {
		
		loginPage.inputPOPUP_UserName_TXT("12345");
		loginPage.clickPOPUP_DangNhap_BTT();
		verifyEqual(loginPage.getTextPOPUP_UserName_TXT_PhoneValid_MESSAGE(),"Số điện thoại không đúng");
		verifyEqual(loginPage.getTextPOPUP_DangNhap_BTT(), "Hãy nhập email / số điện thoại và mật khẩu");
		loginPage.cleanPOPUP_UserName_TXT();
		
	}
	
	//Type valid email in username
	@Test
	public void testcase_03() {
		
		loginPage.inputPOPUP_UserName_TXT("1234abcd");
		loginPage.clickPOPUP_DangNhap_BTT();
		verifyEqual(loginPage.getTextPOPUP_UserName_TXT_EmailValid_MESSAGE(),"Email không đúng" );
		verifyEqual(loginPage.getTextPOPUP_DangNhap_BTT(), "Hãy nhập email / số điện thoại và mật khẩu");
		
	}

	@AfterClass
	public void afterClass() {

	}
}
