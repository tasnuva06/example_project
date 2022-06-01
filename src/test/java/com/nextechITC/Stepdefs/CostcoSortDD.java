package com.nextechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttechITC.PageobjectModel.CostcoSortDDPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CostcoSortDD {
WebDriver driver;

@Given("^user visits Costco homepage$")
public void user_visits_Costco_homepage() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
    driver=new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    driver.get("https://www.costco.com");
    driver.manage().window().maximize();
    
}

@When("^user types \"([^\"]*)\" and clicks search button$")
public void user_types_and_clicks_search_button(String arg1) throws Throwable {
	CostcoSortDDPOM BW = new CostcoSortDDPOM (driver);
	BW.productname().sendKeys(arg1);
    BW.searchbutton().click();
    
    Thread.sleep(2000);
}

@When("^user clicks sort by dropdown and select one of the sort option$")
public void user_clicks_sort_by_dropdown_and_select_one_of_the_sort_option() throws Throwable {
	CostcoSortDDPOM DD= new CostcoSortDDPOM (driver);
	DD.sortby().click();
	Select dropdown = new Select (DD.sortby());
	dropdown.selectByIndex(3);
	Thread.sleep(2000);
}

@Then("^user will be able to see the results sorted out successfully$")
public void user_will_be_able_to_see_the_results_sorted_out_successfully() throws Throwable {
    
}








}
