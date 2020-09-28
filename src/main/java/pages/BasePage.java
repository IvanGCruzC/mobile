package pages;

import org.openqa.selenium.support.PageFactory;

import driver.DriverManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePage {
	private AppiumDriver<?> driver;

	public BasePage() {
		this.driver = DriverManager.obtenerInstancia().obtenerDriver();
		PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
	}

	public void clear(MobileElement mobileElement) {
		mobileElement.clear();
	}

	public void sendKeys(MobileElement mobileElement, String string) {
		clear(mobileElement);
		mobileElement.sendKeys(string);
	}

	public void click(MobileElement mobileElement) {
		mobileElement.click();
	}

	public String getText(MobileElement mobileElement) {
		return mobileElement.getText();
	}

	public void scrollToElement(String description) {
		((FindsByAndroidUIAutomator<?>) driver).findElementByAndroidUIAutomator(
		"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"" + description + "\"));");
	}

}
