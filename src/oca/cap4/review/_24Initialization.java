/**
 * ¿Cuál de los siguientes se compilará cuando se inserte en el siguiente código? 
 * (Escoger todo lo que corresponda)
 * 
 * A. value1 = "d"; instead of // CODE SNIPPET 1
 * (B). value2 = "e"; instead of // CODE SNIPPET 1
 * (C). value3 = "f"; instead of // CODE SNIPPET 1
 * D. value1 = "g"; instead of // CODE SNIPPET 2
 * (E). value2 = "h"; instead of // CODE SNIPPET 2
 * F. value3 = "i"; instead of // CODE SNIPPET 2
 * 
 * 
 * @author Katty
 * @since 22/01/2019
 */

package oca.cap4.review;

public class _24Initialization {

}

class Order3 {
	
	final String value1 = "1";
	static String value2 = "2";
	String value3 = "3";
	{
		// CODE SNIPPET 1
		//A
		//value1 = "d";	//No puede quedar en esta línea porque se trata de una constante solo debe ser asignada una vez
		//B
		value2 = "e";	//Una variable estática si puede ser inicializada en un inicializador de instancia
		//C
		value3 = "f"; 	//Una variable de instancia si puede ser inicializada en un inicializador de instancia
	}
	static {
		// CODE SNIPPET 2
		//D
		//value1 = "g";	//No puede quedar en esta línea porque se trata de una constante solo debe ser asignada una vez
		//E
		value2 = "h";	//Una variable estática si puede ser inicializada en un inicializador estático
		//F
		//value3 = "i";	//Una variable de instancia NO puede ser inicializada en un inicializador estático
	}
}
