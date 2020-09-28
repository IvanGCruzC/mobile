package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SampleListPage extends BasePage{ 
	private final String descripcionCarousel = "carousel";
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='"+ descripcionCarousel +"']")
	private MobileElement carousel; 

	public void ingresarOpcion(String opcion) {
		scrollToElement(obtenerDescripcion(opcion));
		click(carousel);
	}
	
	private String obtenerDescripcion(String opcion) {
		String descripcion = "";
		switch (opcion.toUpperCase()) {
		case "CAROUSEL":
			descripcion = descripcionCarousel;
			break;
		}
		return descripcion;
	}
}
