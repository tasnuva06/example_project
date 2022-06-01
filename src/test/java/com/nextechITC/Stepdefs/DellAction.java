package com.nextechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechITC.PageobjectModel.DellActionPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellAction {

	WebDriver driver;

	@Given("^user visit Dell homepage$")
	public void user_visit_Dell_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.dell.com");
		driver.manage().window().maximize();
Thread.sleep(5000);
	}

	@When("^user go to solutions drop down menu and able to see view all solutions$")
	public void user_go_to_solutions_drop_down_menu_and_able_to_see_view_all_solutions() throws Throwable {
		Actions mouse = new Actions(driver);
		DellActionPOM dell = new DellActionPOM(driver);
		mouse.moveToElement(dell.hover_solution_button()).build().perform();
		dell.click_all_solutions().click();
		Thread.sleep(5000);
	}

	@Then("^user redirects to solutions portfolio$")
	public void user_redirects_to_solutions_portfolio() throws Throwable {

	}

}
