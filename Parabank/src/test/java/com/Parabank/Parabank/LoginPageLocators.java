package com.Parabank.Parabank;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
public class LoginPageLocators {
	@FindBy(xpath = "//div[@class='login'][1]")
	WebElement loginUsername;
	@FindBy(xpath ="//div[@class='login'][2]")
	WebElement loginPwd;
	@FindBy(xpath = "//div[@class='login'][3]")
	WebElement loginbtn;
 

}
