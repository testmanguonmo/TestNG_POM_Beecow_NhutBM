package com.beecow.ui;

public class HomePageUI {

	public static final String KENHBANHANG_LBL = "//span[contains(@beetranslate,'beecow.link.sellerPage')]";

	public static final String DANGSANPHAMMOI_LBL = "//div[contains(@class,'file-upload-btn')]";

	public static final String DANG_BTT = "//button[@beetranslate='beecow.item.action.post']";

	public static final String UPLOAD_IMAGE_MESSAGE = "//label[contains(@beetranslate,'error.chooseImage')]/span";

	public static final String TXT_PRODUCT_NAME = "//input[@id='name']";

	public static final String TXT_PRODUCT_NAME_MESSAGE = "//label[@beetranslate='beecow.store.item.image.error.productName']/span";

	public static final String CBB1_CATEGORY = "//div[@class='select-group category-elmnt row']//div[contains(@class,'category-left')]";

	public static final String CBB1_OPTION_CATEGORY = "//div[@class='select-group category-elmnt row']//div[contains(@class,'category-left')]//ul//a";

	public static final String CBB2_CATEGORY = "//div[contains(@class,'category-mid')]";

//	public static final String CBB2_OPTION_CATEGORY ="//div[contains(@class,'category-mid error-alert')]";

	// Xpath NOT syntax: //div[not(...................)]
//	public static final String CBB2_OPTION_CATEGORY ="//div[contains(@class,'category-mid error-alert')]//ul//a[not(contains(text(),'Kh�c'))]";
	public static final String CBB2_OPTION_CATEGORY = "//div[contains(@class,'category-mid')]//li";

	public static final String CBB3_CATEGORY = "//div[contains(@class,'category-right error-alert')]";

	public static final String CBB3_OPTION_CATEGORY = "//div[contains(@class,'category-right error-alert')]//ul//a[not(contains(text(),'Kh�c'))]";

	public static final String CBB_CATEGORY_MESSAGE = "//label[@beetranslate='beecow.item.error.category']/span";
	
	public static final String TXT_DESCRIPTION = "//div[contains(@class,'fr-element fr-view')]";

	public static final String TXT_DESCRIPTION_MESSAGE = "//label[@beetranslate='beecow.item.error.description']/span";
	
	public static final String TXT_QUANTITY = "//input[@id='org-qty']";

	public static final String TXT_QUANTITY_MESSAGE = "//label[@beetranslate='beecow.item.error.itemQty']/span";
	
	public static final String TXT_PRICE = "//input[@id='original-price']";

	public static final String TXT_PRICE_MESSAGE = "//label[@beetranslate='beecow.item.error.price']/span";
	
	public static final String TXT_WEIGHT = "//input[contains(@formcontrolname,'weight')]";

	public static final String TXT_WEIGHT_MESSAGE = "//label[contains(@beetranslate,'shipping.require')]/span";
	
	public static final String TXT_WEIGHT_MESSAGE_TYPE_MIN = "//label[contains(@beetranslate,'shipping.range')]/span";
	
	public static final String TXT_WIDTH = "//input[contains(@formcontrolname,'width')]";
			
	public static final String TXT_WIDTH_MESSAGE = "//label[@beetranslate='beecow.item.error.shipping.width.require']/span";
	
	public static final String TXT_WIDTH_MESSAGE_TYPE_MIN = "//label[contains(@beetranslate,'shipping.width.range')]";
	
	public static final String TXT_LENGTH = "//input[contains(@formcontrolname,'length')]";

	public static final String TXT_LENGTH_MESSAGE = "//label[@beetranslate='beecow.item.error.shipping.length.require']/span";
	
	public static final String TXT_LENGTH_MESSAGE_TYPE_MIN = "//label[contains(@beetranslate,'length.range')]";
	
	public static final String TXT_HEIGHT = "//input[contains(@formcontrolname,'height')]";

	public static final String TXT_HEIGHT_MESSAGE = "//label[@beetranslate='beecow.item.error.shipping.height.require']/span";
	
	public static final String TXT_HEIGHT_MESSAGE_TYPE_MIN = "//label[contains(@beetranslate,'height.range')]";
	
	public static final String BTT_TIMHINHANH = "//div[@id='upload-empty']//input[@name='qqfile']";
	
	public static final String POPUP_HOANTAT_MESSAGE = "//p[contains(@beetranslate,'postSuccess')]";
	
	public static final String POPUP_HOANTAT_XEMDANHMUC = "//button[contains(@beetranslate,'viewList')]";
	
	public static final String HOVER_CHINHSUA = "//a[contains(@beetranslate,'viewEdit')]";
	
	public static final String TXT_DESCRIPTION_VALUE = "//div[contains(@class,'fr-element fr-view')]//p";


	
	

}
