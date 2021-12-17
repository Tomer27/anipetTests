package anipetTests;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tests06 {

	static WebDriver driver;
	static String homeURL = "https://www.anipet.co.il/";
	static String gallery = "גלריית תמונות";
	static String freeShippingColor1 = "rgba(156, 194, 83, 1)"; // green
	static String freeShippingColor2 = "rgba(224, 81, 67, 1)"; // red
	static String footerColor = "rgba(237, 242, 239, 1)"; // light grey
	static String topOptsColor = "rgba(0, 0, 0, 0)"; // white
	static int topOptsHeight = 41;
	static int picHeight = 160;
	static int picWidth = 160;
	static int homePageBtnX = 934;
	static int homePageBtnY = 24;
	static int topOptionsBarX = 189;
	static int topOptionsBarY = 93;
	static int mainNavBarX = 174;
	static int mainNavBarY = 142;
	static int freeShipX = 0;
	static int freeShipY = 248;
	static int searchFieldX = 246;
	static int searchFieldY = 36;
	
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
	public void HeightAndWidthOfPicsInGallery() throws InterruptedException {
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
	
	@Test
	public void HomePageCss() throws InterruptedException {
		int hErr = 0;
		int cErr = 0;
		for (int i = 0; i < anipetDefs01.topBar(driver).size(); i++) {
			String colorX = anipetDefs01.topBar(driver).get(i).getCssValue("background-color");
			int h = anipetDefs01.topBar(driver).get(i).getSize().getHeight();
			if (colorX.equals(topOptsColor) && h == topOptsHeight) {
				continue;
			}else if (colorX.equals(topOptsColor) && h != topOptsHeight) {
				cErr += 1;
				System.out.println("Top option #" + (i+1) + " color is GOOD, height is BAD");
				continue;
			}else if (h == topOptsHeight && !colorX.equals(topOptsColor)) {
				hErr += 1;
				System.out.println("Top option #" + (i+1) + " color is BAD, height is GOOD");
				continue;
			}else {
				cErr += 1;
				hErr += 1;
				System.out.println("Top option #" + (i+1) + " color and height are BAD");
				continue;
			}
		}
		System.out.println("Top options bar Height errors: " + hErr);
		System.out.println("Top options bar Color errors: " + cErr);
		System.out.println("---------------------------------");
		String FSColor1 = anipetDefs01.freeShippingDiv1(driver).getCssValue("background-color");
		String FSColor2 = anipetDefs01.freeShippingDiv2(driver).getCssValue("background-color");
		String ftrColor = anipetDefs01.homeFooter(driver).getCssValue("background-color");
		assertEquals(freeShippingColor1, FSColor1);
		assertEquals(freeShippingColor2, FSColor2);
		assertEquals(footerColor, ftrColor);
		Thread.sleep(500);
	}
	
	@Test
	public void homePageBtnsLocations() throws InterruptedException {
		Point HPBPoint = anipetDefs01.homePageBtn(driver).getLocation();
		int HPBX = HPBPoint.getX();
		int HPBY = HPBPoint.getY();
		if (HPBX == homePageBtnX && HPBY == homePageBtnY) {
			System.out.println("Home page button's X & Y points are GOOD");
		}else if (HPBX == homePageBtnX && HPBY != homePageBtnY) {
			System.out.println("Home page button's Y point is BAD");
		}else if (HPBX != homePageBtnX && HPBY == homePageBtnY) {
			System.out.println("Home page button's X point is BAD");
		}else {
			System.out.println("Home page button's X & Y points are BAD");
		}
		
		Point TOBPoint = anipetDefs01.topBarDiv(driver).getLocation();
		int TOBX = TOBPoint.getX();
		int TOBY = TOBPoint.getY();
		if (TOBX == topOptionsBarX && TOBY == topOptionsBarY) {
			System.out.println("Top options bar X & Y points are GOOD");
		}else if (TOBX == topOptionsBarX && TOBY != topOptionsBarY) {
			System.out.println("Top options bar Y point is BAD");
		}else if (TOBX != topOptionsBarX && TOBY == topOptionsBarY) {
			System.out.println("Top options bar X point is BAD");
		}else {
			System.out.println("Top options bar X & Y points are BAD");
		}
		
		Point MNBPoint = anipetDefs01.mainNavBarDiv(driver).getLocation();
		int MNBX = MNBPoint.getX();
		int MNBY = MNBPoint.getY();
		if (MNBX == mainNavBarX && MNBY == mainNavBarY) {
			System.out.println("Main nav bar X & Y points are GOOD");
		}else if (MNBX == mainNavBarX && MNBY != mainNavBarY) {
			System.out.println("Main nav bar Y point is BAD");
		}else if (MNBX != mainNavBarX && MNBY == mainNavBarY) {
			System.out.println("Main nav bar X point is BAD");
		}else {
			System.out.println("Main nav bar X & Y points are BAD");
		}
		
		Point FSPoint = anipetDefs01.freeShippingDiv1(driver).getLocation();
		int FSX = FSPoint.getX();
		int FSY = FSPoint.getY();
		if (FSX == freeShipX && FSY == freeShipY) {
			System.out.println("Free shipping div X & Y points are GOOD");
		}else if (FSX == freeShipX && FSY != freeShipY) {
			System.out.println("Free shipping div Y point is BAD");
		}else if (FSX != freeShipX && FSY == freeShipY) {
			System.out.println("Free shipping div X point is BAD");
		}else {
			System.out.println("Free shipping div X & Y points are BAD");
		}
		
		Point SFPoint = anipetDefs01.srchFld(driver).getLocation();
		int SFX = SFPoint.getX();
		int SFY = SFPoint.getY();
		if (SFX == searchFieldX && SFY == searchFieldY) {
			System.out.println("Search field X & Y points are GOOD");
		}else if (SFX == searchFieldX && SFY != searchFieldY) {
			System.out.println("Search field Y point is BAD");
		}else if (SFX != searchFieldX && SFY == searchFieldY) {
			System.out.println("Search field X point is BAD");
		}else {
			System.out.println("Search field X & Y points are BAD");
		}
		
		System.out.println("---------------------------------");
		Thread.sleep(500);
		
	}
	
	
}
