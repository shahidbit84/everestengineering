package com.everestengineering.testrunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features = "src/test/resources/features", glue = {
		"com/everestengineering/stepdefinitions" }, plugin = { "pretty", "html:target/cucumber-reports/cucumber-pretty",
				"json:target/cucumber-reports/cucumbertestreport.json","rerun:target/cucumber-reports/rerun.txt" })
public class TestRunner {

       private TestNGCucumberRunner testNgCucumberRunner;
       
       @BeforeClass(alwaysRun = true)
       public void setUpClass() {   
    	   testNgCucumberRunner = new TestNGCucumberRunner(this.getClass());
    	   
       }
       
       @Test(groups = "cucumber",description="Runs cucumber features",dataProvider="features")
       public void feature(CucumberFeatureWrapper cucumberFeature) {   
    	   testNgCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    	   
       }
       
       @DataProvider
       public Object[][] features(){
    	   return testNgCucumberRunner.provideFeatures();
       }
	
       @AfterClass(alwaysRun = true)
       public void tearDownClass() {
    	   testNgCucumberRunner.finish();
       }
       
       
}
