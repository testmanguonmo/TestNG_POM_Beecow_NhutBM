package com.beecow.actions;

import org.openqa.selenium.WebDriver;

import com.beecow.ui.LogInPageUI;

import CommonPage.commonFunction;

//import com.beecow.ui.LogInPageUI;

public class LogInPage extends commonFunction {

	public LogInPage(WebDriver driver) {
		super(driver);
	}

	public void clickDangNhap_BTT() {
		waitVisible(LogInPageUI.DANGNHAP_BTT);
		click(LogInPageUI.DANGNHAP_BTT);
	}
		
	public void clickPOPUP_DangNhap_BTT()
	{
		waitVisible(LogInPageUI.POPUP_DANGNHAP_BTT);
		click(LogInPageUI.POPUP_DANGNHAP_BTT);
	}
	
	public String getTextPOPUP_DangNhap_BTT()
	{
		waitVisible(LogInPageUI.POPUP_DANGNHAP_BTT_MESSAGE);
		return getText(LogInPageUI.POPUP_DANGNHAP_BTT_MESSAGE);
	}
	
	public void inputPOPUP_UserName_TXT(String value)
	{
		waitVisible(LogInPageUI.POPUP_USERNAME_TXT);
		input(LogInPageUI.POPUP_USERNAME_TXT, value);
	}
	
	public void cleanPOPUP_UserName_TXT()
	{
		waitVisible(LogInPageUI.POPUP_USERNAME_TXT_DEL);
		clear(LogInPageUI.POPUP_USERNAME_TXT_DEL);
	}
	
	public String getTextPOPUP_UserName_TXT_PhoneValid_MESSAGE()
	{
		waitVisible(LogInPageUI.POPUP_USERNAME_TXT_PHONEVALID_MESSAGE);
		return getText(LogInPageUI.POPUP_USERNAME_TXT_PHONEVALID_MESSAGE);
	}
	
	public String getTextPOPUP_UserName_TXT_EmailValid_MESSAGE()
	{
		waitVisible(LogInPageUI.POPUP_USERNAME_TXT_EMAILVALID_MESSAGE);
		return getText(LogInPageUI.POPUP_USERNAME_TXT_EMAILVALID_MESSAGE);
	}
	
	
	public void inputPOPUP_PassWord_TXT(String value)
	{
		waitVisible(LogInPageUI.POPUP_PASSWORD_TXT);
		input(LogInPageUI.POPUP_PASSWORD_TXT, value);
		
	}
	
	
	public String getTextPOPUP_PassWord_TXT_MESSAGE()
	{
		waitVisible(LogInPageUI.POPUP_PASSWORD_TXT_MESSAGE);
		return getText(LogInPageUI.POPUP_PASSWORD_TXT_MESSAGE);
	} 
	
	public void clearByJs(String value)
	{
		executeScriptBrowser(value);
	}
	
	public String getTextPOPUP_DangNhap_BTT_LOGINERROR()
	{
		waitVisible(LogInPageUI.POPUP_DANGNHAP_BTT_LOGINERROR_MESSAGE);
		return getText(LogInPageUI.POPUP_DANGNHAP_BTT_LOGINERROR_MESSAGE);
	} 
	
	public String getTextUserName_LBL()
	{
		waitVisible(LogInPageUI.USERNAME_LBL);
		return getText(LogInPageUI.USERNAME_LBL);
	} 
}
