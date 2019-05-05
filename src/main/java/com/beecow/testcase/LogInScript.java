package com.beecow.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beecow.actions.LogInPage;

import CommonPage.CommonTestcase;

public class LogInScript extends CommonTestcase {

	WebDriver driver;

//	String email, emailLogin, passwordLogin;

	LogInPage loginPage;

	@Parameters({ "browser", "version", "url" })

	@BeforeClass
	public void beforeClass(String browser, String version, String url) {
		
		inititalReport("Nhutbm_becow_20042019.html");
		driver = openMultiBrowser(browser, version, url);
		loginPage = PageFactory.initElements(driver, LogInPage.class);
	}

//	@BeforeMethod
	public void beforeMethod() {

		loginPage.clickDangNhap_BTT();

	}

	// Null username+password
	@Test
	public void testcase_01() {
		logTestCase("Null username+password");
		loginPage.clickDangNhap_BTT();
		loginPage.clickPOPUP_DangNhap_BTT();
		verifyEqual(loginPage.getTextPOPUP_DangNhap_BTT(), "Hãy nhập email / số điện thoại và mật khẩu");

	}

	// Only type number in username
	@Test
	public void testcase_02() {
		logTestCase("Only type number in username");
		loginPage.inputPOPUP_UserName_TXT("12345");
		loginPage.clickPOPUP_DangNhap_BTT();
		verifyEqual(loginPage.getTextPOPUP_UserName_TXT_PhoneValid_MESSAGE(), "Số điện thoại không đúng");
		verifyEqual(loginPage.getTextPOPUP_DangNhap_BTT(), "Hãy nhập email / số điện thoại và mật khẩu");
//		loginPage.cleanPOPUP_UserName_TXT();
		loginPage.clearByJs("$('input#usr').val('')");

	}

	// Type invalid email in username
	@Test
	public void testcase_03() {
		logTestCase("Type invalid email in username");
		loginPage.inputPOPUP_UserName_TXT("1234abcd");
		loginPage.clickPOPUP_DangNhap_BTT();
		verifyEqual(loginPage.getTextPOPUP_UserName_TXT_EmailValid_MESSAGE(), "Email không đúng");
		verifyEqual(loginPage.getTextPOPUP_DangNhap_BTT(), "Hãy nhập email / số điện thoại và mật khẩu");
		loginPage.clearByJs("$('input#usr').val('')");

	}

	//Type valid email in username
	@Test
	public void testcase_04() {
		logTestCase("Type valid email in username");
		loginPage.inputPOPUP_UserName_TXT("genymotionios@gmail.com");
		loginPage.clickPOPUP_DangNhap_BTT();
		verifyEqual(loginPage.getTextPOPUP_DangNhap_BTT(), "Hãy nhập email / số điện thoại và mật khẩu");
	}
	
	//Type Three number in password
	@Test
	public void testcase_05() {
		logTestCase("Type Three number in password");
		loginPage.inputPOPUP_PassWord_TXT("123");
		loginPage.clickPOPUP_DangNhap_BTT();
		verifyEqual(loginPage.getTextPOPUP_PassWord_TXT_MESSAGE(), "Tối thiểu 6 ký tự");
		verifyEqual(loginPage.getTextPOPUP_DangNhap_BTT(), "Hãy nhập email / số điện thoại và mật khẩu");
		loginPage.clearByJs("$('input#pwd').val('')");
	}
	
	//Type Six number in password
	@Test
	public void testcase_06() {
		logTestCase("Type Six number in password");
		loginPage.inputPOPUP_PassWord_TXT("123456");
		loginPage.clickPOPUP_DangNhap_BTT();
//		verifyEqual(loginPage.getTextPOPUP_PassWord_TXT_MESSAGE(), "Tối thiểu 6 ký tự");
		verifyEqual(loginPage.getTextPOPUP_DangNhap_BTT_LOGINERROR(), "Sai email / số điện thoại hoặc mật khẩu");
		loginPage.clearByJs("$('input#pwd').val('')");
	}
	
	//Login successfully
	@Test
	public void testcase_07() throws InterruptedException {
		logTestCase("Login successfully");
		loginPage.inputPOPUP_PassWord_TXT("1234@abcd");
		loginPage.clickPOPUP_DangNhap_BTT();
		Thread.sleep(3000);
		verifyEqual(loginPage.getTextUserName_LBL(), "genymotionios");
//		verifyEqual(loginPage.getTextPOPUP_PassWord_TXT_MESSAGE(), "Tối thiểu 6 ký tự");
//		verifyEqual(loginPage.getTextPOPUP_DangNhap_BTT(), "Hãy nhập email / số điện thoại và mật khẩu");
	}

	@AfterMethod
	public void afterMethod(ITestResult result)
	{
		getResult(result);;
	}
	@AfterClass
	public void afterClass() {

		exportReport();
		driver.quit();
	}
}
