package com.Parabank.Parabank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageLocators {
	@FindBy(xpath="//span[@id=\"customer.username.errors\"]")
	WebElement verifyText;
	@FindBy(xpath="//h1[text()=\"Accounts Overview\"]")
	WebElement LoginverifyText;

 
}


