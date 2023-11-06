Feature: Login Functionality of HRM Web Application
	
	@ValidCredentials
	Scenario: Verification of Login using valid credentials
 
	Given User is on HRMLogin page "https://opensource-demo.orangehrmlive.com/"
	When User enters username as "admin"
	And User enters password as "admin12"
	And Users clicks the login button
	Then User should be able to login successfully
 
	@InvalidCredentials
	Scenario: Verification of Login using valid credentials
 
	Given User is on HRMLogin page "https://opensource-demo.orangehrmlive.com/"
	When User enters username as "aa
	And User enters password as "admin123"
	And Users clicks the login button
	Then User should not be able to login using invalid Credentials
	
	@InvalidCredentials @BlankCredentials
	Scenario: Verification of Login using valid credentials
 
  Given User is on HRMLogin page "https://opensource-demo.orangehrmlive.com/"
	When User enters username as ""
	And User enters password as ""
	And Users clicks the login button
	Then User should not be able to login using blank values
