package com.ebay.steps;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TimeoutException;

import com.ebay.utility.AppiumDriverLibraryImpl;
import com.ebay.utility.PropertyReader;
import com.relevantcodes.extentreports.LogStatus;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;



/**
 * Created by Priyanka .
 */
public class StartingSteps extends AppiumDriverLibraryImpl
{
	//ExtentCucumberFormatter repo;
	//ExtentReports report;
	//ExtentTest logger; 
		
	   	
	




	@Before
    public void beforeScenario() throws MalformedURLException{
		String browser = new PropertyReader().readProperty("browser");
		if (browser.equalsIgnoreCase("appium"))
        {
			driver=new AppiumDriverLibraryImpl().getDriver();
        }
		
		report = new AppiumDriverLibraryImpl().getReport();
        System.out.println("this will run before the actual scenario");
        logger=report.startTest("Test Starts");	
        
        
    }
	
	
	
	
    @After
    public void afterScenario() throws MalformedURLException{
       
    	  	
    	
    	String browser = new PropertyReader().readProperty("browser");
		if (browser.equalsIgnoreCase("appium"))
        {
		service.stop();
        }
        else
        {
        	new AppiumDriverLibraryImpl().destroyDriver();
        }
		
		report.endTest(logger);
      	report.flush();
    	
        System.out.println("this will run after scneario is finished, even if it failed");
    }
    
    
    
    @Given("^user launches the app$")
    public void launchMobile() throws InterruptedException
    {
    
  	
    	System.out.println("App launched");
    	logger.log(LogStatus.INFO, "App launched", "Initialise app");
    	
    }
    
    
   
    }
    
    
}
