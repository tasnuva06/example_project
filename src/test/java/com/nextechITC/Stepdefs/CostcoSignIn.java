package com.nextechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechITC.PageobjectModel.CostcoSignInPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class CostcoSignIn {
WebDriver driver;


@Given("^user visit Costco homepage$")
public void user_visit_Costco_homepage() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
    driver=new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    driver.get("https://www.costco.com");
    driver.manage().window().maximize();
    
}

@When("^user click on Sign In$")
public void user_click_on_Sign_In() throws Throwable {
	CostcoSignInPOM obj = new CostcoSignInPOM (driver);
	obj.sign_in().click();
}

@When("^user types invalid \"([^\"]*)\",valid\"([^\"]*)\"$")
public void user_types_invalid_valid(String arg1, String arg2) throws Throwable {
	CostcoSignInPOM obj =new CostcoSignInPOM(driver);
	obj.email().sendKeys(arg1);
	obj.password().sendKeys(arg2);

}

@Then("^user click on sign in$")
public void user_click_on_sign_in() throws Throwable{
	CostcoSignInPOM obj = new CostcoSignInPOM(driver);
	obj.next().click();

}

}

