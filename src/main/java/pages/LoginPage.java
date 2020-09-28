package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BasePage{
	@AndroidFindBy(accessibility = "username")
	private MobileElement username;
	@AndroidFindBy(accessibility = "password")
	private MobileElement password;
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"login\"]/android.widget.Button/android.widget.TextView")
	private MobileElement loginIn;

	public LoginPage ingresarUsuario(String usuario) {
		sendKeys(username, usuario);
		return this;
	}
	
	public LoginPage ingresarClave(String clave) {
		sendKeys(password, clave);
		return this;
	}
	
	public void presionarLogin() {
		click(loginIn);
	}
}
