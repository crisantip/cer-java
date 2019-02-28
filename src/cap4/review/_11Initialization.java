/**
 * ¿Cuáles son las verdaderas del siguiente código? (Elija todo lo que corresponda)
 * 
 * A. The code compiles as is.
 * (B). There is exactly one compiler error in the code.
 * C. There are exactly two compiler errors in the code.
 * D. If the lines with compiler errors are removed, the output is climb climb.
 * (E). If the lines with compiler errors are removed, the output is swing swing.
 * F. If the lines with compile errors are removed, the code throws a NullPointerException.
 * 
 * 
 * @author Katty
 * @since 09/01/2019
 */

package cap4.review;

import static cap4.my.rope._10Rope.*;

import cap4.my.rope.*;

public class _11Initialization {
	public static void swing() {
		System.out.print("swing ");
	}

	public void climb() {
		System.out.println("climb ");
	}

	public static void play() {
		swing();
		//climb();		//Un metodo estático no puede llamar a uno de isntancia
	}

	public static void main(String[] args) {
		_11Initialization rope = new _11Initialization();
		rope.play();
		_11Initialization rope2 = null;
		rope2.play();	//No lanza excepción porque play es un método estático
	}
}
