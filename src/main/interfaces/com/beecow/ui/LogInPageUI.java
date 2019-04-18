package com.beecow.ui;

public class LogInPageUI {

	public static final String DANGNHAP_BTT ="//span[@beetranslate='beecow.action.login']";
	
	public static final String POPUP_USERNAME_TXT ="//input[@formcontrolname='credential']";
	
	public static final String POPUP_USERNAME_TXT_PHONEVALID_MESSAGE ="//span[@beetranslate='beecow.login.error.phoneValidError']";
	
	public static final String POPUP_USERNAME_TXT_EMAILVALID_MESSAGE ="//span[@beetranslate='beecow.login.error.emailValidError']";
	
	public static final String POPUP_USERNAME_TXT_DEL ="//input[@formcontrolname='credential']";

 
	public static final String POPUP_PASSWORD_TXT ="//input[@placeholder='Mật khẩu']";
	
	public static final String POPUP_PASSWORD_TXT_MESSAGE ="//input[@id='pwd']//preceding::span[@beetranslate='beecow.login.error.pwdValidError']//span";
 
	public static final String POPUP_DANGNHAP_BTT ="//button[@class='btn-solid-orange btn-login']//span[contains(text(),'Đăng nhập')]";
	
	public static final String POPUP_DANGNHAP_BTT_MESSAGE ="//button[@class='btn-solid-orange btn-login']//span[contains(text(),'Đăng nhập')]//preceding::span[@beetranslate='beecow.login.error.validateFormError']//span";
	
	
	

}
