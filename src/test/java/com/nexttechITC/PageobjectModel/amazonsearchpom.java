package com.nexttechITC.PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonsearchpom {
	
	WebDriver driver;

//constructor is not a method but a special type of method. constructor name should be the same as class name
public amazonsearchpom (WebDriver driver) {
  this.driver=driver;
 
  PageFactory.initElements(driver, this);
 }

// @FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
@FindBy(name="field-keywords")
WebElement edit_serchbox;
public WebElement Search(){
return edit_serchbox;
 
}
@FindBy(id="nav-search-submit-button")
WebElement click_searchbutton;
public WebElement searchbutton(){
return click_searchbutton;
 

}

}
