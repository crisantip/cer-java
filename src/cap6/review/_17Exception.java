/**
 * ¿Cuál de las siguientes opciones puede insertarse en Lion para compilar este código?
 * (Elegir todos los que aplican) 
 *  
 * (A). public void roar(){}
 * B. public void roar() throws Exception{}
 * (C). public void roar() throws HasSoreThroatException{}
 * (D). public void roar() throws IllegalArgumentException{}
 * (E). public void roar() throws TiredException{}
 * 
 * 
 * @author Katty
 * @since 27/02/2019
 */

package oca.cap6.review;

public class _17Exception {

}

class HasSoreThroatException extends Exception {
}

class TiredException extends RuntimeException {
}

interface Roar {
	void roar() throws HasSoreThroatException;
}

class Lion implements Roar {
	// INSERT CODE HERE
	public void roar(){}	//Si compila
	
	//public void roar() throws Exception{}	//No compila es una exception de mayor jerarquía ??
	
	//public void roar() throws HasSoreThroatException{}	//Si compila es del mismo tipo
	
	//public void roar() throws IllegalArgumentException{}	//Si compila por qué????
	
	//public void roar() throws TiredException{}	//Si compila por qué????
}
