package MT.searchapartment;

import MT.base.BaseTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static constants.Constant.Urls.REALT_HOME_PAGE;

public class SearchApartmentTest extends BaseTest {
	
	@Test
	public void checkIsredirectToListing () {
		basePage.open(REALT_HOME_PAGE);
		
		 driver.findElement(By.xpath("//div[contains(@class, 'p-12')]//div[@role='button']")).click();
		 driver.findElement(By.xpath("//span[text()='Отклонить']")).click();
		 
		realtHomePage
		         .enterCountRooms()
		         .clickToFind();
		
		realtListingPage.checkCountCards();
	}

}
