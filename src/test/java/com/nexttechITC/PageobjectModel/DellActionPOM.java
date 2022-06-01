package com.nexttechITC.PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellActionPOM {
	WebDriver driver;
	
	public DellActionPOM (WebDriver driver) {
		this.driver = driver;
	
	
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[text()='Solutions']")
	WebElement hover_solution_button;
	public WebElement hover_solution_button() {
		return hover_solution_button;
		// TODO Auto-generated method stub
		
	}

	@FindBy(xpath="//a[text()='View All Solutions']")
	WebElement click_all_solutions;

	public WebElement click_all_solutions() {
		return click_all_solutions;
		// TODO Auto-generated method stub
		
	}


}

