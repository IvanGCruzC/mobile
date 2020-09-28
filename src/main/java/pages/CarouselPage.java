package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CarouselPage extends BasePage {
	@AndroidFindBy(xpath = "//android.widget.HorizontalScrollView[@index=0]//android.widget.TextView[@index=0]")
	private MobileElement carta;
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@index=0]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[@index=1]//android.widget.TextView[@index=0]")
	private MobileElement orden;

	public String obtenerTextoCarta() {
		return getText(carta);
	}
	
	public String obtenerTextoOrdenDeCarta() {
		return getText(orden);
	}
}
