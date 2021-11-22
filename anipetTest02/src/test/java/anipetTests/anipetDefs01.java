package anipetTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class anipetDefs01 {
static WebDriver driver;
	
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
	
	// search field @ home pages
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
	
	// list of branches @ branches screen
	static public List<WebElement> branches(WebDriver driver) {
		List<WebElement> branches = driver.findElements(By.xpath("//*[@id=\"mainapp\"]/div[6]/div/div[2]/div[2]/div/div/div[1]/div[2]/ul/child::li"));
		return branches;
	}
	
	// list of branches addresses inside each branch button @ branches screen
	static public List<WebElement> branchAdrss1(WebDriver driver) {
		List<WebElement> branchAdrss1 = driver.findElements(By.xpath("//*[@id=\"mainapp\"]/div[6]/div/div[2]/div[2]/div/div/div[1]/div[2]/ul/child::li/div[2]/p"));
		return branchAdrss1;
	}
	
	// iframe of the map @ branches screen
	static public WebElement mapFrame(WebDriver driver) {
		WebElement mapFrame = driver.findElement(By.id("gmaps"));
		return mapFrame;
	}
	
	// branch address on the map @ branches screen
	static public WebElement address1(WebDriver driver) {
		WebElement address1 = driver.findElement(By.xpath("//*[@id=\"mapDiv\"]/div/div/div[4]/div/div/div/div/div[1]/div[2]"));
		return address1;
	}
	
}
