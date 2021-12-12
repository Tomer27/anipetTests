package anipetTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class anipetDefs01 {
static WebDriver driver;
	
	// home page button @ every page
	static public WebElement homePageBtn(WebDriver driver) {
		 WebElement homePageBtn = driver.findElement(By.xpath("//*[@id=\"mainapp\"]/div[2]/div[2]/div[1]/div/div[1]/a/img"));
		 return homePageBtn;
	}
	
	// sign up button @ home page
	static public WebElement signUpBtn(WebDriver driver) {
		WebElement signUpBtn = driver.findElement(By.xpath("//*[@id=\"mainapp\"]/div[2]/div[2]/div[1]/div/div[2]/div/ul/li[2]/a"));
		return signUpBtn;
	}
	
	// sign in button @ home page
	static public WebElement signInBtn(WebDriver driver) {
		WebElement signInBtn = driver.findElement(By.xpath("//*[@id=\"mainapp\"]/div[2]/div[2]/div[1]/div/div[2]/div/ul/li[3]/a"));
		return signInBtn;
	}
	
	// search field @ home page
	static public WebElement srchFld(WebDriver driver) {
		WebElement srchFld = driver.findElement(By.xpath("//*[@id=\"searchform\"]/input"));
		return srchFld;
	}
	
	// search button @ home page
	static public WebElement srchBtn(WebDriver driver) {
		WebElement srchBtn = driver.findElement(By.xpath("//*[@id=\"searchform\"]/button"));
		return srchBtn;
	}
	
	// locate branch button @ home page
	static public WebElement locBranBtn(WebDriver driver) {
		WebElement locBranBtn = driver.findElement(By.xpath("//*[@id=\"mainapp\"]/div[2]/div[2]/div[1]/div/div[2]/div/ul/li[4]/a"));
		return locBranBtn;
	}
	
	// navigation bar @ home page
	static public List<WebElement> mainNavBar(WebDriver driver) {
		List<WebElement> mainNavBar = driver.findElements(By.xpath("//*[@id=\"mainapp\"]/div[2]/div[2]/div[2]/div/div/ul/child::li"));
		return mainNavBar;
	}
	
	// free shipping check button @ home page
	static public WebElement freeShippingBtn(WebDriver driver) {
		WebElement freeShippingBtn = driver.findElement(By.xpath("//*[@id=\"mainapp\"]/div[4]/div/a"));
		return freeShippingBtn;
	}
	
	// list of brand links @ home page
	static public List<WebElement> brandUrls(WebDriver driver) {
		List<WebElement> brandUrls = driver.findElements(By.xpath("//*[@id=\"mainapp\"]/div[8]/div[2]/div/ul/child::li/a"));
		return brandUrls;
	}
	// list of brand names @ home page
	static public List<WebElement> brandNames(WebDriver driver) {
		List<WebElement> brandNames = driver.findElements(By.xpath("//*[@id=\"mainapp\"]/div[8]/div[2]/div/ul/child::li/a/small"));
		return brandNames;
	}
	
	// list of brand results @ brand results page
	static public List<WebElement> brandRes(WebDriver driver) {
		List<WebElement> brandRes = driver.findElements(By.xpath("//*[@id=\"mainapp\"]/div[6]/div/div[2]/div[2]/if/div/div/div[3]/child::div/div/div/a[1]"));
		return brandRes;
	}
	
	// list of URLs under 'Info' @ bottom of the home page
	static public List<WebElement> infoOptions(WebDriver driver) {
		List<WebElement> infoOptions = driver.findElements(By.xpath("//*[@id=\"secondfooterlist\"]/ul/child::li/a"));
		return infoOptions;
	}
	
	// list of social media links @ bottom of the home page
	static public List<WebElement> socialMediaBtnList(WebDriver driver) {
		List<WebElement> socialMediaBtnList = driver.findElements(By.xpath("//*[@id=\"mainapp\"]/div[9]/footer/div/section[4]/ul/li[2]/child::a"));
		return socialMediaBtnList;
	}
	
	// first name field @ sign up window
	static public WebElement SUFName(WebDriver driver) {
		WebElement SUFName = driver.findElement(By.id("FirstName"));
		return SUFName;
	}
	
	// last name field @ sign up window
	static public WebElement SULName(WebDriver driver) {
		WebElement SULName = driver.findElement(By.id("LastName"));
		return SULName;
	}
	
	// email field @ sign up window
	static public WebElement SUEmail(WebDriver driver) {
		WebElement SUEmail = driver.findElement(By.id("Email"));
		return SUEmail;
	}
	
	// password field @ sign up window
	static public WebElement SUPass1(WebDriver driver) {
		WebElement SUPass1 = driver.findElement(By.id("Password"));
		return SUPass1;
	}
	
	// confirm password field @ sign up window
	static public WebElement SUPass2(WebDriver driver) {
		WebElement SUPass2 = driver.findElement(By.id("ConfirmPassword"));
		return SUPass2;
	}
	
	// sign up button @ sign up window
	static public WebElement register(WebDriver driver) {
		WebElement register = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/button[1]"));
		return register;
	}
	
	// error message @ sign up window
	static public WebElement SUErrMsg(WebDriver driver) {
		WebElement SUErrMsg = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/div[1]"));
		return SUErrMsg;
	}
	
	// X button @ sign up window
	static public WebElement SUXBtn(WebDriver driver) {
		WebElement SUXBtn = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[2]/button"));
		return SUXBtn;
	}
	
	// email field @ sign in window
	static public WebElement SIEmail(WebDriver driver) {
		WebElement SIEmail = driver.findElement(By.id("Email"));
		return SIEmail;
	}
	
	// password field @ sign in window
	static public WebElement SIPass(WebDriver driver) {
		WebElement SIPass = driver.findElement(By.id("Password"));
		return SIPass;
	}
	
	// sign in button @ sign in window
	static public WebElement SIBtn(WebDriver driver) {
		WebElement SIBtn = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/button[1]"));
		return SIBtn;
	}
	
	// error message @ sign in window
	static public WebElement SIErrMsg(WebDriver driver) {
		WebElement SIErrMsg = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/div[1]"));
		return SIErrMsg;
	}
	
	// X button @ sign in window
	static public WebElement SIXBtn(WebDriver driver) {
		WebElement SIXBtn = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[2]/button"));
		return SIXBtn;
	}
	
	// sub-categories list @ random pet's screen
	static public List<WebElement> subCtgry(WebDriver driver) {
		List<WebElement> subCtgry = driver.findElements(By.xpath("//*[@id=\"mainapp\"]/div[6]/div/div[2]/div[2]/if/div/div/section/div/child::div/a"));
		return subCtgry;
	}
	
	// sub-category name @ sub-category screen
	static public WebElement subCName(WebDriver driver) {
		WebElement subCName = driver.findElement(By.xpath("//*[@id=\"mainapp\"]/div[6]/div/div[2]/div[2]/if/div/div/h1"));
		return subCName;
	}
	
	// list of search results @ search results screen
	static public List<WebElement> results(WebDriver driver) {
		List<WebElement> results = driver.findElements(By.xpath("//*[@id=\"mainapp\"]/div[6]/div/div[2]/div[2]/if/div/div/div[3]/child::div/div/div/a[1]/h5"));
		return results;
	}
	
	// list of page buttons @ search results screen
	static public List<WebElement> resPages(WebDriver driver) {
		List<WebElement> resPages = driver.findElements(By.xpath("//*[@id=\"mainapp\"]/div[6]/div/div[2]/div[2]/if/div/div/nav/ul/child::li/a"));
		return resPages;
	}
	
	// dog discount button @ discounts screen
	static public WebElement dogDisc(WebDriver driver) {
		WebElement dogDisc = driver.findElement(By.xpath("//*[@id=\"mainapp\"]/div[6]/div/div[2]/div[2]/if/div/div/section/div/div[1]/a"));
		return dogDisc;
	}
	
	// list of the item's prices @ dog discounts screen
	static public List<WebElement> itemsListPrices(WebDriver driver) {
		List<WebElement> itemsListPrices = driver.findElements(By.xpath("//*[@id=\"mainapp\"]/div[6]/div/div[2]/div[2]/if/div/div/div[3]/child::div/div/div/div/div/h4"));
		return itemsListPrices;
	}
	
	// list of 'add to cart' buttons @ dog discounts screen
	static public List<WebElement> add2CartBtns(WebDriver driver) {
		List<WebElement> add2CartBtns = driver.findElements(By.xpath("//*[@id=\"mainapp\"]/div[6]/div/div[2]/div[2]/if/div/div/div[3]/child::div/div/div/div/div[2]/a"));
		return add2CartBtns;
	}
	
	// X button @ side cart
	static public WebElement cartXBtn(WebDriver driver) {
		WebElement cartXBtn = driver.findElement(By.xpath("//*[@id=\"mainapp\"]/div[3]/div[2]/div[2]/button"));
		return cartXBtn;
	}
	
	// total payment @ side cart
	static public WebElement totalPayment(WebDriver driver) {
		WebElement totalPayment = driver.findElement(By.xpath("//*[@id=\"mainapp\"]/div[3]/div[2]/div[5]/div[3]/div[2]"));
		return totalPayment;
	}
	
	// list of remove item buttons @ side cart
	static public List<WebElement> removeItemBtns(WebDriver driver) {
		List<WebElement> removeItemBtns = driver.findElements(By.xpath("//*[@id=\"mainapp\"]/div[3]/div[2]/div[4]/ul/child::li/div[1]/button"));
		return removeItemBtns;
	}
	
	// list of item prices @ side cart
	static public List<WebElement> pricesInCart(WebDriver driver) {
		List<WebElement> pricesInCart = driver.findElements(By.xpath("//*[@id=\"mainapp\"]/div[3]/div[2]/div[4]/ul/child::li/div[2]/div/div[2]/span"));
		return pricesInCart;
	}
	
	// name field @ contact us screen
	static public WebElement CUName(WebDriver driver) {
		WebElement CUName = driver.findElement(By.id("Name"));
		return CUName;
	}
	
	// email field @ contact us screen
	static public WebElement CUEmail(WebDriver driver) {
		WebElement CUEmail = driver.findElement(By.id("Email"));
		return CUEmail;
	}
	
	// phone number field @ contact us screen
	static public WebElement CUPhone(WebDriver driver) {
		WebElement CUPhone = driver.findElement(By.id("Phone"));
		return CUPhone;
	}
	
	// message field @ contact us screen
	static public WebElement CUMessage(WebDriver driver) {
		WebElement CUMessage = driver.findElement(By.id("Message"));
		return CUMessage;
	}
	
	// send button @ contact us screen
	static public WebElement CUSendBtn(WebDriver driver) {
		WebElement CUSendBtn = driver.findElement(By.xpath("//*[@id=\"mainapp\"]/div[6]/div/div[2]/div[2]/div[1]/form/div[2]/button"));
		return CUSendBtn;
	}
	
	// error message @ contact us screen
	static public WebElement CUErrorMessage(WebDriver driver) {
		WebElement CUErrorMessage = driver.findElement(By.xpath("//*[@id=\"mainapp\"]/div[6]/div/div[2]/div[2]/div[1]/form/div[1]"));
		return CUErrorMessage;
	}
	
	// list of items displayed @ random category screen
	static public List<WebElement> itemsList(WebDriver driver) {
		List<WebElement> itemsList = driver.findElements(By.xpath("//*[@id=\"mainapp\"]/div[6]/div/div[2]/div[2]/if/div/div/div[3]/child::div"));
		return itemsList;
	}
	
	// list of how many items to display @ random category screen
	static public List<WebElement> itemsDisplayed(WebDriver driver) {
		List<WebElement> itemsDisplayed = driver.findElements(By.xpath("//*[@id=\"PageSizeSelect\"]/child::option"));
		return itemsDisplayed;
	}
	
	// page size select button @ random category screen
	static public WebElement pageSize(WebDriver driver) {
		WebElement pageSize = driver.findElement(By.id("PageSizeSelect"));
		return pageSize;
	}
	
	// choose city button @ free shipping check screen
	static public WebElement FSPickCity(WebDriver driver) {
		WebElement FSPickCity = driver.findElement(By.id("city-select"));
		return FSPickCity;
	}
	
	// cities list @ free shipping check screen
	static public List<WebElement> FSCitiesList(WebDriver driver) {
		List<WebElement> FSCitiesList = driver.findElements(By.xpath("//*[@id=\"city-select\"]/child::option"));
		return FSCitiesList;
	}
	
	// sum of buy field @ free shipping check screen
	static public WebElement FSSumPay(WebDriver driver) {
		WebElement FSSumPay = driver.findElement(By.xpath("//*[@id=\"mainapp\"]/div[6]/div/div[2]/div[2]/div[2]/div[2]/input"));
		return FSSumPay;
	}
	
	// check free shipping button @ free shipping check screen
	static public WebElement FSFreeCheckBtn(WebDriver driver) {
		WebElement FSFreeCheckBtn = driver.findElement(By.id("chkBtn"));
		return FSFreeCheckBtn;
	}
	
	// cost of shipment field @ free shipping check screen
	static public WebElement FSShipCost(WebDriver driver) {
		WebElement FSShipCost = driver.findElement(By.xpath("//*[@id=\"mainapp\"]/div[6]/div/div[2]/div[2]/div[2]/div[4]/input"));
		return FSShipCost;
	}
	
	// list of buttons for branches @ branches screen
	static public List<WebElement> branchBtns(WebDriver driver) {
		List<WebElement> branchBtns = driver.findElements(By.xpath("//*[@id=\"mainapp\"]/div[6]/div/div[2]/div[2]/div/div/div[1]/div[2]/ul/child::li"));
		return branchBtns;
	}
	
	static public List<WebElement> branchPhoneNums(WebDriver driver) {
		List<WebElement> branchPhoneNums = driver.findElements(By.xpath("//*[@id=\"mainapp\"]/div[6]/div/div[2]/div[2]/div/div/div[1]/div[2]/ul/child::li/div[2]/div/div[1]"));
		return branchPhoneNums;
	}
	
}
