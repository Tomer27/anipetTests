package anipetTests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tests05Brands {

	static WebDriver driver;
	static String homeURL = "https://www.anipet.co.il/";

	
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
	public void brandLinks() throws InterruptedException {
		for (int i = 0; i < anipetDefs01.brandUrls(driver).size(); i++) {
			String nameX = anipetDefs01.brandNames(driver).get(i).getText();
			try {
				anipetDefs01.brandUrls(driver).get(i).click();
				System.out.println("Clicked on " + nameX);
				Thread.sleep(1000);
			}catch (Exception e) {
				System.err.println("Problen with clicking on " + nameX);
			}			
			try {
				for (int j = 0; j < anipetDefs01.brandRes(driver).size(); j++) {
					String resNameX = anipetDefs01.brandRes(driver).get(j).getAttribute("text");
					if (resNameX.contains(nameX)) {
						continue;
					}else {
						System.err.println("Check result #" + (j+1) + " in brand name - " + nameX);
						continue;
					}
				}
				System.out.println("Finished with " + nameX);
			} catch (Exception e) {
				
			}			
			driver.get(homeURL);
			Thread.sleep(500);			
		}
	}

}
