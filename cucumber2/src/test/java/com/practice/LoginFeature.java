package com.practice;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFeature {
	WebDriver driver;
	@Before
	public void beforemethod() {
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}
	@Given("User is on HRMLogin page {string}")
	public void user_is_on_hrm_login_page(String url) {
	    System.out.println("Open Website");
	    driver.get(url);
	}
 
	@When("User enters username as {string}")
	public void user_enters_username_as(String username) {
	    System.out.println("Enter Username");
	    driver.findElement(By.name("username")).sendKeys(username);
	}
 
	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
	    System.out.println("Enter Password");
	    driver.findElement(By.name("password")).sendKeys(password);
	}
 
	@When("Users clicks the login button")
	public void users_clicks_the_login_button() {
	    System.out.println("Click Login");
	    driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	}
 
	@Then("User should be able to login successfully")
	public void user_should_be_able_to_login_successfully() {
		String newPageText = driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']")).getText();
	    System.out.println("New page:" +newPageText);
	    Assert.assertTrue(newPageText.equals("Dashboard"));
	}
 
	@Then("User should not be able to login using invalid Credentials")
	public void user_should_not_be_able_to_login_using_invalid_credentials() {
	    String invalidmessage = driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
	    System.out.println("Invalid message:" +invalidmessage);
	    Assert.assertTrue(invalidmessage.equals("Invalid credentials"));
	}
 
	@Then("User should not be able to login using blank values")
	public void user_should_not_be_able_to_login_using_blank_values() {
		String requiredUsername = driver.findElement(By.xpath("//span[text()='Required'][1]")).getText();
		assertTrue(requiredUsername.equals("Required"));
		String requiredPassword = driver.findElement(By.xpath("(//span[text()='Required'])[2]")).getText();
		Assert.assertTrue(requiredPassword.equals("Required"));
	}
	@After
	public void close() {
		driver.quit();
	}
 
}
