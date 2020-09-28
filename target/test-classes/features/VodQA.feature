# language: es
Característica: Automatización Móvil VodQA
	
  Escenario: Mostrar primera carta de Carrusel
    Dado que estoy logueado con el usuario "admin" y contraseña "admin"
		Cuando ingreso a la opción "Carousel"
		Entonces el elemento "1 / 3" a mostrar es "1" 
 