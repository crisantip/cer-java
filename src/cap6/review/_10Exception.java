/**
 * ¿Cuál es la salida del siguiente programa? 
 *  
 * A. 12
 * B. 1234
 * C. 1235
 * D. 124
 * (E). 1245
 * F. The code does not compile.
 * G. An uncaught exception is thrown.
 * 
 * 
 * @author Katty
 * @since 13/02/2019
 */

package oca.cap6.review;

public class _10Exception {
	public String name;

	public void parseName() {
		System.out.print("1");
		try {
			System.out.print("2");
			int x = Integer.parseInt(name);
			System.out.print("3");
		} catch (NumberFormatException e) {
			System.out.print("4");
		}
	}

	public static void main(String[] args) {
		_10Exception leroy = new _10Exception();
		leroy.name = "Leroy";
		leroy.parseName();
		System.out.print("5");
	}
}

