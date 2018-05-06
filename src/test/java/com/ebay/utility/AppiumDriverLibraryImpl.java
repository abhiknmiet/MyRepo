package com.ebay.utility;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.NetworkMode;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

/**
 * Created by Priyanka
 */
public class AppiumDriverLibraryImpl {

	protected static WebDriver driver;

	protected static DesiredCapabilities cap;
	protected static AppiumDriverLocalService service;
	protected static ExtentReports report;
	protected static ExtentTest logger;
	static String driverPath = System.getProperty("user.dir") + "\\src\\Jars\\";
	static String reportPath = System.getProperty("user.dir") + "\\output\\";

	public AppiumDriverLibraryImpl() {
		initialize();
	}

	public void initialize() {
		if (driver == null || report == null)
			createNewDriverInstance();
	}

	private void createNewDriverInstance() {
		String browser = new PropertyReader().readProperty("browser");
		String testDevice = new PropertyReader().readProperty("testDevice");
		int port = Integer.parseInt(new PropertyReader().readProperty("port"));
		String Appium_Node_Path = "C:/Program Files/Appium/node.exe";
		String Appium_JS_Path = "C:/Program Files/Appium/node_modules/appium/bin/appium.js";

		if (browser.equalsIgnoreCase("appium")) {
			try {
				if (driver == null) {

					service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().usingAnyFreePort()
							.usingDriverExecutable(new File(Appium_Node_Path)).withAppiumJS(new File(Appium_JS_Path)));
					service.start();

					if (testDevice.equalsIgnoreCase("Real")) {
						cap = new DeviceConfiguartionSetting().getRealDeviceCapabilities();
					} else {
						cap = new DeviceConfiguartionSetting().getSimulatorCapabilities();
					}

					String path = "http://127.0.0.1:" + new PropertyReader().readProperty("port") + "/wd/hub";

					report = new ExtentReports(reportPath + "report.html", NetworkMode.OFFLINE);

					driver = new AndroidDriver<>(new URL(path), cap);

				}
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			switch (browser) {

			case "IE":

				report = new ExtentReports(reportPath + "report.html", NetworkMode.OFFLINE);

				// Setting IEDriver Path
				System.setProperty("webdriver.ie.driver", driverPath + "\\IEDriverServer.exe");

				// Initialize InternetExplorerDriver Instance.

				DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
				capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
						true);

				driver = new InternetExplorerDriver(capabilities);

				break;

			case "firefox":

				report = new ExtentReports(System.getProperty("user.dir") + "\\src\\test\\java\\report\\report.html",
						NetworkMode.OFFLINE);
				driver = new FirefoxDriver();

				break;

			case "chrome":

				report = new ExtentReports(System.getProperty("user.dir") + "\\src\\test\\java\\report\\report.html",
						NetworkMode.OFFLINE);

				// Setting ChromeDriver Path
				System.setProperty("webdriver.chrome.driver", driverPath + "\\chromedriver.exe");

				// Initialize ChromeDriver Instance.

				driver = new ChromeDriver();

				break;

			case "safari":

				// Setting SafariDriver Path
				System.setProperty("webdriver.safari.driver", driverPath + "\\safaridriver.exe");

				// Initialize ChromeDriver Instance.

				driver = new SafariDriver();

				break;

			default:

				report = new ExtentReports(System.getProperty("user.dir") + "\\src\\test\\java\\report\\report.html",
						NetworkMode.OFFLINE);

				System.out.println("browser : " + browser + " is invalid, Launching Firefox as browser of choice..");

				driver = new FirefoxDriver();
			}

		}

	}

	public WebDriver getDriver() {
		return driver;
	}

	public IOSDriver getIOSDriver() {
		return iOSdriver;
	}

	public ExtentReports getReport() {
		return report;
	}

	public void destroyDriver() {
		driver.quit();
		driver = null;
	}

	public void destroyIOSDriver() {
		iOSdriver.quit();
		iOSdriver = null;
	}

	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} // try
		catch (NoAlertPresentException Ex) {
			return false;
		} // catch
	} //

	public int randInt(int min, int max) {

		// nextInt is normally exclusive of the top value,
		// so add 1 to make it inclusive
		int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
		return randomNum;
	}
}
