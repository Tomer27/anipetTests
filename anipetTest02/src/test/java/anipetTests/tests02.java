package anipetTests;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tests02 {

	static WebDriver driver;
	static String homeTitle = "����� ��� ������ ����� ����";
	static String homeName = "anipet";
	static String homeURL = "https://www.anipet.co.il/";
	static String homePhoneNum = "1700-5555-03";
	static String fName = "����";
	static String lName = "���";
	static String fullName = "��� ���";
	static String email = "yossiCohen1717@walla.com";
	static String email2 = "yossillll21822@mailinator.com"; // needs to be changed each 'signUp' run to a new address
	static String pass = "yossi123";
	static String phoneNum = "0581111111";
	static String messageContent = "aaaaaaaaaaaaa";
	static String fNameErr = "��� ���� �� ����";
	static String lNameErr = "��� ���� �� �����";
	static String fullNameErr = "��� ��� ��";
	static String emailErr = "��� ��� ���� ��������";
	static String passErr = "��� ��� �����; ��� ����� ������ �� ���� ������";
	static String passConfErr = "��� ����� ������ �� ���� ������";
	static String wrongDitsErr = "����� �������� �� ������ ����� �� ������. ��� ��� ���";
	static String phoneNumErr = "��� ��� ��' �����";
	static String persArea = "���� ����";
	static String logOut = "�����";
	static String exstUser = "User name '" + email2 + "' is already taken."; // email needs to be changed according to 'email2'
	static String srchObject = "����";
	static String nextPageSign = "�";
	static String contact = "��� ���";
	static String totalBuy = "150";
	static String shipCost = "����";
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
	public void navBarTest() throws InterruptedException {
		anipetDefs01.homePageBtn(driver).click();
		Thread.sleep(500);
		for (int i = 1; i <= anipetDefs01.mainNavBar(driver).size()-4; i++) {
			String optionName = anipetDefs01.mainNavBar(driver).get(i).getText();
			anipetDefs01.mainNavBar(driver).get(i).click();
			Thread.sleep(500);
			if (driver.getTitle().contains(optionName)) {
				System.out.println(optionName + " is OK");
				continue;
			}else {
				System.err.println(optionName + " isn't OK");
				break;
			}
		}
		anipetDefs01.homePageBtn(driver).click();
		Thread.sleep(500);
	}
	
	@Test
	public void subCategoriesTest() throws InterruptedException {
		anipetDefs01.homePageBtn(driver).click();
		Thread.sleep(500);
		for (int i = 2; i < anipetDefs01.mainNavBar(driver).size()-3; i++) {
			anipetDefs01.mainNavBar(driver).get(i).click();
			for (int j = 0; j < anipetDefs01.subCtgry(driver).size(); j++) {
				String subX = anipetDefs01.subCtgry(driver).get(j).getText();
				anipetDefs01.subCtgry(driver).get(j).click();
				Thread.sleep(500);
				String subC = anipetDefs01.subCName(driver).getText();
				if (subX.equals(subC)) {
					anipetDefs01.mainNavBar(driver).get(i).click();
				}else {
					System.out.println(subX + " in " + anipetDefs01.mainNavBar(driver).get(i).getText() + " isn't OK.");
					anipetDefs01.mainNavBar(driver).get(i).click();
				}
			}
		}
		anipetDefs01.homePageBtn(driver).click();
		Thread.sleep(500);
	}
	
	@Test
	public void searchResultsValidation() throws InterruptedException {
		anipetDefs01.homePageBtn(driver).click();
		Thread.sleep(500);
		anipetDefs01.srchFld(driver).sendKeys(srchObject);
		anipetDefs01.srchBtn(driver).click();
		Thread.sleep(500);
		for (int j = 0; j < anipetDefs01.resPages(driver).size()-1; j++) {
			for (int i = 0; i < anipetDefs01.results(driver).size(); i++) {
				String resX = anipetDefs01.results(driver).get(i).getText();
				if (resX.contains(srchObject)) {
					continue;
				}else {
					System.out.println(resX + " isn't relevant to the search");
					break;
				}
			}
			try {
				for (int q = 0; q < anipetDefs01.resPages(driver).size(); q++) {
					String pageX = anipetDefs01.resPages(driver).get(q).getText();
					if (pageX.equals(nextPageSign)) {
						anipetDefs01.resPages(driver).get(q).click();
					}else {
						continue;
					}
				}
			} catch (Exception e) {
				
			}			
		}
		anipetDefs01.homePageBtn(driver).click();
		Thread.sleep(500);
	}
	
	@Test
	public void finalPaymentTest() throws InterruptedException {
		anipetDefs01.homePageBtn(driver).click();
		Thread.sleep(500);
		anipetDefs01.mainNavBar(driver).get(1).click();
		Thread.sleep(100);
		anipetDefs01.dogDisc(driver).click();
		Thread.sleep(100);
		int sumBuy = 0;
		for (int i = 0; i < 3; i++) {
			String priceStr = anipetDefs01.itemsListPrices(driver).get(i).getText().replace("�", "");
			int price = Integer.parseInt(priceStr);
			sumBuy += price;
		}
		System.out.println("Expected sum of the first 3 items: " + sumBuy + "�");
		for (int i = 0; i < 3; i++) {
			anipetDefs01.add2CartBtns(driver).get(i).click();
			Thread.sleep(1200);
			anipetDefs01.cartXBtn(driver).click();
			Thread.sleep(1200);
		}
		Thread.sleep(1000);
		anipetDefs01.mainNavBar(driver).get(8).click();
		Thread.sleep(2000);
		String totalPayStr = anipetDefs01.totalPayment(driver).getText().replace("�", "").replace(".00", "");
		int totalPay = Integer.parseInt(totalPayStr);
		System.out.println("Actual sum of the first 3 items: " + totalPay + "�");
		anipetDefs01.cartXBtn(driver).click();
		Thread.sleep(1000);
		anipetDefs01.homePageBtn(driver).click();
		assertEquals(sumBuy, totalPay);
		Thread.sleep(500);
	}
	
//	@Test
//	public void test() throws InterruptedException {}

}
