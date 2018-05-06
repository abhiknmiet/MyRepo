package com.ebay.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.ios.IOSDriver;

/**
 * Created by Priyanka .
 */
public class mobileHomePage {

	WebDriver driver;

	@FindBy(xpath = "//UIANavigationBar[1]/UIAButton[1]")
	private WebElement eBayIcon;

	@FindBy(xpath = "//UIANavigationBar[2]/UIAButton[1]")
	private WebElement signInBtn;

	@FindBy(xpath = "//UIANavigationBar[1]/UIATextBox[1]")
	private WebElement userNameTxtBox;

	@FindBy(xpath = "//UIANavigationBar[1]/UIATextBox[2]")
	private WebElement passwordTxtBox;

	@FindBy(xpath = "//UIANavigationBar[2]/UIAButton[@name='Submit']")
	private WebElement submitBtn;

	@FindBy(xpath = "//UIANavigationBar[1]/UIATextBox[@name='Search']")
	private WebElement productSearchTextBox;

	@FindBy(xpath = "//UIANavigationBar[3]/UIAButton[1]")
	private WebElement selectProduct;

	@FindBy(xpath = "//UIANavigationBar[2]/UIAButton[@name='BuyIt']")
	private WebElement buyItBtn;

	@FindBy(xpath = "//UIANavigationBar[2]/UIAButton[@name='Review']")
	private WebElement reviewBtn;

	@FindBy(xpath = "//UIANavigationBar[2]/UIAButton[@name='proceed']")
	private WebElement proceedToPay;

	@FindBy(xpath = "//UIANavigationBar[2]/UIALabel[@name='PaymentType']")
	private WebElement paymentTypeLbl;

	public mobileHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean verifyEbayLandingPage() throws InterruptedException {
		private boolean status = false;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(eBayIcon));

		if (eBayIcon != null) {
			System.out.println("User is on eBay home page");

			status = true;
			// logger.log(LogStatus.PASS, "Test Case (failTest) Status is passed");
		} else {

			status = false;
		}
		return status;

	}

	public boolean selectSignInBtn() throws InterruptedException {
		private boolean status = false;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(signInBtn));

		try {

			signInBtn.click();

			status = true;
		} catch (Exception e) {
			status = false;
			e.printStackTrace();
		}
		return status;

	}

	public boolean enterUserPassword(String userName, String password) throws InterruptedException {
		private boolean status = false;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(userNameTxtBox));

		try {

			userNameTxtBox.sendKeys(userName);
			passwordTxtBox.sendKeys(password);
			status = true;
		} catch (Exception e) {
			status = false;
			e.printStackTrace();
		}
		return status;

	}

	public boolean tapSignIn() throws InterruptedException {
		private boolean status = false;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(submitBtn));

		try {

			submitBtn.click();

			status = true;
		} catch (Exception e) {
			status = false;
			e.printStackTrace();
		}
		return status;

	}

	public boolean enterProductSearch(String product) throws InterruptedException {
		private boolean status = false;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(productSearchTextBox));

		try {

			productSearchTextBox.sendKeys(product);

			status = true;
		} catch (Exception e) {
			status = false;
			e.printStackTrace();
		}
		return status;

	}

	public boolean selectProductSearch() throws InterruptedException {
		private boolean status = false;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(selectProduct));

		try {

			selectProduct.click();

			status = true;
		} catch (Exception e) {
			status = false;
			e.printStackTrace();
		}
		return status;

	}

	public boolean selectBuyItBtn() throws InterruptedException {
		private boolean status = false;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(buyItBtn));

		try {

			buyItBtn.click();

			status = true;
		} catch (Exception e) {
			status = false;
			e.printStackTrace();
		}
		return status;

	}

	public boolean selectReviewBtn() throws InterruptedException {
		private boolean status = false;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(reviewBtn));

		try {

			reviewBtn.click();

			status = true;
		} catch (Exception e) {
			status = false;
			e.printStackTrace();
		}
		return status;

	}

	public boolean selectProceedToPay() throws InterruptedException {
		private boolean status = false;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToPay));

		try {

			proceedToPay.click();

			status = true;
		} catch (Exception e) {
			status = false;
			e.printStackTrace();
		}
		return status;

	}

	public boolean verifyPaymentPage() throws InterruptedException {
		private boolean status = false;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(paymentTypeLbl));

		if (paymentTypeLbl != null) {

			status = true;

		} else {

			status = false;
		}
		return status;

	}

}
