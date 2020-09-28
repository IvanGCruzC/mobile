package driver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.CapabilitiesManager;
import utils.Parametros;
import utils.PropertyManager;

public class DriverManager {
	private static DriverManager driverManager;
	private AppiumDriver<?> driver;

	private DriverManager() {
	} 
	
	private synchronized static void crearInstancia() {
        if (driverManager == null) {
        	driverManager = new DriverManager();
        }
    }
	
	public static DriverManager obtenerInstancia() {
		crearInstancia();
		return driverManager;
	}
	
	public void inicializarDriver() throws MalformedURLException, IOException {
		PropertyManager propertyManager = new PropertyManager();
		Parametros parametros = new Parametros();
		CapabilitiesManager capabilitiesManager = new CapabilitiesManager();
		switch (parametros.getPlatformName().toUpperCase()) {
		case "ANDROID":
			driver = new AndroidDriver<AndroidElement>(new URL(propertyManager.obtenerAppiumURL()), capabilitiesManager.obtenerCapabilities());
			break;
		case "IOS":
			break;
		}
		
	}

	public AppiumDriver<?> obtenerDriver() {
		return driver;
	}
	
	public void cerrarDriver() {
		if (driver != null) {
			driver.closeApp();
			driver.quit();
		}
	}
	
}
