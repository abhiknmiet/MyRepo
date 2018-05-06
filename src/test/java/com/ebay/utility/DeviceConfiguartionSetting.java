package com.ebay.utility;

import java.io.File;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.MobileCapabilityType;

public class DeviceConfiguartionSetting {

	public DesiredCapabilities getSimulatorCapabilities() {

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("deviceName", new PropertyReader().readProperty("deviceName"));
		capabilities.setCapability("platformVersion", new PropertyReader().readProperty("platformVersion"));
		capabilities.setCapability("platformName", new PropertyReader().readProperty("platformName"));
		capabilities.setCapability("browserName", "");
		capabilities.setCapability("newCommandTimeout", 3000);
		capabilities.setCapability("noReset", true);
		capabilities.setCapability("deviceOrientation", new PropertyReader().readProperty("deviceOrientation"));

		// For simulator app path
		capabilities.setCapability("app", new PropertyReader().readProperty("simulatorappPath"));

		return capabilities;
	}

	public DesiredCapabilities getRealDeviceCapabilities() {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", new PropertyReader().readProperty("deviceNameReal"));
		capabilities.setCapability("platformVersion", new PropertyReader().readProperty("platformVersionReal"));
		capabilities.setCapability("platformName", new PropertyReader().readProperty("platformNameReal"));
		capabilities.setCapability("browserName", "");
		capabilities.setCapability("newCommandTimeout", 3000);
		capabilities.setCapability("noReset", true);
		capabilities.setCapability("deviceOrientation", new PropertyReader().readProperty("deviceOrientation"));
		capabilities.setCapability("udid", "bc6f397fbf1007d25d6b1e22e488f27361fae08f");
		// For Real Device app path
		capabilities.setCapability("app", new PropertyReader().readProperty("realdeviceappPath"));

		return capabilities;
	}

}
