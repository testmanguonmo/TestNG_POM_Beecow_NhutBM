package com.beecow.ui;

public class LogInPageUI {

	public static final String DANGNHAP_BTT ="//span[@beetranslate='beecow.action.login']//span[contains(text(),'Đăng nhập')]";
	
	public static final String POPUP_USERNAME_TXT ="//input[@id='usr']";
	
	public static final String POPUP_USERNAME_TXT_MESSAGE ="//input[@id='usr']//preceding::span[@beetranslate='beecow.login.error.emailValidError']//span";

	public static final String POPUP_PASSWORD_TXT ="//input[@placeholder='Mật khẩu']";
	
	public static final String POPUP_PASSWORD_TXT_MESSAGE ="//input[@id='pwd']//preceding::span[@beetranslate='beecow.login.error.pwdValidError']//span";
 
	public static final String POPUP_DANGNHAP_BTT ="//button[@class='btn-solid-orange btn-login']//span[contains(text(),'Đăng nhập')]";
	
	public static final String POPUP_DANGNHAP_BTT_MESSAGE ="//button[@class='btn-solid-orange btn-login']//span[contains(text(),'Đăng nhập')]//preceding::span[@beetranslate='beecow.login.error.validateFormError']//span";
	
	
	

}