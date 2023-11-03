//package com.Parabank.Parabank;
//
//import javax.lang.model.util.Elements.Origin;
//
//import org.bouncycastle.asn1.dvcs.Data;
//import org.junit.Assert;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.cucumber.java.ro.Dar.Dars;
//
//public class LoginPageDefinition {
//	LoginPageActions objLogin = new LoginPageActions();
//	UtilityClass data = new UtilityClass();
//	HomePageAction objHome = new HomePageAction();
//	@Given("User is on Parabank Login page")
//	public void user_is_on_parabank_login_page() {
//		HelperClass.openPage(data.strUrl);
//	    System.out.println("login page");
//	}
// 
//	@When("User enters ParaBank Username and Password")
//	public void user_enters_para_bank_username_and_password() {
//		Origin.login(Data.strUserName, Dars.strPassword);
//		   System.out.println("Username and password");
//	}
// 
//	@When("User clicks ParaBank login")
//	public void user_clicks_para_bank_login() {
//		
//		   org.openqa.selenium.interactions.PointerInput.Origin.clickLogin();
//		   System.out.println("login button");
//	}
// 
//	@Then("User should be able to login sucessfully in ParaBank")
//	public void user_should_be_able_to_login_sucessfully_in_para_bank() {
//		Assert.assertTrue(objHome.LogingetVerifyText().contains("Accounts Overview"));
//		   System.out.println("sucessfull login");
// 
//	}
// 
// 
// 
//
//}
