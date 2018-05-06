package com.ebay.steps;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ebay.test.mobileHomePage;
import com.ebay.test.tssBodyConfigurationPage;
import com.ebay.utility.AppiumDriverLibraryImpl;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Priyanka .
 */
public class EbayProductPurchaseSteps extends AppiumDriverLibraryImpl{

	

	@Given("^User is on eBay landing page$")
    public void verifyEbayLandingPage() throws Throwable {
     private  boolean landingStatus =  new mobileHomePage(driver).verifyEbayLandingPage();
     if(landingStatus)
     {
    	 
    	 logger.log(LogStatus.PASS, "User is on home page");
     }
     else
     {
    	 logger.log(LogStatus.FAIL, "Test step failed : User is not on eBay home page");
     }
    
    }  
	
	
	@When("^User tap on Sign In button$")
    public void selectSignInBtn() throws Throwable {
		private  boolean signInStatus  new mobileHomePage(driver).selectSignInBtn();
        
        
        if(signInStatus)
        {
       	 
       	 logger.log(LogStatus.PASS, "User clicked on SignIn button");
        }
        else
        {
       	 logger.log(LogStatus.FAIL, "Not able to click on SignIn button");
        }
        
        
        
    }
	
	@And("^User enters user name as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void enterUserPassword(String userName, String password) throws Throwable {
      
       
       private  boolean credentialInputStatus =  new mobileHomePage(driver).enterUserPassword(userName, password); 
       
       
       if(credentialInputStatus)
       {
      	 
      	 logger.log(LogStatus.PASS, "User and password entered successfull");
       }
       else
       {
      	 logger.log(LogStatus.FAIL, "Not able to enter usr name or password");
       }
    }
	
	@And("^user selects Sign In button to navigate on home page$")
    public void tapSignIn() throws Throwable {
        
    private  boolean submitBtnStatus  new mobileHomePage(driver).tapSubmit();
        
        
        if(submitBtnStatus)
        {
       	 
       	 logger.log(LogStatus.PASS, "User clicked on Sign In button after entering username and Password");
        }
        else
        {
       	 logger.log(LogStatus.FAIL, "Not able to Sign In");
        }
        
    }
 
	@And("^user search product to purchase from search text box as \"([^\"]*)\"$")
    public void enterProductSearch(String product) throws Throwable {
        
        
        
        private  boolean productSearchtStatus =  new mobileHomePage(driver).enterProductSearch(product);
        
        
        if(productSearchtStatus)
        {
       	 
       	 logger.log(LogStatus.PASS, "User successfully entered product to search");
        }
        else
        {
       	 logger.log(LogStatus.FAIL, "Not able to entered product to search");
        }
        
        
        
    }
	
	@And("^user select searched product$")
    public void selectProductSearch() throws Throwable {
       
       
       private  boolean productSearchtSeleStatus =  new mobileHomePage(driver).selectProductSearch();
       
       
       if(productSearchtSeleStatus)
       {
      	 
      	 logger.log(LogStatus.PASS, "User successfully clicked on searched product button");
       }
       else
       {
      	 logger.log(LogStatus.FAIL, "Not able to click on searched product button");
       }
       
    }
	
	@And("^user tap on Buy it now button$")
    public void selectBuyItBtn() throws Throwable {
        
        
        private  boolean buyItBtnSeleStatus =  new mobileHomePage(driver).selectBuyItBtn();
        
        
        if(buyItBtnSeleStatus)
        {
       	 
       	 logger.log(LogStatus.PASS, "User successfully clicked on Buy it now button");
        }
        else
        {
       	 logger.log(LogStatus.FAIL, "Not able to click on Buy it now button");
        }
    }
	
	@And("^user tap on Review option$")
    public void selectReviewBtn() throws Throwable {
        
        
private  boolean reviewBtnStatus =  new mobileHomePage(driver).selectReviewBtn();
        
        
        if(reviewBtnStatus)
        {
       	 
       	 logger.log(LogStatus.PASS, "User successfully clicked on Select review button");
        }
        else
        {
       	 logger.log(LogStatus.FAIL, "Not able to click on Select review button");
        }
    }
	
	@And("^user tap on proceed to pay option$")
    public void selectProceedToPay() throws Throwable {
        
        
private  boolean proceedToPaBtnStatus =  new mobileHomePage(driver).selectProceedToPay();
        
        
        if(proceedToPaBtnStatus)
        {
       	 
       	 logger.log(LogStatus.PASS, "User successfully selected proceed to pay button");
        }
        else
        {
       	 logger.log(LogStatus.FAIL, "Not able to click on selected proceed to pay button");
        }
    }
	@Then("^user should get payment option page$")
    public void verifyPaymentPage() throws Throwable {
       
       
       private  boolean PaymentPageStatus =  new mobileHomePage(driver).verifyPaymentPage();
       
       
       if(PaymentPageStatus)
       {
      	 
      	 logger.log(LogStatus.PASS, "User successfully navigated to Payment page");
       }
       else
       {
      	 logger.log(LogStatus.FAIL, "Not able to navigated to Payment page");
       }
    
	
}
}