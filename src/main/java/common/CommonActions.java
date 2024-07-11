package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import static common.Config.PLATFORM_AND_BROWSER;
import static constants.Constant.TimeoutVariable.IMPLICIT_WAIT;

import java.util.concurrent.TimeUnit;

public class CommonActions {
	public static WebDriver createDriver(){
		WebDriver driver = null;
		
		switch (PLATFORM_AND_BROWSER) {
		   case "win_chrome":
			   System.setProperty("webdriver.chrome.driver", "C://driver//chromedriver.exe");
			   driver = new ChromeDriver();
			   break;
		default:
			Assert.fail("Incorrect platform or browser name: " + PLATFORM_AND_BROWSER);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
		return driver;
	}

}
