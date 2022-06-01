package com.nexttechITC.PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CostcoSortDDPOM {
WebDriver driver;

public CostcoSortDDPOM(WebDriver driver) {
	this.driver= driver;
	PageFactory.initElements(driver,this);
}

@FindBy(xpath="//input[@id='search-field']")
WebElement type_productname ;
public WebElement productname () {
	return type_productname;
}

@FindBy(xpath="//i[@automation-id='searchWidgetButton']")
WebElement click_searchbutton;
public WebElement searchbutton() {
	return click_searchbutton;
}
@FindBy(xpath="//select[@id=\'sort_by\']")
WebElement sortby;
public WebElement sortby() {
	return sortby;
}

}
