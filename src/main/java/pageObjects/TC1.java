package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC1 {
	
	public WebDriver driver;
	
	By brandBtn =By.xpath("//*[@id=\"MainNavLink3f7d\"]");
	By jw = By.xpath("//*[@id=\"CardLinks5d31\"]/div[1]/ul/li[6]");
	
	
	
	public TC1(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement BrandBtn() {
		return driver.findElement(brandBtn);
	}
	
	public WebElement JWMarriot() {
		return driver.findElement(jw);
	}

}
