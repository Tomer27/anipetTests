package anipetTests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tests06 {

	static WebDriver driver;
	static String homeURL = "https://www.anipet.co.il/";
	static String gallery = "גלריית תמונות";
	static int picHeight = 160;
	static int picWidth = 160;
	
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
	public void test() throws InterruptedException {
		int sumHErr = 0;
		int sumWErr = 0;
		for (int i = 0; i < anipetDefs01.infoOptions(driver).size(); i++) {
			String infoX = anipetDefs01.infoOptions(driver).get(i).getText();
			if (infoX.equals(gallery)) {
				anipetDefs01.infoOptions(driver).get(i).click();
			}else {
				continue;
			}
		}
		System.out.println("Height & width of pictures in the gallery test:");
		Thread.sleep(500);
		for (int i = 0; i < anipetDefs01.pics(driver).size(); i++) {			
			int h = anipetDefs01.pics(driver).get(i).getSize().getHeight();
			int w = anipetDefs01.pics(driver).get(i).getSize().getWidth();
			if (h == picHeight) {
				if (w == picWidth) {
					continue;
				}else {
					sumWErr += 1;
					System.out.println("Picture #" + (i+1) + " is in width " + w);
				}
			}else {
				sumHErr += 1;
				System.out.println("Picture #" + (i+1) + " is in height " + h);
			}		
		}
		anipetDefs01.homePageBtn(driver).click();		
		System.out.println("Total height errors: " + sumHErr);
		System.out.println("Total width errors: " + sumWErr);
		System.out.println("---------------------------------");
	}
	
	
}
