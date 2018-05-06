package com.ebay.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by Priyanka
 */

@CucumberOptions(features = "src/test/java/features/", plugin = { "listener.ExtentReporterNG" }, format = { "pretty",
		"html:target/cucumber", "json:target/cucumber-report.json" }, tags = { "@mobile" }, glue = "steps"

)

public class RunEbayTest extends AbstractTestNGCucumberTests {

}
