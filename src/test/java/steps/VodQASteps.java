package steps;

import org.junit.Assert;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import pages.CarouselPage;
import pages.LoginPage;
import pages.PageManager;
import pages.SampleListPage;

public class VodQASteps {
	private LoginPage logingPage = PageManager.obtenerInstancia().obtenerLoginPage();
	private SampleListPage sampleListPage = PageManager.obtenerInstancia().obtenerSampleListPage();
	private CarouselPage carouselPage = PageManager.obtenerInstancia().obtenerCarouselPage();
	
	@Dado("que estoy logueado con el usuario {string} y contraseña {string}")
	public void que_estoy_logueado_con_el_usuario_y_contraseña(String usuario, String clave) {
		logingPage.ingresarUsuario(usuario)
		  .ingresarClave(clave)
		  .presionarLogin();
	}

	@Cuando("ingreso a la opción {string}")
	public void ingreso_a_la_opción(String opcion) {
		sampleListPage.ingresarOpcion(opcion);
	}
	
	@Entonces("el elemento {string} a mostrar es {string}")
	public void el_elemento_a_mostrar_es(String elemento, String carta) {
		Assert.assertEquals("Valor en carta", elemento, carouselPage.obtenerTextoOrdenDeCarta());
		Assert.assertEquals("Valor en carta", carta, carouselPage.obtenerTextoCarta());
	}
}
