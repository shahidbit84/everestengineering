package com.everestengineering.helper;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
	
	Logger logger = LoggerHelper.getLogger(WaitHelper.class);
	public WebDriver driver;
	
	public WaitHelper(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void waitForElement(WebElement element,long timeOutInSeconds) {
		logger.info("Waiting for element to be visible");
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
		logger.info("element is visible");
	}

}
