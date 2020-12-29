Feature: OrangeHRM login 

Scenario: Login with valid credentials 
	Given I am on the login page 
	When I enter "Admin" in the username field 
	And I enter "admin123" in the password field 
	And I click on login button 
	Then I should be redirect to homepage 
	And I click on log out 
	Then I should be redirect to log in page
	
	
Scenario: Login with invalid credentials 
	Given I am on the login page 
	When I enter "Admin" in the username field 
	And I enter "45685" in the password field 
	And I click on login button 
	Then I should be displayed with error message