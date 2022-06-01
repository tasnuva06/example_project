package com.nextechITC.Stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttechITC.PageobjectModel.FBSignupPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fbsignup{
	WebDriver driver;
	
	@Given("^user visiting facebook url$")
	public void user_visiting_facebook_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
	    
	}

	@When("^user enter \"([^\"])\" and\"([^\"])\" and valid \"([^\"])\" and \"([^\"])\"$")
	public void user_enter_and_and_valid_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FBSignupPOM fb1= new FBSignupPOM(driver);
		fb1.firstname().sendKeys(arg1);
		fb1.lastname().sendKeys(arg2);
		fb1.mobemail().sendKeys(arg3);
		fb1.password().sendKeys(arg4);
	}

	@Then("^user select dropdown Month and dropdown Day and dropdown Year$")
	public void user_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FBSignupPOM se1= new FBSignupPOM (driver);
		
		Select dropdown= new Select (se1.click_month);
		dropdown.selectByIndex(5);
		
		Select dropdown1= new Select (se1.click_day);
		dropdown1.selectByValue("6");
		
		Select dropdown2= new Select (se1.click_year);
		dropdown2.selectByVisibleText("1999");
	}

}