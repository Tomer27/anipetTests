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
	static String fName = "יוסי";
	static String lName = "כהן";
	static String email = "yossiCohen1717@walla.com";
	static String email2 = "yossilsll2122@mailinator.com"; // needs to be changed each run to a new address
	static String pass = "yossi123";
	static String fNameErr = "אנא הכנס שם פרטי";
	static String lNameErr = "אנא הכנס שם משפחה";
	static String emailErr = "אנא הזן דואר אלקטרוני";
	static String passErr = "אנא הזן סיסמא; שדה אימות הסיסמא לא תואם לסיסמא";
	static String passConfErr = "שדה אימות הסיסמא לא תואם לסיסמא";
	static String wrongDitsErr = "הדואר אלקטרוני או הסיסמא שהזנת לא נכונים. אנא נסה שוב";
	static String persArea = "אזור אישי";
	static String logOut = "התנתק";
	static String exstUser = "User name '" + email2 + "' is already taken."; // email needs to be changed according to 'email2'
	static String srchObject = "קולר";
	static String nextPageSign = "»";
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tomer\\Desktop\\Selenium\\chromeVer95//chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.anipet.co.il/");
		Thread.sleep(500);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@org.junit.jupiter.api.Tag("title")
	@Test
	public void titleTest() {
		String title = driver.getTitle();
		assertEquals(homeTitle, title);
	}
	
	
	
//	@Test
//	public void test() {
//		
//	}

}
