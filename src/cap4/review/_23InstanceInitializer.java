/**
 * ¿Cuál es el resultado de lo siguiente?
 * 
 * (A). tacb
 * B. tacf
 * C. tacbf
 * D. tacfb
 * E. tacftacb
 * F. The code does not compile.
 * G. An exception is thrown.
 * 
 * 
 * @author Katty
 * @since 22/01/2019
 */

package oca.cap4.review;

public class _23InstanceInitializer {

}

class _23Order {
	
	String value = "t";
	{
		value += "a";
	}
	{
		value += "c";
	}

	public _23Order() {
		value += "b";
	}

	public _23Order(String s) {
		value += s;
	}

	public static void main(String[] args) {
		_23Order order = new _23Order("f");		//tacf crea la instancia order usando el constructor con un argumento
		order = new _23Order();					//tacb actualiza la instancia order usando el constructor sin argumentos
		System.out.println(order.value);		//tacb
	}
}