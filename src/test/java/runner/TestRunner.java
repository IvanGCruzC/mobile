package runner;

import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import driver.DriverManager;

@RunWith(Cucumber.class) 
@CucumberOptions(features = {"src/test/resources/features/VodQA.feature"}, 
				glue = { "steps" },
				monochrome = true)
public class TestRunner {
	
	@BeforeClass
	public static void iniciar() throws MalformedURLException, IOException {
		DriverManager.obtenerInstancia().inicializarDriver();
	}
	
	@AfterClass
	public static void terminar() {
		DriverManager.obtenerInstancia().cerrarDriver();
	}
}
