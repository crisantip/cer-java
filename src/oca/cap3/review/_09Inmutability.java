package oca.cap3.review;

/**
 * A. 2
 * B. 4
 * (C). 8
 * D. 10
 * E. An exception is thrown.
 * F. The code does not compile.
 * 
 * Muestra la inmutabilidad de un String, cuando no se asigna el valor, el
 * resultado del método aplicado se pierde
 * 
 * @author Chris
 * @since 11/12/2018
 */
public class _09Inmutability {

	public static void main(String[] args) {
		String s = "purr";
		// Dado que s es String inmutable, ninguno de los métodos anteriores modifica el valor de s
		s.toUpperCase(); // cambia a mayusculas pero no se asigna a ninguna variable
		s.trim(); // borra espacios, no asigna a ninguna variable 
		s.substring(1, 3); // obtiene el valor 'ur', pero no se asigna

		// la siguiente sentencia si modifica el valor de s 
		s += " two"; 
		System.out.println(s.length()); // imprime 8
	}
}
