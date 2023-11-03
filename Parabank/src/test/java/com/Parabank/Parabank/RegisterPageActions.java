package com.Parabank.Parabank;


import java.awt.Button;

import org.openqa.selenium.support.PageFactory;



public class RegisterPageActions {
	
	RegisterPageLocators RegisterPageLocators;
	String strFirstName, strLastName, strAddress,strCity, strState, strZipCode, strPhoneNumber, strSsn, strUserName, strPassword,strRepeatedPassword,strButton;
    
	public RegisterPageActions() {  
		this.RegisterPageLocators = new RegisterPageLocators();
		
		PageFactory.initElements(HelperClass.getDriver(), RegisterPageLocators);
	}
	public void setFirstName(String strFirstName) {
		RegisterPageLocators.FirstName.sendKeys(strFirstName);
	}
	public void setLastName(String strLastName) {
		RegisterPageLocators.LastName.sendKeys(strLastName);
	}
	public void setAddress(String strAddress) {
		RegisterPageLocators.Address.sendKeys(strAddress);
	}
	public void setCity(String strCity) {
		RegisterPageLocators.City.sendKeys(strCity);
	}
	public void setState(String strState) {
		RegisterPageLocators.State.sendKeys(strState);
	}
	public void setZipCode(String strZipCode) {
		RegisterPageLocators.ZipCode.sendKeys(strZipCode);
	}
	public void setPhoneNumber(String strPhoneNumber) {
		RegisterPageLocators.PhoneNumber.sendKeys(strPhoneNumber);
	}
	public void setSsn(String strSsn) {
		RegisterPageLocators.Ssn.sendKeys(strSsn);
	}
	public void setUserName(String strUserName) {
		RegisterPageLocators.Username.sendKeys(strUserName);
	}
	public void setPassword(String strPassword) {
		RegisterPageLocators.Password.sendKeys(strPassword);
	}
	public void setRepeatedPassword(String strRepeatedPassword) {
		RegisterPageLocators.RepeatedPassword.sendKeys(strRepeatedPassword);
	}
	public void clickButton() {
		RegisterPageLocators.Button.click();
    }
public void name(String strFirstName, String strLastName) {
	setFirstName(strFirstName);
	setLastName(strLastName);
	
}
public void city(String strAddress, String strCity) {
	setAddress(strAddress);
	setCity(strCity);
}
public void state(String strState, String strZipCode) {
	setState(strState);
	setZipCode(strZipCode);
	
}
public void number(String strPhoneNumber, String strSsn) {
	setPhoneNumber(strPhoneNumber);
	setSsn(strSsn);
	
}
public void user(String strUsername1, String strPassword, String strRepeatedPassword) {
	setUserName(strUsername1);
	setPassword(strPassword);
	setRepeatedPassword(strRepeatedPassword);
}
	
	
}
