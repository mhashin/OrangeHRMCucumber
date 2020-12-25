package com.orangehrm.pages;

import org.openqa.selenium.By;

import com.orangehrm.util.ElementUtil;

public class LoginPage {

	private By txt_username = By.xpath("//input[@id='txtUsername' and @type='text']");
	private By txt_password = By.xpath("//input[@id='txtPassword' and @type='password']");
	private By btn_login = By.id("btnLogin");

	public LoginPage() {

	}

	public LoginPage enterUsername(String username) {
		ElementUtil.doSendKeys(txt_username, username);
		return this;
	}

	public LoginPage enterPassword(String password) {
		ElementUtil.doSendKeys(txt_password, password);
		return this;
	}

	public HomePage clickLogin() {
		ElementUtil.doClick(btn_login);
		return new HomePage();
	}

	

}
