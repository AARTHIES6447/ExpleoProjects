package com.Parabank.Parabank;
import org.openqa.selenium.support.PageFactory;
public class LoginPageActions {
LoginPageLocators objloginLoc;
	
	public void LoginAction() {
		objloginLoc = new LoginPageLocators();
		PageFactory.initElements(HelperClass.getDriver(), objloginLoc);
	}
	
	public void setUsername(String logUsername) {
		objloginLoc.loginUsername.sendKeys(logUsername);
			
	}
	
	public void setPwd(String logpwd) {
		objloginLoc.loginPwd.sendKeys(logpwd);
	}
	
	public void clickLoginBtn() {
		objloginLoc.loginbtn.click();
	}
	
	public void loginDetails(String logUsername,String logpwd) {
		setUsername(logUsername);
		setPwd(logpwd);
	}
 
}
 

