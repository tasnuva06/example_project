package com.nextechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechITC.PageobjectModel.amazonsearchpom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Amazonsearchfeature {
	
	WebDriver driver;

	@Given("^user visit amazon home page$")
	public void user_visit_amazon_home_page() throws Throwable {
		// how to open the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
// implicit wait
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    // how to open the URL
		 driver.get("https://www.amazon.com/");
		  
// HOW TO MAXIMIZE THE WINDOW 
		 driver.manage().window().maximize();
	  
	}

	@Given("^user search by \"([^\"]*)\"$")
	public void user_search_by(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		amazonsearchpom AS = new amazonsearchpom(driver);
		AS.Search().sendKeys(arg1);
		// soft wait
	  WebDriverWait wait= new WebDriverWait(driver,20);
	  Thread.sleep(5000);
	}

	@Then("^user click on search button$")
	public void user_click_on_search_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		amazonsearchpom AS= new amazonsearchpom (driver);
		AS.searchbutton().click();

		WebDriverWait wait= new WebDriverWait(driver,20);
		Thread.sleep(10000);
		driver.quit();
}
	
}
