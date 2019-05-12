package com.everestengineering.helper;


import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import com.everestengineering.helper.LoggerHelper;
import com.everestengineering.testbase.TestBase;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class TakeScreenshot extends TestBase{

	TestBase testBase;

	Logger log = LoggerHelper.getLogger(TakeScreenshot.class);



	
	public void takeScreenshot(Scenario scenario) {
		

			try {
				log.info(scenario.getName() + " is Failed");
				final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png"); // ... and embed it in
			} catch (WebDriverException e) {
				e.printStackTrace();
			}
	}

}