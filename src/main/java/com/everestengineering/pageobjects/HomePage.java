package com.everestengineering.pageobjects;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.everestengineering.helper.WaitHelper;




public class HomePage{
	
	public WebDriver driver;
	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	
	@FindBy(xpath="//input[@id='location']")
	WebElement search;
	
	
	WaitHelper waithelper;
	
	public void checkSearchIsDisplayed() {
		String status="FAIL";
		
		if(search.isDisplayed()) {
			status="PASS";
			
		}
		assertEquals("PASS", status,"Search is not displayed ");
		
		
		
	}
	
	
	
}
