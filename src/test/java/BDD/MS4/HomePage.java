package BDD.MS4;


import java.io.IOException;

import org.apache.logging.log4j.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.*;

import junit.framework.Assert;
import pageObjects.TC1;
import pageObjects.TC2;
import pageObjects.TC3;
import resources.Base;

public class HomePage extends Base{

	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void before() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		log.info("Driver started");
		log.info("url invoked");
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void testCase1() {
		TC1 test1 = new TC1(driver);
		
		test1.BrandBtn().click();
		if(test1.JWMarriot().isDisplayed()) {
			log.info("jw marriot is visible on screen");
		}
		else
		{
			log.error("jw marriot not visible on screen");
		}
		
	}
	
	@Test
	public void testCase2() 
	{
		TC2 test2 = new TC2(driver);
		
		test2.destination().sendKeys("hyderabad");
		test2.destination().sendKeys(Keys.ENTER);
		
		test2.FindButton().click();
		String addressName = test2.Addres().getText();
		
		if(addressName.contains("Hyderabad")) {
			log.info("hyderabad hotels");
		}
		else {
			log.error("enter valid location");
		}
	}
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCase3() {
		TC3 test3 = new TC3(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)","");
		
		test3.MemberBen().click();
		js.executeScript("window.scrollBy(0,300)","");
		
		String keyValue = test3.textValid().getText();
		
		if(keyValue.contains("Mobile Check-In and Mobile Key")) {
			log.info("assertion successful");
		}
		else {
			log.error("assertion failed");
		}
	}
}
