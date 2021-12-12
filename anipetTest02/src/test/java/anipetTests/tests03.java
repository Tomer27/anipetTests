package anipetTests;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tests03 {

	static WebDriver driver;
	static String homeURL = "https://www.anipet.co.il/";
	static String homePhoneNum = "1700-5555-03";
	static String fullName = "וסי כהן";
	static String email2 = "yossillll21822@mailinator.com"; // needs to be changed each 'signUp' run to a new address
	static String phoneNum = "0581111111";
	static String messageContent = "aaaaaaaaaaaaa";
	static String fullNameErr = "אנא הזן שם";
	static String emailErr = "אנא הזן דואר אלקטרוני";
	static String phoneNumErr = "אנא הזן מס' טלפון";
	static String contact = "צור קשר";
	static String facebookURL = "https://www.facebook.com/anipet.stores/";
	static String instagramURL = "https://www.instagram.com/anipet_israel/";
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tomer\\Desktop\\Selenium\\chromeVer95//chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(homeURL);
		Thread.sleep(500);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Test
	public void contactUsBlankName() throws InterruptedException {
		anipetDefs01.homePageBtn(driver).click();
		Thread.sleep(500);
		for (int i = 0; i < anipetDefs01.infoOptions(driver).size(); i++) {
			String optionX = anipetDefs01.infoOptions(driver).get(i).getText();
			if (optionX.equals(contact)) {
				anipetDefs01.infoOptions(driver).get(i).click();
			}else {
				continue;
			}
		}
		Thread.sleep(1000);
		anipetDefs01.CUEmail(driver).sendKeys(email2);
		anipetDefs01.CUPhone(driver).sendKeys(phoneNum);
		anipetDefs01.CUMessage(driver).sendKeys(messageContent);
		anipetDefs01.CUSendBtn(driver).click();
		Thread.sleep(1500);
		String errorMessage = anipetDefs01.CUErrorMessage(driver).getText();
		anipetDefs01.homePageBtn(driver).click();
		Thread.sleep(500);
		assertEquals(fullNameErr, errorMessage);
	}
	
	@Test
	public void contactUsBlankEmail() throws InterruptedException {
		anipetDefs01.homePageBtn(driver).click();
		Thread.sleep(500);
		for (int i = 0; i < anipetDefs01.infoOptions(driver).size(); i++) {
			String optionX = anipetDefs01.infoOptions(driver).get(i).getText();
			if (optionX.equals(contact)) {
				anipetDefs01.infoOptions(driver).get(i).click();
			}else {
				continue;
			}
		}
		Thread.sleep(1000);
		anipetDefs01.CUName(driver).sendKeys(fullName);
		anipetDefs01.CUPhone(driver).sendKeys(phoneNum);
		anipetDefs01.CUMessage(driver).sendKeys(messageContent);
		anipetDefs01.CUSendBtn(driver).click();
		Thread.sleep(1500);
		String errorMessage = anipetDefs01.CUErrorMessage(driver).getText();
		anipetDefs01.homePageBtn(driver).click();
		Thread.sleep(500);
		assertEquals(emailErr, errorMessage);
	}
	
	@Test
	public void contactUsBlankPhoneNumber() throws InterruptedException {
		anipetDefs01.homePageBtn(driver).click();
		Thread.sleep(500);
		for (int i = 0; i < anipetDefs01.infoOptions(driver).size(); i++) {
			String optionX = anipetDefs01.infoOptions(driver).get(i).getText();
			if (optionX.equals(contact)) {
				anipetDefs01.infoOptions(driver).get(i).click();
			}else {
				continue;
			}
		}
		Thread.sleep(1000);
		anipetDefs01.CUName(driver).sendKeys(fullName);
		anipetDefs01.CUEmail(driver).sendKeys(email2);
		anipetDefs01.CUMessage(driver).sendKeys(messageContent);
		anipetDefs01.CUSendBtn(driver).click();
		Thread.sleep(1500);
		String errorMessage = anipetDefs01.CUErrorMessage(driver).getText();
		anipetDefs01.homePageBtn(driver).click();
		Thread.sleep(500);
		assertEquals(phoneNumErr, errorMessage);
	}
	
	@Test
	public void numberOfItemsDisplayed() throws InterruptedException {
		anipetDefs01.homePageBtn(driver).click();
		Thread.sleep(500);
		anipetDefs01.mainNavBar(driver).get(2).click();
		Thread.sleep(500);
		anipetDefs01.subCtgry(driver).get(2).click();
		Thread.sleep(500);
		for (int i = 0; i < anipetDefs01.itemsDisplayed(driver).size(); i++) {
			anipetDefs01.pageSize(driver).click();
			String display = anipetDefs01.itemsDisplayed(driver).get(i).getText();
			int displayNum = Integer.parseInt(display);
			anipetDefs01.itemsDisplayed(driver).get(i).click();
			Thread.sleep(500);
			int itemsOnScreen = anipetDefs01.itemsList(driver).size();
			assertEquals(displayNum, itemsOnScreen);
		}
		anipetDefs01.homePageBtn(driver).click();
		Thread.sleep(500);
	}
	
	@Test
	public void socialMediaLinks() throws InterruptedException {
		anipetDefs01.homePageBtn(driver).click();
		Thread.sleep(500);
		anipetDefs01.socialMediaBtnList(driver).get(0).click();
		Thread.sleep(500);
		String fbURL = driver.getCurrentUrl();
		if (fbURL.equals(facebookURL)) {
			System.out.println("Facebook URL - OK");
		}else {
			System.err.println("Facebook URL - NOT OK");
		}
		driver.get(homeURL);
		Thread.sleep(500);
		anipetDefs01.socialMediaBtnList(driver).get(1).click();
		Thread.sleep(500);
		String instaURL = driver.getCurrentUrl();
		if (instaURL.equals(instagramURL)) {
			System.out.println("Instagram URL - OK");
		}else {
			System.err.println("Instagram URL - NOT OK");
		}
		driver.get(homeURL);
		Thread.sleep(500);
	}
	
	@Test
	public void branchPhoneNumber() throws InterruptedException {
		anipetDefs01.homePageBtn(driver).click();
		Thread.sleep(500);
		anipetDefs01.locBranBtn(driver).click();
		Thread.sleep(500);
		int sumErr = 0;
		for (int i = 0; i < anipetDefs01.branchBtns(driver).size(); i++) {
			anipetDefs01.branchBtns(driver).get(i).click();
			Thread.sleep(100);
			String phoneNumX = anipetDefs01.branchPhoneNums(driver).get(i).getText().replace("טלפון:", "").replaceAll("\\s", "");
			if (phoneNumX.equals(homePhoneNum)) {
				continue;
			}else {
				sumErr += 1;
				System.out.println("Branch #" + (i+1) + " phone number is wrong.");
				continue;
			}
		}
		System.out.println("You have " + sumErr + " mistakes.");
		anipetDefs01.mainNavBar(driver).get(0).click();
		Thread.sleep(500);
	}
	
//	@Test
//	public void test() throws InterruptedException {}

}
