package com.orangehrm.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.orangehrm.factory.DriverFactory;

public class ElementUtil {
	
	//private static WebDriver driver;
	
	
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static WebElement getElement(By locator) {
		
		WebElement ele=DriverFactory.getDriver().findElement(locator);
		//WebElement ele=driver.findElement(locator);
		return ele;
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}

}
