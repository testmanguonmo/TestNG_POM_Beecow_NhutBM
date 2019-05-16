package com.beecow.testcase;

import javax.net.ssl.HostnameVerifier;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.beecow.actions.HomePage;
import com.beecow.actions.LogInPage;

import CommonPage.CommonTestcase;
import ObjectPageJson.JsonData;

public class HomePageScript extends CommonTestcase {

	WebDriver driver;

	String productName, productDescription;

	String UploadImageNull, ProductNameNull, Combobox2Null, DescriptionNull, QuantityNull, PriceNull, WeightNull,
			WidthNull, LengthNull, HeightNull, MinWeightInvalid, MinWidthInvalid, MaxWidthInvalid, MinLengthInvalid,
			MaxLengthInvalid, MinHeightInvalid, MaxHeightInvalid;
	
	String userPath = System.getProperty("user.dir");
	String pathImage = userPath.concat("\\data\\image.png");

	JsonData json;

	LogInPage loginPage;

	HomePage homePage;

	@Parameters({ "browser", "version", "url" })

	@BeforeClass
	public void beforeClass(String browser, String version, String url) {

		inititalReport("Nhutbm_beecow_23042019.html");

		driver = openMultiBrowser(browser, version, url);

		productName = "Product" + randomNumber();
		
		productDescription = "Description: " + productName;

		// New page mới
		loginPage = PageFactory.initElements(driver, LogInPage.class);
		homePage = PageFactory.initElements(driver, HomePage.class);

		/*
		 * UploadImageNull = "Hãy chọn hình ảnh cho sản phẩm"; ProductNameNull =
		 * "Hãy điền tên sản phẩm"; Combobox2Null = "Hãy chọn danh mục.";
		 * DescriptionNull ="Hãy mô tả sản phẩm."; QuantityNull ="Nhập số lượng." ;
		 * PriceNull ="Hãy điền giá."; WeightNull = "Hãy điền cân nặng sản phẩm.";
		 * WidthNull ="Bắt buộc"; LengthNull = "Bắt buộc"; HeightNull ="Bắt buộc";
		 * MinWeightInvalid = "Cân nặng từ 50g đến 10000g."; MinWidthInvalid
		 * ="Từ 1cm tới 50cm"; MaxWidthInvalid = "Từ 1cm tới 50cm"; MinLengthInvalid
		 * ="Từ 1cm tới 30cm"; MaxLengthInvalid ="Từ 1cm tới 30cm"; MinHeightInvalid
		 * ="Từ 1cm tới 50cm"; MaxHeightInvalid ="Từ 1cm tới 50cm";
		 * 
		 */

		// Ten file Json
		json = getDataJson(".\\Data\\Beecow.json");
	}

//	@BeforeMethod

	public void beforeMethod() {

		loginPage.clickDangNhap_BTT();
		loginPage.inputPOPUP_UserName_TXT("genymotionios@gmail.com");
		loginPage.inputPOPUP_PassWord_TXT("1234@abcd");
		loginPage.clickPOPUP_DangNhap_BTT();

	}

	//
	@Test
	public void testcase_01() throws InterruptedException {
		// Name tescase
		logTestCase("Click on Đăng sản phẩm mới label");

		loginPage.clickDangNhap_BTT();
		loginPage.inputPOPUP_UserName_TXT("genymotionios@gmail.com");
		loginPage.inputPOPUP_PassWord_TXT("1234@abcd");
		loginPage.clickPOPUP_DangNhap_BTT();
		Thread.sleep(2000);
		homePage.clickKenhBanHang_LBL();
		homePage.clickDANGSANPHAMMOI_LBL();
		Thread.sleep(1000);
//		System.out.println(homePage.getText_URL_UPLOADPRODUCT());
		verifyEqual(homePage.getText_URL_UPLOADPRODUCT(), "https://www.beecow.com/page/upload-product");

	}

	// Click button Đăng
	@Test
	public void testcase_02() {

		logTestCase("Click Đăng button");

		homePage.clickDang_BTT();

		System.out.println("Text actual: " + homePage.getText_UPLOAD_IMAGE_MESSAGE());

		System.out.println("Text expected: " + json.expectedHomePage().getUploadImageNull());

//		verifyEqual(homePage.getText_UPLOAD_IMAGE_MESSAGE(), "Hãy chọn hình ảnh cho sản phẩm");

		// Dung json
		verifyEqual(homePage.getText_UPLOAD_IMAGE_MESSAGE(), json.expectedHomePage().getUploadImageNull());

//		verifyEqual(homePage.getText_TXT_PRODUCT_NAME_MESSAGE(), "Hãy điền tên sản phẩm");

		verifyEqual(homePage.getText_TXT_PRODUCT_NAME_MESSAGE(), json.expectedHomePage().getProductNameNull());

//		verifyEqual(homePage.getText_CBB_CATEGORY_MESSAGE(), "Hãy chọn danh mục.");

		verifyEqual(homePage.getText_CBB_CATEGORY_MESSAGE(), json.expectedHomePage().getCombobox2Null());

//		verifyEqual(homePage.getText_TXT_DESCRIPTION_MESSAGE(), "Hãy mô tả sản phẩm.");

		verifyEqual(homePage.getText_TXT_DESCRIPTION_MESSAGE(), json.expectedHomePage().getDescriptionNull());

//		verifyEqual(homePage.getText_TXT_QUANTITY_MESSAGE(), "Nhập số lượng.");

		verifyEqual(homePage.getText_TXT_QUANTITY_MESSAGE(), json.expectedHomePage().getQuantityNull());

//		verifyEqual(homePage.getText_TXT_PRICE_MESSAGE(), "Hãy điền giá.");

		verifyEqual(homePage.getText_TXT_PRICE_MESSAGE(), json.expectedHomePage().getPriceNull());

//		verifyEqual(homePage.getText_TXT_WEIGHT_MESSAGE(), "Hãy điền cân nặng sản phẩm.");

		verifyEqual(homePage.getText_TXT_WEIGHT_MESSAGE(), json.expectedHomePage().getWeightNull());

//		verifyEqual(homePage.getText_TXT_WIDTH_MESSAGE(), "Bắt buộc");

		verifyEqual(homePage.getText_TXT_WIDTH_MESSAGE(), json.expectedHomePage().getWidthNull());

//		verifyEqual(homePage.getText_TXT_LENGTH_MESSAGE(), "Bắt buộc");

		verifyEqual(homePage.getText_TXT_LENGTH_MESSAGE(), json.expectedHomePage().getLengthNull());

//		verifyEqual(homePage.getText_TXT_HEIGHT_MESSAGE(), "Bắt buộc");

		verifyEqual(homePage.getText_TXT_HEIGHT_MESSAGE(), json.expectedHomePage().getHeightNull());

	}

	// Ony upload Image
	@Test
	public void testcase_03() {

		logTestCase("Only upload Image");

//		homePage.Upload_TIMHINHANH("C:\\123456789.png");
		homePage.Upload_TIMHINHANH(pathImage);


		homePage.clickDang_BTT();

//		verifyEqual(homePage.getText_TXT_PRODUCT_NAME_MESSAGE(), "Hãy điền tên sản phẩm");
//
//		verifyEqual(homePage.getText_CBB_CATEGORY_MESSAGE(), "Hãy chọn danh mục.");
//
//		verifyEqual(homePage.getText_TXT_DESCRIPTION_MESSAGE(), "Hãy mô tả sản phẩm.");
//
//		verifyEqual(homePage.getText_TXT_QUANTITY_MESSAGE(), "Nhập số lượng.");
//
//		verifyEqual(homePage.getText_TXT_PRICE_MESSAGE(), "Hãy điền giá.");
//
//		verifyEqual(homePage.getText_TXT_WEIGHT_MESSAGE(), "Hãy điền cân nặng sản phẩm.");
//
//		verifyEqual(homePage.getText_TXT_WIDTH_MESSAGE(), "Bắt buộc");
//
//		verifyEqual(homePage.getText_TXT_LENGTH_MESSAGE(), "Bắt buộc");
//
//		verifyEqual(homePage.getText_TXT_HEIGHT_MESSAGE(), "Bắt buộc");

		verifyEqual(homePage.getText_TXT_PRODUCT_NAME_MESSAGE(), json.expectedHomePage().getProductNameNull());

		verifyEqual(homePage.getText_CBB_CATEGORY_MESSAGE(), json.expectedHomePage().getCombobox2Null());

		verifyEqual(homePage.getText_TXT_DESCRIPTION_MESSAGE(), json.expectedHomePage().getDescriptionNull());

		verifyEqual(homePage.getText_TXT_QUANTITY_MESSAGE(), json.expectedHomePage().getQuantityNull());

		verifyEqual(homePage.getText_TXT_PRICE_MESSAGE(), json.expectedHomePage().getPriceNull());

		verifyEqual(homePage.getText_TXT_WEIGHT_MESSAGE(), json.expectedHomePage().getWeightNull());

		verifyEqual(homePage.getText_TXT_WIDTH_MESSAGE(), json.expectedHomePage().getWidthNull());

		verifyEqual(homePage.getText_TXT_LENGTH_MESSAGE(), json.expectedHomePage().getLengthNull());

		verifyEqual(homePage.getText_TXT_HEIGHT_MESSAGE(), json.expectedHomePage().getHeightNull());

	}

	// Type Product name and select dropdown 1
	@Test
	public void testcase_04() throws InterruptedException {

		logTestCase("Type Product Name and select dropdown 1");

		homePage.inputTXT_PRODUCT_NAME(productName);

		homePage.clickDang_BTT();

		// Select dropdown1
		homePage.click_CBB1_CATEGORY();
		Thread.sleep(1000);
		homePage.clickCBB1_OPTION_CATEGORY();

		// Select dropdown2
//		verifyEqual(homePage.getText_CBB_CATEGORY_MESSAGE(), "Hãy chọn danh mục.");
//
//		verifyEqual(homePage.getText_TXT_DESCRIPTION_MESSAGE(), "Hãy mô tả sản phẩm.");
//
//		verifyEqual(homePage.getText_TXT_QUANTITY_MESSAGE(), "Nhập số lượng.");
//
//		verifyEqual(homePage.getText_TXT_PRICE_MESSAGE(), "Hãy điền giá.");
//
//		verifyEqual(homePage.getText_TXT_WEIGHT_MESSAGE(), "Hãy điền cân nặng sản phẩm.");
//
//		verifyEqual(homePage.getText_TXT_WIDTH_MESSAGE(), "Bắt buộc");
//
//		verifyEqual(homePage.getText_TXT_LENGTH_MESSAGE(), "Bắt buộc");
//
//		verifyEqual(homePage.getText_TXT_HEIGHT_MESSAGE(), "Bắt buộc");
		verifyEqual(homePage.getText_CBB_CATEGORY_MESSAGE(), json.expectedHomePage().getCombobox2Null());

		verifyEqual(homePage.getText_TXT_DESCRIPTION_MESSAGE(), json.expectedHomePage().getDescriptionNull());

		verifyEqual(homePage.getText_TXT_QUANTITY_MESSAGE(), json.expectedHomePage().getQuantityNull());

		verifyEqual(homePage.getText_TXT_PRICE_MESSAGE(), json.expectedHomePage().getPriceNull());

		verifyEqual(homePage.getText_TXT_WEIGHT_MESSAGE(), json.expectedHomePage().getWeightNull());

		verifyEqual(homePage.getText_TXT_WIDTH_MESSAGE(), json.expectedHomePage().getWidthNull());

		verifyEqual(homePage.getText_TXT_LENGTH_MESSAGE(), json.expectedHomePage().getLengthNull());

		verifyEqual(homePage.getText_TXT_HEIGHT_MESSAGE(), json.expectedHomePage().getHeightNull());

	}

	// Select option in combobox2 & 3
	@Test
	public void testcase_05() throws InterruptedException {

		logTestCase("Select dropdown 2 & 3");

		homePage.click_CBB2_CATEGORY();
		Thread.sleep(1000);
		homePage.clickCBB2_OPTION_CATEGORY();
		Thread.sleep(1000);
//		homePage.click_CBB3_CATEGORY();
//		Thread.sleep(1000);
		homePage.clickCBB3_OPTION_CATEGORY();
		homePage.clickDang_BTT();

//		verifyEqual(homePage.getText_TXT_DESCRIPTION_MESSAGE(), "Hãy mô tả sản phẩm.");
//
//		verifyEqual(homePage.getText_TXT_QUANTITY_MESSAGE(), "Nhập số lượng.");
//
//		verifyEqual(homePage.getText_TXT_PRICE_MESSAGE(), "Hãy điền giá.");
//
//		verifyEqual(homePage.getText_TXT_WEIGHT_MESSAGE(), "Hãy điền cân nặng sản phẩm.");
//
//		verifyEqual(homePage.getText_TXT_WIDTH_MESSAGE(), "Bắt buộc");
//
//		verifyEqual(homePage.getText_TXT_LENGTH_MESSAGE(), "Bắt buộc");
//
//		verifyEqual(homePage.getText_TXT_HEIGHT_MESSAGE(), "Bắt buộc");

		verifyEqual(homePage.getText_TXT_DESCRIPTION_MESSAGE(), json.expectedHomePage().getDescriptionNull());

		verifyEqual(homePage.getText_TXT_QUANTITY_MESSAGE(), json.expectedHomePage().getQuantityNull());

		verifyEqual(homePage.getText_TXT_PRICE_MESSAGE(), json.expectedHomePage().getPriceNull());

		verifyEqual(homePage.getText_TXT_WEIGHT_MESSAGE(), json.expectedHomePage().getWeightNull());

		verifyEqual(homePage.getText_TXT_WIDTH_MESSAGE(), json.expectedHomePage().getWidthNull());

		verifyEqual(homePage.getText_TXT_LENGTH_MESSAGE(), json.expectedHomePage().getLengthNull());

		verifyEqual(homePage.getText_TXT_HEIGHT_MESSAGE(), json.expectedHomePage().getHeightNull());

	}
	// Type description

	@Test
	public void testcase_06() {

		logTestCase("Type description");

		homePage.inputTXT_DESCRIPTION(productDescription);

		homePage.clickDang_BTT();

//		verifyEqual(homePage.getText_TXT_QUANTITY_MESSAGE(), "Nhập số lượng.");
//
//		verifyEqual(homePage.getText_TXT_PRICE_MESSAGE(), "Hãy điền giá.");
//
//		verifyEqual(homePage.getText_TXT_WEIGHT_MESSAGE(), "Hãy điền cân nặng sản phẩm.");
//
//		verifyEqual(homePage.getText_TXT_WIDTH_MESSAGE(), "Bắt buộc");
//
//		verifyEqual(homePage.getText_TXT_LENGTH_MESSAGE(), "Bắt buộc");
//
//		verifyEqual(homePage.getText_TXT_HEIGHT_MESSAGE(), "Bắt buộc");

		verifyEqual(homePage.getText_TXT_QUANTITY_MESSAGE(), json.expectedHomePage().getQuantityNull());

		verifyEqual(homePage.getText_TXT_PRICE_MESSAGE(), json.expectedHomePage().getPriceNull());

		verifyEqual(homePage.getText_TXT_WEIGHT_MESSAGE(), json.expectedHomePage().getWeightNull());

		verifyEqual(homePage.getText_TXT_WIDTH_MESSAGE(), json.expectedHomePage().getWidthNull());

		verifyEqual(homePage.getText_TXT_LENGTH_MESSAGE(), json.expectedHomePage().getLengthNull());

		verifyEqual(homePage.getText_TXT_HEIGHT_MESSAGE(), json.expectedHomePage().getHeightNull());
	}

	// Type quantity
	@Test
	public void testcase_07() {

		logTestCase("Type quantity");

		homePage.inputTXT_QUANTITY("10");

		homePage.clickDang_BTT();

//		verifyEqual(homePage.getText_TXT_PRICE_MESSAGE(), "Hãy điền giá.");
//
//		verifyEqual(homePage.getText_TXT_WEIGHT_MESSAGE(), "Hãy điền cân nặng sản phẩm.");
//
//		verifyEqual(homePage.getText_TXT_WIDTH_MESSAGE(), "Bắt buộc");
//
//		verifyEqual(homePage.getText_TXT_LENGTH_MESSAGE(), "Bắt buộc");
//
//		verifyEqual(homePage.getText_TXT_HEIGHT_MESSAGE(), "Bắt buộc");

		verifyEqual(homePage.getText_TXT_PRICE_MESSAGE(), json.expectedHomePage().getPriceNull());

		verifyEqual(homePage.getText_TXT_WEIGHT_MESSAGE(), json.expectedHomePage().getWeightNull());

		verifyEqual(homePage.getText_TXT_WIDTH_MESSAGE(), json.expectedHomePage().getWidthNull());

		verifyEqual(homePage.getText_TXT_LENGTH_MESSAGE(), json.expectedHomePage().getLengthNull());

		verifyEqual(homePage.getText_TXT_HEIGHT_MESSAGE(), json.expectedHomePage().getHeightNull());
	}

	// Type price
	@Test
	public void testcase_08() {

		logTestCase("Type price");

		homePage.inputTXT_PRICE("8");

		homePage.clickDang_BTT();

//		verifyEqual(homePage.getText_TXT_WEIGHT_MESSAGE(), "Hãy điền cân nặng sản phẩm.");
//
//		verifyEqual(homePage.getText_TXT_WIDTH_MESSAGE(), "Bắt buộc");
//
//		verifyEqual(homePage.getText_TXT_LENGTH_MESSAGE(), "Bắt buộc");
//
//		verifyEqual(homePage.getText_TXT_HEIGHT_MESSAGE(), "Bắt buộc");

		verifyEqual(homePage.getText_TXT_WEIGHT_MESSAGE(), json.expectedHomePage().getWeightNull());

		verifyEqual(homePage.getText_TXT_WIDTH_MESSAGE(), json.expectedHomePage().getWidthNull());

		verifyEqual(homePage.getText_TXT_LENGTH_MESSAGE(), json.expectedHomePage().getLengthNull());

		verifyEqual(homePage.getText_TXT_HEIGHT_MESSAGE(), json.expectedHomePage().getHeightNull());

	}

	// Type Weight =49
	@Test
	public void testcase_09() {
		logTestCase("Type Weight Min");

		homePage.inputTXT_WEIGHT("49");

//		homePage.getText_TXT_WEIGHT_MESSAGE_TYPE_MIN();

		verifyEqual(homePage.getText_TXT_WEIGHT_MESSAGE_TYPE_MIN(), json.expectedHomePage().getMinWeightInvalid());

		homePage.clickDang_BTT();

		verifyEqual(homePage.getText_TXT_WIDTH_MESSAGE(), json.expectedHomePage().getWidthNull());

		verifyEqual(homePage.getText_TXT_LENGTH_MESSAGE(), json.expectedHomePage().getLengthNull());

		verifyEqual(homePage.getText_TXT_HEIGHT_MESSAGE(), json.expectedHomePage().getHeightNull());

//		verifyEqual(homePage.getText_TXT_WIDTH_MESSAGE(), "Bắt buộc");
//
//		verifyEqual(homePage.getText_TXT_LENGTH_MESSAGE(), "Bắt buộc");
//
//		verifyEqual(homePage.getText_TXT_HEIGHT_MESSAGE(), "Bắt buộc");

		homePage.clearByJS("$('input[formcontrolname*=\"weight\"]').val('')");
	}

	// Type Weight =50
	@Test
	public void testcase_10() {
		logTestCase("Type Weight valid");

		homePage.inputTXT_WEIGHT("50");

		homePage.clickDang_BTT();

//		verifyEqual(homePage.getText_TXT_WIDTH_MESSAGE(), "Bắt buộc");
//
//		verifyEqual(homePage.getText_TXT_LENGTH_MESSAGE(), "Bắt buộc");
//
//		verifyEqual(homePage.getText_TXT_HEIGHT_MESSAGE(), "Bắt buộc");

		verifyEqual(homePage.getText_TXT_WIDTH_MESSAGE(), json.expectedHomePage().getWidthNull());

		verifyEqual(homePage.getText_TXT_LENGTH_MESSAGE(), json.expectedHomePage().getLengthNull());

		verifyEqual(homePage.getText_TXT_HEIGHT_MESSAGE(), json.expectedHomePage().getHeightNull());
	}

	// Type Width =0
	@Test
	public void testcase_11() {

		logTestCase("Type Width Min");

		homePage.clearByJS("$('input[formcontrolname*=\"weight\"]').val('')");
		homePage.inputTXT_WEIGHT("10000");

		homePage.inputTXT_WIDTH("0");

		homePage.clickDang_BTT();

//		verifyEqual(homePage.getText_TXT_WIDTH_MESSAGE_TYPE_MIN(), "Từ 1cm tới 50cm");

		verifyEqual(homePage.getText_TXT_WIDTH_MESSAGE_TYPE_MIN(), json.expectedHomePage().getMinWidthInvalid());

//		verifyEqual(homePage.getText_TXT_LENGTH_MESSAGE(), "Bắt buộc");
//
//		verifyEqual(homePage.getText_TXT_HEIGHT_MESSAGE(), "Bắt buộc");

		verifyEqual(homePage.getText_TXT_LENGTH_MESSAGE(), json.expectedHomePage().getLengthNull());

		verifyEqual(homePage.getText_TXT_HEIGHT_MESSAGE(), json.expectedHomePage().getHeightNull());

	}

	// Type Width=51
	@Test
	public void testcase_12() {

		logTestCase("Type Width Max");

		homePage.clearByJS("$('input[formcontrolname*=\"width\"]').val('')");
		homePage.inputTXT_WIDTH("51");

		homePage.clickDang_BTT();

		verifyEqual(homePage.getText_TXT_WIDTH_MESSAGE_TYPE_MIN(), "Từ 1cm tới 50cm");

		verifyEqual(homePage.getText_TXT_WIDTH_MESSAGE_TYPE_MIN(), json.expectedHomePage().getMaxWidthInvalid());

//		verifyEqual(homePage.getText_TXT_LENGTH_MESSAGE(), "Bắt buộc");
//
//		verifyEqual(homePage.getText_TXT_HEIGHT_MESSAGE(), "Bắt buộc");

		verifyEqual(homePage.getText_TXT_LENGTH_MESSAGE(), json.expectedHomePage().getLengthNull());

		verifyEqual(homePage.getText_TXT_HEIGHT_MESSAGE(), json.expectedHomePage().getHeightNull());

	}

	// Type Width=1
	@Test
	public void testcase_13() {

		logTestCase("Type Width valid");

		homePage.clearByJS("$('input[formcontrolname*=\"width\"]').val('')");
		homePage.inputTXT_WIDTH("1");

		homePage.clickDang_BTT();

//		verifyEqual(homePage.getText_TXT_LENGTH_MESSAGE(), "Bắt buộc");
//
//		verifyEqual(homePage.getText_TXT_HEIGHT_MESSAGE(), "Bắt buộc");

		verifyEqual(homePage.getText_TXT_LENGTH_MESSAGE(), json.expectedHomePage().getLengthNull());

		verifyEqual(homePage.getText_TXT_HEIGHT_MESSAGE(), json.expectedHomePage().getHeightNull());
	}

	// Type Length=0
	@Test
	public void testcase_14() {

		logTestCase("Type Length Min");

		homePage.inputTXT_LENGTH("0");

		homePage.clickDang_BTT();

//		verifyEqual(homePage.getText_TXT_LENGTH_MESSAGE_TYPE_MIN(), "Từ 1cm tới 30cm");

		verifyEqual(homePage.getText_TXT_LENGTH_MESSAGE_TYPE_MIN(), json.expectedHomePage().getMinLengthInvalid());

//		verifyEqual(homePage.getText_TXT_HEIGHT_MESSAGE(), "Bắt buộc");

		verifyEqual(homePage.getText_TXT_HEIGHT_MESSAGE(), json.expectedHomePage().getHeightNull());

	}

	// Type Length=31
	@Test
	public void testcase_15() {

		logTestCase("Type Length Max");

		homePage.clearByJS("$('input[formcontrolname*=\"length\"]').val('')");
		homePage.inputTXT_LENGTH("31");

		homePage.clickDang_BTT();

//		verifyEqual(homePage.getText_TXT_LENGTH_MESSAGE_TYPE_MIN(), "Từ 1cm tới 30cm");

		verifyEqual(homePage.getText_TXT_LENGTH_MESSAGE_TYPE_MIN(), json.expectedHomePage().getMaxLengthInvalid());

//		verifyEqual(homePage.getText_TXT_HEIGHT_MESSAGE(), "Bắt buộc");

		verifyEqual(homePage.getText_TXT_HEIGHT_MESSAGE(), json.expectedHomePage().getHeightNull());

	}

	// Type Length=11
	@Test
	public void testcase_16() {

		logTestCase("Type Length valid");

		homePage.clearByJS("$('input[formcontrolname*=\"length\"]').val('')");
		homePage.inputTXT_LENGTH("11");

		homePage.clickDang_BTT();

//		verifyEqual(homePage.getText_TXT_HEIGHT_MESSAGE(), "Bắt buộc");

		verifyEqual(homePage.getText_TXT_HEIGHT_MESSAGE(), json.expectedHomePage().getHeightNull());

	}

	// Type Height=0
	@Test
	public void testcase_17() {

		logTestCase("Type Height Min");

		homePage.inputTXT_HEIGHT("0");

		homePage.clickDang_BTT();

//		verifyEqual(homePage.getText_TXT_HEIGHT_MESSAGE_TYPE_MIN(), "Từ 1cm tới 50cm");

		verifyEqual(homePage.getText_TXT_HEIGHT_MESSAGE_TYPE_MIN(), json.expectedHomePage().getMinHeightInvalid());

	}

	// Type Height=51
	@Test
	public void testcase_18() {

		logTestCase("Type Height Max");

		homePage.clearByJS("$('input[formcontrolname*=\"height\"]').val('')");
		homePage.inputTXT_HEIGHT("51");

		homePage.clickDang_BTT();

//		verifyEqual(homePage.getText_TXT_HEIGHT_MESSAGE_TYPE_MIN(), "Từ 1cm tới 50cm");

		verifyEqual(homePage.getText_TXT_HEIGHT_MESSAGE_TYPE_MIN(), json.expectedHomePage().getMaxHeightInvalid());
	}

	// Type Height=19
	@Test
	public void testcase_19() {

		logTestCase("Type Height valid");

		homePage.clearByJS("$('input[formcontrolname*=\"height\"]').val('')");
		homePage.inputTXT_HEIGHT("19");

		homePage.clickDang_BTT();

		verifyEqual(homePage.getText_POPUP_HOANTAT_MESSAGE(), "Bạn đã đăng thành công sản phẩm này");

		homePage.clickBTT_POPUP_HOANTAT_XEMDANHMUC();

	}

	@Test
	public void testcase_20() throws InterruptedException {
		homePage.hoverProduct(productName);


		verifyEqual(homePage.getTextJS_EDIT("return $('#name').val()"), productName);
		
		verifyEqual(homePage.getValue_TXT_DESCRIPTION(), productDescription);


	}

	@AfterMethod
	public void afterMethod(ITestResult result) {
		getResult(result);
		;
	}

	@AfterClass
	public void afterClass() {

		exportReport();
//		driver.quit();
	}
}
