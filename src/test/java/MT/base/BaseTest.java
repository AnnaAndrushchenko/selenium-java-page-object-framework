package MT.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import common.CommonActions;
import pages.base.BasePage;
import pages.listing.RealtListingPage;
import pages.realt_home.RealtHomePage;

import static common.Config.CLEAR_COOKIES_AND_STORAGE;
import static common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {
	protected WebDriver driver = CommonActions.createDriver();
	protected BasePage basePage = new BasePage(driver);
	protected RealtHomePage realtHomePage = new RealtHomePage(driver);
	protected RealtListingPage realtListingPage = new RealtListingPage (driver);
	
	@AfterTest
	public void clearCookiesAndLocalStorage(){
		if (CLEAR_COOKIES_AND_STORAGE) {
			JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
			driver.manage().deleteAllCookies();
			javascriptExecutor.executeScript("window.sessionStorage.clear()");
		}
	}
	
	@AfterSuite (alwaysRun = true) 
	public void close() {
		if (HOLD_BROWSER_OPEN) {
			driver.quit();
		}
	}

}
