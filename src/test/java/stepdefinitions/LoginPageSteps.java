package stepdefinitions;

import com.orangehrm.factory.DriverFactory;
import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public final class LoginPageSteps {
	
	LoginPage login=new LoginPage();
	HomePage homepage;
	
	@Given("I am on the login page")
	public void navigateToLoginPage() {
		DriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("I enter {string} in the username field")
	public void enterUserName(String string) {
	    login.enterUsername("Admin");
	}

	@When("I enter {string} in the password field")
	public void enterPassword(String string) {
	   login.enterPassword("admin123");
	}

	@When("I click on login button")
	public void clickLoginButton() {
	    homepage=login.clickLogin();
	}

	@Then("I should be redirect to homepage")
	public void redirectToHomePage() {
	   
	}

}
