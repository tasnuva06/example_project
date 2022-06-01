package com.nexttechITC.PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonBasicsPOM {

	WebDriver driver;
	
	public AmazonBasicsPOM (WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@href='/stores/node/20648519011?channel=discovbar?field-lbr_brands_browse-bin=AmazonBasics&ref_=nav_cs_amazonbasics']")
	WebElement AmazonBasics ;
	// access-modifier return-type method name
	public WebElement AmazonBasics() {
		return AmazonBasics;
}
}