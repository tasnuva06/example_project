package com.nexttechITC.PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CostcoSignInPOM {
WebDriver driver;

public CostcoSignInPOM (WebDriver driver) {
this.driver = driver;
PageFactory.initElements(driver,this);
}

@FindBy (id="header_sign_in")
WebElement click_sign_in;
public WebElement sign_in () {
	return click_sign_in;
}

@FindBy (id="signInName")
WebElement type_email;
public WebElement email() {
	return type_email;
}
@FindBy (id="password")
WebElement type_password;
public WebElement password() {
return  type_password;
	

}
@FindBy (id="next")
WebElement click_next;
public WebElement next() {
	return click_next;
}
	
}
