package pages.realt_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.base.BasePage;

public class RealtHomePage extends BasePage {
	
	public RealtHomePage(WebDriver driver) {
		super(driver);
	}
	
	private final By countRooms = By.xpath("//span[text()='Кол-во комнат']");
	private final By option2rooms = By.xpath("//div[text()='2к квартира']");
	private final By findBtn = By.xpath("//span[text()='Найти']");
	
	public RealtHomePage enterCountRooms(){
		driver.findElement(countRooms).click();
		driver.findElement(option2rooms).click();
		
		return this;
	}
	
	public RealtHomePage clickToFind (){
		WebElement btnFind = driver.findElement(findBtn);
		waitElementIsVisible(btnFind).click();
		
		return this;
	}
	

}
