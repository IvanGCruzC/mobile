package utils;

import java.io.IOException;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.MobileCapabilityType;

public class CapabilitiesManager {
	public DesiredCapabilities obtenerCapabilities() throws IOException {
		Parametros parametros = new Parametros();
		PropertyManager propertyManager = new PropertyManager();
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, parametros.getPlatformName());
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, parametros.getPlatformVersion());
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, parametros.getDeviceName());
		
		switch (parametros.getPlatformName().toUpperCase()) {
		case "ANDROID":
			desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, propertyManager.obtenerAndroidAutomationName());
			String androidAppUrl = getClass().getResource(propertyManager.obtenerAndroidApp()).getFile();
			desiredCapabilities.setCapability(MobileCapabilityType.APP, androidAppUrl);
			break;

		case "IOS":
			break;
		}
		return desiredCapabilities;
	}
}
