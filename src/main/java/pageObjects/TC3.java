package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC3 {
	
	WebDriver driver;

	By memBenefits = By.cssSelector("a[href='/loyalty/member-benefits.mi']");
	By textassert = By.xpath("//strong[contains(text(),'Mobile Check-In/Services')]");;
	
	public TC3(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement MemberBen() {
		return driver.findElement(memBenefits);
	}
	
	public WebElement textValid() {
		return driver.findElement(textassert);
	}
}
