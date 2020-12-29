package com.orangehrm.pages;

import org.openqa.selenium.By;

import com.orangehrm.util.ElementUtil;

public final class HomePage {

	private By linkLogout=By.xpath("//a[text()='Logout']");
	private By textWelcome=By.xpath("//a[@id='welcome']");
	
	public HomePage clickLogOut() {
		ElementUtil.waitForElementToVisible(linkLogout, 10);
		ElementUtil.doClick(linkLogout);
		return this;
	}
	
	public HomePage clickWelcomeLink() {
		ElementUtil.doClick(textWelcome);
		return this;
	}
	
	
}
