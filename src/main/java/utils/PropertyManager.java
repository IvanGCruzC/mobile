package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyManager {
	private Properties properties = new Properties();
	private final String nombreArchivo = "config.properties";
	
	public PropertyManager() throws IOException {
		InputStream inputStream;
		
		inputStream = getClass().getClassLoader().getResourceAsStream(nombreArchivo);
		properties.load(inputStream);
		inputStream.close();
	}
	
	public String obtenerAppiumURL() {
		return obtenerValor("appiumURL");
	}
	
	public String obtenerAndroidAutomationName() {
		return obtenerValor("androidAutomationName");
	}
	
	public String obtenerAndroidApp() {
		return obtenerValor("androidApp");
	}
	
	private String obtenerValor(String clave) {
		String valor = properties.getProperty(clave);
		if (valor != null) {
			return valor;
		} else {
			throw new RuntimeException(clave + " no especificado en el archivo " + nombreArchivo);
		}
	}
}
