package com.beecow.actions;

import org.openqa.selenium.WebDriver;

import CommonPage.commonFunction;

import com.beecow.ui.LogInPageUI;

public class LogInPage extends commonFunction {

	public LogInPage(WebDriver driver) {
		super(driver);
	}

	public void clickDangNhap_BTT() {
		waitVisible(LogInPageUI.DANGNHAP_BTT);
		click(LogInPageUI.DANGNHAP_BTT);
	}
	
	public void inputPOPUP_UserName_TXT(String value)
	{
		waitVisible(LogInPageUI.POPUP_USERNAME_TXT);
		input(LogInPageUI.POPUP_USERNAME_TXT, value);
	}
	
//	public String getText
}
