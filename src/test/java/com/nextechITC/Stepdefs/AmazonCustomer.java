package com.nextechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechITC.PageobjectModel.AmazonCustomerPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonCustomer {

WebDriver driver;

@Given("^user visit to Amazon home page$")
public void user_have_access_to_Amazon_home_page() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
      driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
      driver.get("https://www.amazon.com");
      driver.manage().window().maximize();
} 
@When("^user click on Amazon customer service tab$")
public void user_click_on_Amazon_customer_service_tab() throws Throwable {
	AmazonCustomerPOM CS = new AmazonCustomerPOM (driver);
	CS.Cutomerservice().click();
 
}

@Then("^user will be redirected to Amazon customer service page$")
public void user_will_be_redirected_to_Amazon_customer_service_page() throws Throwable {
    
}


}
