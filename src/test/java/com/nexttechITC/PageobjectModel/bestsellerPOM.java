package com.nexttechITC.PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bestsellerPOM {
	WebDriver driver;
	
public bestsellerPOM (WebDriver driver) {
	this.driver=driver;
	
	PageFactory.initElements(driver,this);
}
	@FindBy(xpath="//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']")
	WebElement bestSeller ;
	// access-modifier return-type method name
	public WebElement bestseller() {
		return bestSeller;
	}
	
	

}
	

	

