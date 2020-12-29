package com.orangehrm.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangehrm.factory.DriverFactory;

public class ElementUtil {

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static WebElement getElement(By locator) {
		WebElement ele = DriverFactory.getDriver().findElement(locator);
		return ele;
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public static String getText(By locator) {
		return DriverFactory.getDriver().findElement(locator).getText();
	}
	
	public static void waitForElementToVisible(By locator,int time) {
		WebDriverWait wait=new WebDriverWait(DriverFactory.getDriver(), time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

}
