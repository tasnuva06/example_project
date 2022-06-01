package com.nextechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechITC.PageobjectModel.bestsellerPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class bestseller  {
WebDriver driver;

	@Given("^user can access to amazon home page$")
public void user_have_access_to_amazon_home_page() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
      driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
      driver.get("https://www.amazon.com");
      driver.manage().window().maximize();
      
}

@When("^user click on best seller tab$")
public void user_click_on_best_seller_tab() throws Throwable {
	bestsellerPOM objbs= new bestsellerPOM (driver);
	objbs.bestseller().click();
	
	
	
	
}

@Then("^user will be redirected to best seller page$")
public void user_will_be_redirected_to_best_seller_page() throws Throwable {
    System.out.println(driver.getTitle());
}



}
