package stepdefinitions;

import org.junit.Assert;

import com.orangehrm.factory.DriverFactory;
import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public final class LoginPageSteps {

	LoginPage login = new LoginPage();
	HomePage homepage;

	@Given("I am on the login page")
	public void navigateToLoginPage() {
		DriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("I enter {string} in the username field")
	public void enterUserName(String username) {
		login.enterUsername(username);
		
	}

	@When("I enter {string} in the password field")
	public void enterPassword(String pwd) {
		login.enterPassword(pwd);
		
	}

	@When("I click on login button")
	public void clickLoginButton() {
		login.clickLogin();
		
	}

	@Then("I should be redirect to homepage")
	public void redirectToHomePage() {
		login.redirectToHomePage();
	}

	@Then("I should be displayed with error message")
	public void errorTextInvalidLogin() {
		String txtInvalidLoginerror = login.errorTextInvalidLogin();
		Assert.assertEquals("Invalid credentials", txtInvalidLoginerror);
	}

	

	
		

}
