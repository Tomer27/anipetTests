package anipetTests;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tests01 {

	static WebDriver driver;
	static String homeTitle = "����� ��� ������ ����� ����";
	static String fName = "����";
	static String lName = "���";
	static String email = "yossiCohen1717@walla.com";
	static String email2 = "yossilsll2122@mailinator.com"; // needs to be changed each run to a new address
	static String pass = "yossi123";
	static String fNameErr = "��� ���� �� ����";
	static String lNameErr = "��� ���� �� �����";
	static String emailErr = "��� ��� ���� ��������";
	static String passErr = "��� ��� �����; ��� ����� ������ �� ���� ������";
	static String passConfErr = "��� ����� ������ �� ���� ������";
	static String wrongDitsErr = "����� �������� �� ������ ����� �� ������. ��� ��� ���";
	static String persArea = "���� ����";
	static String logOut = "�����";
	static String exstUser = "User name '" + email2 + "' is already taken."; // email needs to be changed according to 'email2'
	static String srchObject = "����";
	static String nextPageSign = "�";
	
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
