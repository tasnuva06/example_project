package com.nextechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechITC.PageobjectModel.AmazonBasicsPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonBasics {
	WebDriver driver;
	
	@Given("^user have access to Amazon home page$")
	public void user_have_access_to_Amazon_home_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	      driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	      driver.get("https://www.amazon.com");
	      driver.manage().window().maximize();
	      
	   
	}

	@When("^user click on Amazonbasics tab$")
	public void user_click_on_Amazonbasics_tab() throws Throwable {
	    AmazonBasicsPOM AB = new AmazonBasicsPOM (driver);
	   AB.AmazonBasics().click();
	}
	@Then("^user will be redirected to Amazonbasics page$")
	public void user_will_be_redirected_to_Amazonbasics_page() throws Throwable {
	    
	}


}
