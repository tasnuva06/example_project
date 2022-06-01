package com.nexttechITC.PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBSignupPOM {
	WebDriver driver;


	public FBSignupPOM(WebDriver driver) {
		this.driver=driver;

		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(name="firstname")
	WebElement First_name;
	public WebElement firstname(){
	return First_name;
	}

	@FindBy(name="lastname")
	WebElement Last_name;
	public WebElement lastname() {
		return Last_name;
	}
	
	@FindBy(name="reg_email__")
	WebElement Mobile_number_email;
	public WebElement mobemail() {
		return Mobile_number_email;
		
	}
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	public WebElement password() {
		return password;
	}
	
	@FindBy(id="month")
	public WebElement click_month;
	
	
	@FindBy(name="birthday_day")
	public WebElement click_day;
	
	
	@FindBy (id="year")
	public WebElement click_year;
	
	
	

}