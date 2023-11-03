package com.Parabank.Parabank;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPageLocators {
	       
	    @FindBy(xpath="//a[@href='register.htm']")
	    WebElement ClickRegister;
	
		@FindBy(id="customer.firstName")
		WebElement FirstName;
		
		@FindBy(id="customer.lastName")
		WebElement LastName;
		
		@FindBy(name="customer.address.street")
		WebElement Address;
		
		@FindBy(id="customer.address.city")
		WebElement City;
		
		@FindBy(name="customer.address.state")
		WebElement State;
		
		@FindBy(id="customer.address.zipCode")
		WebElement ZipCode;
		
		@FindBy(id="customer.phoneNumber")
		WebElement PhoneNumber;
		
		@FindBy(id="customer.ssn")
		WebElement Ssn;
		
		@FindBy(id="customer.username")
		WebElement Username;
		
		@FindBy(id="customer.password")
		WebElement Password;
		
		@FindBy(id="repeatedPassword")
		WebElement RepeatedPassword;
		
		@FindBy(xpath ="(//input[@class='button'])[2]")
		WebElement Button;
		
}
