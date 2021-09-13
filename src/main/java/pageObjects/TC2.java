package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC2 {

	WebDriver driver;
	
	By dest = By.id("I6PTSVNM_search-location");
	By findBtn = By.xpath("//*[@id=\"find-a-hotel-homePage-form\"]/div[2]/div[6]/button");
	By address = By.xpath("//*[@id=\"property-record-map-HYDMC\"]/div/div[1]/div[2]/div[2]/div");
	
	public TC2(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement destination() {
		return driver.findElement(dest);
	}
	
	public WebElement FindButton() {
		return driver.findElement(findBtn);
	}
	
	public WebElement Addres() {
		return driver.findElement(address);
	}
	

}
