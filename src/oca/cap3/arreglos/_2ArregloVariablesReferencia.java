package oca.cap3.arreglos;

import java.util.Arrays;

/**
 * Crea un arreglo de String (tipo built-in)
 * invoca a los métodos equals y toString sobre la variable de referencia al objeto
 * usa el método java.util.Arrays.toString
 * @author Chris
 *
 */
public class _2ArregloVariablesReferencia {

	public static void main(String[] args) {
		String[] bichos = {"grillo", "escarabajo", "mariquita"};
		String[] ids = bichos;
		System.out.println(bichos.equals(ids)); // true
		System.out.println(bichos.toString()); // [Ljava.lang.String;@7852e922
		
		// Imprime los elementos del arreglo usando toString de la clase Arrays
		System.out.println(Arrays.toString(bichos));
	}
}
