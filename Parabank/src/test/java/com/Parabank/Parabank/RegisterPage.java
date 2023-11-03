package com.Parabank.Parabank;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPage {
	RegisterPageActions act = new RegisterPageActions();
	UtilityClass pro = new UtilityClass();
	RegisterPageLocators loc = new RegisterPageLocators();
	
	@Given("User logins to application using url")
	public void user_logins_to_application_using_url() {
	   
		HelperClass.openPage(pro.strurl);
	}

	@When("user gives firstname and lastname")
	public void user_gives_firstname_and_lastname() {
	   
		act.name(pro.strFirstName, pro.strLastName);
	}

	@When("user gives address and city")
	public void user_gives_address_and_city() {
	    // Write code here that turns the phrase above into concrete actions
		act.city(pro.strAddress, pro.strCity);
	}

	@When("user gives zipcode and  phonenumber")
	public void user_gives_zipcode_and_phonenumber() {
	    
		act.state(pro.strState, pro.strZipCode);
	}

	@When("user gives ssn and username")
	public void user_gives_ssn_and_username() {
	    // Write code here that turns the phrase above into concrete actions
		act.number(pro.strPhoneNumber, pro.strSsn);
	}

	@When("user gives password and confirmpassword")
	public void user_gives_password_and_confirmpassword() {
	    // Write code here that turns the phrase above into concrete actions
		act.user(pro.strUsername, pro.strPassword,pro.strRepeatedPassword);
	}

	@Then("user gives register Button")
	public void user_gives_register_button() {
	    // Write code here that turns the phrase above into concrete actions
		act.clickButton();
	}


}