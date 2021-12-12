package anipetTests;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tests01 {

	static WebDriver driver;
	static String homeTitle = "אניפט רשת חנויות לחיות מחמד";
	static String homeName = "anipet";
	static String homeURL = "https://www.anipet.co.il/";
	static String homePhoneNum = "1700-5555-03";
	static String fName = "יוסי";
	static String lName = "כהן";
	static String fullName = "וסי כהן";
	static String email = "yossiCohen1717@walla.com";
	static String email2 = "yossillll21822@mailinator.com"; // needs to be changed each 'signUp' run to a new address
	static String pass = "yossi123";
	static String phoneNum = "0581111111";
	static String messageContent = "aaaaaaaaaaaaa";
	static String fNameErr = "אנא הכנס שם פרטי";
	static String lNameErr = "אנא הכנס שם משפחה";
	static String fullNameErr = "אנא הזן שם";
	static String emailErr = "אנא הזן דואר אלקטרוני";
	static String passErr = "אנא הזן סיסמא; שדה אימות הסיסמא לא תואם לסיסמא";
	static String passConfErr = "שדה אימות הסיסמא לא תואם לסיסמא";
	static String wrongDitsErr = "הדואר אלקטרוני או הסיסמא שהזנת לא נכונים. אנא נסה שוב";
	static String phoneNumErr = "אנא הזן מס' טלפון";
	static String persArea = "אזור אישי";
	static String logOut = "התנתק";
	static String exstUser = "User name '" + email2 + "' is already taken."; // email needs to be changed according to 'email2'
	static String srchObject = "קולר";
	static String nextPageSign = "»";
	static String contact = "צור קשר";
	static String totalBuy = "150";
	static String shipCost = "חינם";
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
	public void titleTest() throws InterruptedException {
		anipetDefs01.homePageBtn(driver).click();
		Thread.sleep(200);
		String title = driver.getTitle();
		assertEquals(homeTitle, title);
	}
	
	@Test
	public void homePageBtnTest() throws InterruptedException {
		anipetDefs01.homePageBtn(driver).click();
		Thread.sleep(500);
		for (int i = 0; i < anipetDefs01.mainNavBar(driver).size()-2; i++) {
			anipetDefs01.mainNavBar(driver).get(i).click();
			anipetDefs01.homePageBtn(driver).click();
			String pageURL = driver.getCurrentUrl();
			assertEquals(homeURL, pageURL);
		}
		anipetDefs01.homePageBtn(driver).click();
		Thread.sleep(500);
	}
	
	@Test
	public void signUpBlankFName() throws InterruptedException {
		anipetDefs01.homePageBtn(driver).click();
		Thread.sleep(500);
		anipetDefs01.signUpBtn(driver).click();
		Thread.sleep(2000);
		anipetDefs01.SULName(driver).sendKeys(lName);
		anipetDefs01.SUEmail(driver).sendKeys(email);
		anipetDefs01.SUPass1(driver).sendKeys(pass);
		anipetDefs01.SUPass2(driver).sendKeys(pass);
		anipetDefs01.register(driver).click();
		Thread.sleep(1000);
		String ErrMsg = anipetDefs01.SUErrMsg(driver).getText();
		assertEquals(fNameErr, ErrMsg);
		anipetDefs01.SUXBtn(driver).click();
		Thread.sleep(1000);
	}
	
	@Test
	public void signUpBlankLName() throws InterruptedException {
		anipetDefs01.homePageBtn(driver).click();
		Thread.sleep(500);
		anipetDefs01.signUpBtn(driver).click();
		Thread.sleep(2000);
		anipetDefs01.SUFName(driver).sendKeys(fName);
		anipetDefs01.SUEmail(driver).sendKeys(email);
		anipetDefs01.SUPass1(driver).sendKeys(pass);
		anipetDefs01.SUPass2(driver).sendKeys(pass);
		anipetDefs01.register(driver).click();
		Thread.sleep(1000);
		String ErrMsg = anipetDefs01.SUErrMsg(driver).getText();
		assertEquals(lNameErr, ErrMsg);
		anipetDefs01.SUXBtn(driver).click();
		Thread.sleep(1000);
	}
	
	@Test
	public void signUpBlankEmail() throws InterruptedException {
		anipetDefs01.homePageBtn(driver).click();
		Thread.sleep(500);
		anipetDefs01.signUpBtn(driver).click();
		Thread.sleep(2000);
		anipetDefs01.SUFName(driver).sendKeys(fName);
		anipetDefs01.SULName(driver).sendKeys(lName);
		anipetDefs01.SUPass1(driver).sendKeys(pass);
		anipetDefs01.SUPass2(driver).sendKeys(pass);
		anipetDefs01.register(driver).click();
		Thread.sleep(1000);
		String ErrMsg = anipetDefs01.SUErrMsg(driver).getText();
		assertEquals(emailErr, ErrMsg);
		anipetDefs01.SUXBtn(driver).click();
		Thread.sleep(1000);
	}
	
	@Test
	public void signUpBlankPassword() throws InterruptedException {
		anipetDefs01.homePageBtn(driver).click();
		Thread.sleep(500);
		anipetDefs01.signUpBtn(driver).click();
		Thread.sleep(2000);
		anipetDefs01.SUFName(driver).sendKeys(fName);
		anipetDefs01.SULName(driver).sendKeys(lName);
		anipetDefs01.SUEmail(driver).sendKeys(email);
		anipetDefs01.SUPass2(driver).sendKeys(pass);
		anipetDefs01.register(driver).click();
		Thread.sleep(1000);
		String ErrMsg = anipetDefs01.SUErrMsg(driver).getText();
		assertEquals(passErr, ErrMsg);
		anipetDefs01.SUXBtn(driver).click();
		Thread.sleep(1000);
	}
	
	@Test
	public void signUpBlankConfirmPassword() throws InterruptedException {
		anipetDefs01.homePageBtn(driver).click();
		Thread.sleep(500);
		anipetDefs01.signUpBtn(driver).click();
		Thread.sleep(2000);
		anipetDefs01.SUFName(driver).sendKeys(fName);
		anipetDefs01.SULName(driver).sendKeys(lName);
		anipetDefs01.SUEmail(driver).sendKeys(email);
		anipetDefs01.SUPass1(driver).sendKeys(pass);
		anipetDefs01.register(driver).click();
		Thread.sleep(1000);
		String ErrMsg = anipetDefs01.SUErrMsg(driver).getText();
		assertEquals(passConfErr, ErrMsg);
		anipetDefs01.SUXBtn(driver).click();
		Thread.sleep(1000);
	}
	
	@Test
	public void successfullSignUp() throws InterruptedException {
		anipetDefs01.homePageBtn(driver).click();
		Thread.sleep(500);
		String a = anipetDefs01.signUpBtn(driver).getText();
		String b = anipetDefs01.signInBtn(driver).getText();
		anipetDefs01.signUpBtn(driver).click();
		Thread.sleep(2000);
		anipetDefs01.SUFName(driver).sendKeys(fName);
		anipetDefs01.SULName(driver).sendKeys(lName);
		anipetDefs01.SUEmail(driver).sendKeys(email2);
		anipetDefs01.SUPass1(driver).sendKeys(pass);
		anipetDefs01.SUPass2(driver).sendKeys(pass);
		anipetDefs01.register(driver).click();
		Thread.sleep(1500);
		String c = anipetDefs01.signUpBtn(driver).getText();
		String d = anipetDefs01.signInBtn(driver).getText();
		System.out.println("Before: " + a + "; " + b);
		System.out.println("After: " + c + "; " + d);
		anipetDefs01.signInBtn(driver).click();
		Thread.sleep(500);
	}
	
	@Test
	public void successfullSignUp2() throws InterruptedException {
		anipetDefs01.homePageBtn(driver).click();
		Thread.sleep(500);
		anipetDefs01.signUpBtn(driver).click();
		Thread.sleep(2000);
		anipetDefs01.SUFName(driver).sendKeys(fName);
		anipetDefs01.SULName(driver).sendKeys(lName);
		anipetDefs01.SUEmail(driver).sendKeys(email2);
		anipetDefs01.SUPass1(driver).sendKeys(pass);
		anipetDefs01.SUPass2(driver).sendKeys(pass);
		anipetDefs01.register(driver).click();
		Thread.sleep(1500);
		String errMsg = anipetDefs01.SUErrMsg(driver).getText();
		assertEquals(exstUser, errMsg);
		anipetDefs01.SUXBtn(driver).click();
		Thread.sleep(500);
	}
	
	@Test
	public void signInWrongDetails() throws InterruptedException {
		anipetDefs01.homePageBtn(driver).click();
		Thread.sleep(500);
		anipetDefs01.signInBtn(driver).click();
		Thread.sleep(2000);
		anipetDefs01.SIEmail(driver).sendKeys(email);
		anipetDefs01.SIPass(driver).sendKeys(pass);
		anipetDefs01.SIBtn(driver).click();
		Thread.sleep(1000);
		String ErrMsg = anipetDefs01.SIErrMsg(driver).getText();
		assertEquals(wrongDitsErr, ErrMsg);
		anipetDefs01.SIXBtn(driver).click();
		Thread.sleep(1000);
	}
	
	
	
//	@Test
//	public void test() throws InterruptedException {}

}
