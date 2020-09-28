# Automatización Mobile
 Ejercicio de automatización móvil con VodQA.apk
	La automatización está solo para Android.
	Se ha implementado patrones como PageFactory, Fluent page object model, Singleton.

# Requisitos
 JDK, SDK, Appium, Maven

# Ejecución
 Ubicar en la ruta del proyecto y ejecutar el siguiente comando remmplazando los valores platformVersion y deviceName con los valores del celular android donde se realizará la prueba
	
 mvn test -DplatformName="Android" -DplatformVersion="platformVersion" -DdeviceName="deviceName"
