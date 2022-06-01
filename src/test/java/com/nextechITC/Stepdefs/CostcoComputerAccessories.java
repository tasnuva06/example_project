package com.nextechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechITC.PageobjectModel.CostcoComputerAccessoriesPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CostcoComputerAccessories {

	WebDriver driver;
	
	@Given("^user visit costco homepage$")
	public void user_visit_costco_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    driver.get("https://www.costco.com");
	    driver.manage().window().maximize();
	    
	}

	@When("^user hovers over shop and click on computers$")
	public void user_hovers_over_shop_and_click_on_computers() throws Throwable {
	    Actions act= new Actions(driver);
	    CostcoComputerAccessoriesPOM CA = new CostcoComputerAccessoriesPOM (driver);
	    act.moveToElement(CA.shop()).build().perform();
	    Thread.sleep(3000);
	    
	    CostcoComputerAccessoriesPOM com =new CostcoComputerAccessoriesPOM(driver);
	    com.computers().click();
	}

	@Then("^user will be redirected successfully$")
	public void user_will_be_redirected_successfully() throws Throwable {
	    
	}


	
}
