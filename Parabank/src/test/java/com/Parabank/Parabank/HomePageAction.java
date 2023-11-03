package com.Parabank.Parabank;

import org.openqa.selenium.support.PageFactory;

public class HomePageAction {
	HomePageLocators homepagLocators ;
	public HomePageAction() {
		homepagLocators = new HomePageLocators();
		PageFactory.initElements(HelperClass.getDriver(), homepagLocators);
	}
	public String getVerifyText() {
		return homepagLocators.verifyText.getText();
	}
	public String LogingetVerifyText() {
		return homepagLocators.LoginverifyText.getText();
	}
}
