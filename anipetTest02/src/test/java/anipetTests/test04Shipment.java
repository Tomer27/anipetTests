package anipetTests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test04Shipment {

	static WebDriver driver;
	static String homeURL = "https://www.anipet.co.il/";
	static String totalBuy = "150";
	static String shipCost = "çéðí";
	
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
	public void freeShipmentAbove150() throws InterruptedException {
		anipetDefs01.freeShippingBtn(driver).click();
		Thread.sleep(500);
		int failSum = 0;
		for (int i = 1; i < anipetDefs01.FSCitiesList(driver).size(); i++) {
			anipetDefs01.FSPickCity(driver).click();
			String cityX = anipetDefs01.FSCitiesList(driver).get(i).getText();
			anipetDefs01.FSCitiesList(driver).get(i).click();
			anipetDefs01.FSSumPay(driver).clear();
			anipetDefs01.FSSumPay(driver).sendKeys(totalBuy);
			anipetDefs01.FSFreeCheckBtn(driver).click();
			Thread.sleep(1000);
			String shipCostX = anipetDefs01.FSShipCost(driver).getAttribute("value");
			if (shipCostX.equals(shipCost)) {
				continue;
			}else {
				System.out.println(i + ". " + cityX + " doesn't have free shipping for order of 150¤");
				failSum += 1;
				continue;
			}
		}
		int cities = anipetDefs01.FSCitiesList(driver).size();
		System.out.println(failSum + " fails out of " + cities);
	}

}
