package com.beecow.actions;

import org.openqa.selenium.WebDriver;

import com.beecow.ui.HomePageUI;

import CommonPage.commonFunction;

public class HomePage extends commonFunction {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void clickKenhBanHang_LBL() {
		waitVisible(HomePageUI.KENHBANHANG_LBL);
		click(HomePageUI.KENHBANHANG_LBL);
	}

	public String getText_URL_UPLOADPRODUCT() {
		return getCurrentUrl();
	}

	public void clickDANGSANPHAMMOI_LBL() {
		waitVisible(HomePageUI.DANGSANPHAMMOI_LBL);
		click(HomePageUI.DANGSANPHAMMOI_LBL);
	}

	public void clickDang_BTT() {
		waitVisible(HomePageUI.DANG_BTT);
		click(HomePageUI.DANG_BTT);
	}

	public String getText_UPLOAD_IMAGE_MESSAGE() {
		waitVisible(HomePageUI.UPLOAD_IMAGE_MESSAGE);
		
		return getText(HomePageUI.UPLOAD_IMAGE_MESSAGE);
	}

	//
	public String getText_TXT_PRODUCT_NAME_MESSAGE() {
		waitVisible(HomePageUI.TXT_PRODUCT_NAME_MESSAGE);
		return getText(HomePageUI.TXT_PRODUCT_NAME_MESSAGE);
	}

	//
	public String getText_CBB_CATEGORY_MESSAGE() {
		waitVisible(HomePageUI.CBB_CATEGORY_MESSAGE);
		return getText(HomePageUI.CBB_CATEGORY_MESSAGE);
	}
	
	//
	public void inputTXT_DESCRIPTION(String value)
	{
		waitVisible(HomePageUI.TXT_DESCRIPTION);
		input(HomePageUI.TXT_DESCRIPTION, value);
	}
	//
	public String getText_TXT_DESCRIPTION_MESSAGE() {
		waitVisible(HomePageUI.TXT_DESCRIPTION_MESSAGE);
		return getText(HomePageUI.TXT_DESCRIPTION_MESSAGE);
	}

	//
	public String getText_TXT_QUANTITY_MESSAGE() {
		waitVisible(HomePageUI.TXT_QUANTITY_MESSAGE);
		return getText(HomePageUI.TXT_QUANTITY_MESSAGE);
	}

	//
	public String getText_TXT_PRICE_MESSAGE() {
		waitVisible(HomePageUI.TXT_PRICE_MESSAGE);
		return getText(HomePageUI.TXT_PRICE_MESSAGE);
	}

	//
	public String getText_TXT_WEIGHT_MESSAGE() {
		waitVisible(HomePageUI.TXT_WEIGHT_MESSAGE);
		return getText(HomePageUI.TXT_WEIGHT_MESSAGE);
	}

	//
	public String getText_TXT_WIDTH_MESSAGE() {
		waitVisible(HomePageUI.TXT_WIDTH_MESSAGE);
		return getText(HomePageUI.TXT_WIDTH_MESSAGE);
	}

	//
	public String getText_TXT_LENGTH_MESSAGE() {
		waitVisible(HomePageUI.TXT_LENGTH_MESSAGE);
		return getText(HomePageUI.TXT_LENGTH_MESSAGE);
	}

	//
	public String getText_TXT_HEIGHT_MESSAGE() {
		waitVisible(HomePageUI.TXT_HEIGHT_MESSAGE);
		return getText(HomePageUI.TXT_HEIGHT_MESSAGE);
	}

	public void Upload_TIMHINHANH(String value) {
		uploadBySendKeys(HomePageUI.BTT_TIMHINHANH, value);
	}

	public void inputTXT_PRODUCT_NAME(String value) {
		waitVisible(HomePageUI.TXT_PRODUCT_NAME);
		input(HomePageUI.TXT_PRODUCT_NAME, value);
	}

	//
	public void click_CBB1_CATEGORY() {
		waitVisible(HomePageUI.CBB1_CATEGORY);
		click(HomePageUI.CBB1_CATEGORY);
	}

	public void clickCBB1_OPTION_CATEGORY() {

		waitVisible(HomePageUI.CBB1_OPTION_CATEGORY);
		clickRandomOptionInCombobox(HomePageUI.CBB1_OPTION_CATEGORY);
	}

	//
	public void click_CBB2_CATEGORY() {
		waitVisible(HomePageUI.CBB2_CATEGORY);
		click(HomePageUI.CBB2_CATEGORY);
	}

	public void openUrl(String url) {
		openUrl(url);
	}

	public void clickCBB2_OPTION_CATEGORY() {
		waitVisible(HomePageUI.CBB2_OPTION_CATEGORY);
		clickRandomOptionInCombobox(HomePageUI.CBB2_OPTION_CATEGORY);
	}

	//

//	public void click_CBB3_CATEGORY() {
//		waitVisible(HomePageUI.CBB3_CATEGORY);
//		click(HomePageUI.CBB3_CATEGORY);
//	}

	
	//Kiem tra dropdown so 3 co active hay khong
	public void clickCBB3_OPTION_CATEGORY() {
		if (checkElementDisplay(HomePageUI.CBB3_CATEGORY)) {
			waitVisible(HomePageUI.CBB3_CATEGORY);
			click(HomePageUI.CBB3_CATEGORY);
			waitVisible(HomePageUI.CBB3_OPTION_CATEGORY);
			clickRandomOptionInCombobox(HomePageUI.CBB3_OPTION_CATEGORY);
		}
	}
	
	public void inputTXT_QUANTITY(String value)
	{
		waitVisible(HomePageUI.TXT_QUANTITY);
		input(HomePageUI.TXT_QUANTITY, value);
	}
	
	public void inputTXT_PRICE(String value)
	{
		waitVisible(HomePageUI.TXT_PRICE);
		input(HomePageUI.TXT_PRICE, value);
	}
	
	public void inputTXT_WEIGHT(String value)
	{
		waitVisible(HomePageUI.TXT_WEIGHT);
		input(HomePageUI.TXT_WEIGHT, value);
	}
	
	public String getText_TXT_WEIGHT_MESSAGE_TYPE_MIN()
	{
		waitVisible(HomePageUI.TXT_WEIGHT_MESSAGE_TYPE_MIN);
		return getText(HomePageUI.TXT_WEIGHT_MESSAGE_TYPE_MIN);
	}
	
	public String getText_TXT_WIDTH_MESSAGE_TYPE_MIN()
	{
		waitVisible(HomePageUI.TXT_WIDTH_MESSAGE_TYPE_MIN);
		return getText(HomePageUI.TXT_WIDTH_MESSAGE_TYPE_MIN);
	}
	
	public void inputTXT_WIDTH(String value)
	{
		waitVisible(HomePageUI.TXT_WIDTH);
		input(HomePageUI.TXT_WIDTH, value);
	}
	
	public void clearByJS(String value)
	{
		waitVisible(HomePageUI.TXT_WEIGHT);
		executeScriptBrowser(value);
	}
	
	
	public void inputTXT_LENGTH(String value)
	{
		waitVisible(HomePageUI.TXT_LENGTH);
		input(HomePageUI.TXT_LENGTH, value);
	}
	
	public String getText_TXT_LENGTH_MESSAGE_TYPE_MIN()
	{
		waitVisible(HomePageUI.TXT_LENGTH_MESSAGE_TYPE_MIN);
		return getText(HomePageUI.TXT_LENGTH_MESSAGE_TYPE_MIN);
	}
	
	
	
	public void inputTXT_HEIGHT(String value)
	{
		waitVisible(HomePageUI.TXT_HEIGHT);
		input(HomePageUI.TXT_HEIGHT, value);
	}
	
	//
	public String getText_TXT_HEIGHT_MESSAGE_TYPE_MIN()
	{
		waitVisible(HomePageUI.TXT_HEIGHT_MESSAGE_TYPE_MIN);
		return getText(HomePageUI.TXT_HEIGHT_MESSAGE_TYPE_MIN);
	}
	
	//
	public String getText_POPUP_HOANTAT_MESSAGE()
	{
		waitVisible(HomePageUI.POPUP_HOANTAT_MESSAGE);
		return getText(HomePageUI.POPUP_HOANTAT_MESSAGE);
	}
	
	//
	public void clickBTT_POPUP_HOANTAT_XEMDANHMUC()
	{
		waitVisible(HomePageUI.POPUP_HOANTAT_XEMDANHMUC);
		click(HomePageUI.POPUP_HOANTAT_XEMDANHMUC);
	}
	
	//Hover va click chinh sua
	public void hoverProduct(String value)
	{
		waitVisible(HomePageUI.HOVER_CHINHSUA);
		hover(HomePageUI.HOVER_CHINHSUA);
		click(HomePageUI.HOVER_CHINHSUA);
	}
	
	//getText product
	
	public String getTextJS_EDIT(String value) throws InterruptedException
	{
		
		Thread.sleep(2000);
		 return getTextJS(value);
	}
	
	public String getValue_TXT_DESCRIPTION()
	{
		waitVisible(HomePageUI.TXT_DESCRIPTION_VALUE);
		return getText(HomePageUI.TXT_DESCRIPTION_VALUE);
	}
	
	
}
