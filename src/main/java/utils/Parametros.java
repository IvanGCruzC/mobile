package utils;

public class Parametros {
	private String platformName;
	private String platformVersion;
	private String deviceName;

	public Parametros() {
		this.platformName = System.getProperty("platformName").toString();
		this.platformVersion = System.getProperty("platformVersion").toString();
		this.deviceName = System.getProperty("deviceName").toString();
	}

	public String getPlatformName() {
		return platformName;
	}

	public String getPlatformVersion() {
		return platformVersion;
	}

	public String getDeviceName() {
		return deviceName;
	}
	
}
