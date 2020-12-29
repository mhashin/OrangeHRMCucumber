package stepdefinitions;

import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage;

import io.cucumber.java.en.Then;

public final class HomePageSteps {
	
	HomePage homePage=new HomePage();

	@Then("I click on log out")
	public void clickLogOut() {
		homePage.clickWelcomeLink();
		homePage.clickLogOut();
	}
	
	@Then("I should be redirect to log in page")
	public LoginPage redirectToLoginPage(){
		return new LoginPage();
	}
}
