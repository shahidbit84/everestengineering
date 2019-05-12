package com.everestengineering;

import com.everestengineering.enums.Browsers;
import com.everestengineering.testbase.TestBase;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		TestBase tb = new TestBase();
		tb.selectBrowser(Browsers.CHROME.name());
		
				
		
		

	}

}
