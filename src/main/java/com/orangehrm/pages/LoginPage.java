package com.orangehrm.pages;

import org.openqa.selenium.By;

import com.orangehrm.util.ElementUtil;

public final class LoginPage {

	private By txtboxUsername = By.xpath("//input[@id='txtUsername' and @type='text']");
	private By txtboxPassword = By.xpath("//input[@id='txtPassword' and @type='password']");
	private By btnLogin = By.id("btnLogin");
	private By txtErrorLogin=By.xpath("//span[text()='Invalid credentials']");

	public LoginPage() {

	}

	public LoginPage enterUsername(String username) {
		ElementUtil.doSendKeys(txtboxUsername, username);
		return this;
	}

	public LoginPage enterPassword(String password) {
		ElementUtil.doSendKeys(txtboxPassword, password);
		return this;
	}

	public LoginPage clickLogin() {
		ElementUtil.doClick(btnLogin);
		return this;
	}
	
	public String errorTextInvalidLogin() {
		return ElementUtil.getText(txtErrorLogin);
	}
	
	public HomePage redirectToHomePage() {
		return new HomePage();
	}

	

}
