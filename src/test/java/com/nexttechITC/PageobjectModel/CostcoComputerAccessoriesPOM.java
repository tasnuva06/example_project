package com.nexttechITC.PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CostcoComputerAccessoriesPOM {
WebDriver driver;

public CostcoComputerAccessoriesPOM(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

@FindBy (xpath="//a[@id='navigation-dropdown']")
WebElement act_shop;
public WebElement shop() {
return act_shop;

}
@FindBy(xpath="//div[@id='level1-all-departments']//ul//li//a[text()='Computers']")
WebElement click_computers;
public WebElement computers() {
	return click_computers;
}

}
