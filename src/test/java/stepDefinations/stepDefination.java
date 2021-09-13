package stepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;

import cucumber.api.java.en.*;
import pageObjects.TC1;
import pageObjects.TC2;
import resources.Base;


public class stepDefination extends Base {

	public static Logger log = LogManager.getLogger(Base.class.getName());

	/*
	@Given("^initialize driver$")
	public void initialize_driver() throws Throwable {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		log.info("Driver started");
		log.info("url invoked");

		driver.manage().window().maximize();
	}

	@Given("^user clicks on brand button$")
	public void user_clicks_on_brand_button() throws Throwable {
		TC1 test1 = new TC1(driver);

		test1.BrandBtn().click();
	}

	@Then("^user checks for jw marriot$")
	public void user_checks_for_jw_marriot() throws Throwable {
		TC1 test1 = new TC1(driver);

		if (test1.JWMarriot().isDisplayed()) {
			log.info("jw marriot is visible on screen");
		} else {
			log.error("jw marriot not visible on screen");
		}
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
		driver.quit();
	}

	@Then("^user click on member benefits button$")
	public void user_click_on_member_benefits_button() throws Throwable {
		TC2 test2 = new TC2(driver);

		test2.destination().sendKeys("hyderabad");
		test2.destination().sendKeys(Keys.ENTER);

		test2.FindButton().click();
	}

	@Then("^user verifies text$")
	public void user_verifies_text() throws Throwable {
		TC2 test2 = new TC2(driver);

		test2.destination().sendKeys("hyderabad");
		test2.destination().sendKeys(Keys.ENTER);

		test2.FindButton().click();
		String addressName = test2.Addres().getText();

		if (addressName.contains("Hyderabad")) {
			log.info("hyderabad hotels");
		} else {
			log.error("enter valid location");
		}
	}
	*/
	
	
	
	
	
	
	@Given("^initialize driver$")
    public void initialize_driver() throws Throwable {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		log.info("Driver started");
		log.info("url invoked");

		driver.manage().window().maximize();
    }

    @When("^user click on search and enter \"([^\"]*)\" to search$")
    public void user_click_on_search_and_enter_something_to_search(String location, String strArg1) throws Throwable {
TC2 test2 = new TC2(driver);
		
		test2.destination().sendKeys(location);
		test2.destination().sendKeys(Keys.ENTER);
    }
    
    @Then("^user verifies text$")
    public void user_verifies_text() throws Throwable {
    	TC2 test2 = new TC2(driver);

		String addressName = test2.Addres().getText();

		if (addressName.contains("Hyderabad")) {
			log.info("hyderabad hotels");
		} else {
			log.error("enter valid location");
		}
    }

    @Then("^user checks for jw marriot$")
    public void user_checks_for_jw_marriot() throws Throwable {
    	TC1 test1 = new TC1(driver);

		if (test1.JWMarriot().isDisplayed()) {
			log.info("jw marriot is visible on screen");
		} else {
			log.error("jw marriot not visible on screen");
		}
    }

    @Then("^user click on member benefits button$")
    public void user_click_on_member_benefits_button() throws Throwable {
    	TC2 test2 = new TC2(driver);

		test2.destination().sendKeys("hyderabad");
		test2.destination().sendKeys(Keys.ENTER);

		test2.FindButton().click();
    }

    @Then("^user checks for city validation$")
    public void user_checks_for_city_validation() throws Throwable {
TC2 test2 = new TC2(driver);

		String addressName = test2.Addres().getText();
		
		if(addressName.contains("Hyderabad")) {
			log.info("hyderabad hotels");
		}
		else {
			log.error("enter valid location");
		}
    }

    @And("^user clicks on brand button$")
    public void user_clicks_on_brand_button() throws Throwable {
    	TC1 test1 = new TC1(driver);

		test1.BrandBtn().click();
    }

    @And("^close browser$")
    public void close_browser() throws Throwable {
    	driver.quit();
    }

    /*@And("^user verifies text $")
    public void user_verifies_text() throws Throwable {
    	TC2 test2 = new TC2(driver);

		test2.destination().sendKeys("hyderabad");
		test2.destination().sendKeys(Keys.ENTER);

		test2.FindButton().click();
		String addressName = test2.Addres().getText();

		if (addressName.contains("Hyderabad")) {
			log.info("hyderabad hotels");
		} else {
			log.error("enter valid location");
		}
    }*/

    @And("^click on search button$")
    public void click_on_search_button() throws Throwable {
TC2 test2 = new TC2(driver);
		
		test2.destination().sendKeys("hyderabad");
		test2.destination().sendKeys(Keys.ENTER);
		
		test2.FindButton().click();
    }

}

