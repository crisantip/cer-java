/**
 * ¿Cuál es la salida del siguiente programa? 
 *  
 * (A). 12, followed by a stack trace for a NumberFormatException
 * B. 124, followed by a stack trace for a NumberFormatException
 * C. 12456
 * D. 12456
 * E. 1256, followed by a stack trace for a NumberFormatException
 * F. The code does not compile.
 * G. An uncaught exception is thrown.
 * 
 * 
 * @author Katty
 * @since 27/02/2019
 */

package cap6.review;

public class _11Exception {

}

class Cat {
	public String name;

	public void parseName() {
		System.out.print("1");
		try {
			System.out.print("2");
			int x = Integer.parseInt(name); //Es un string da una exception va al catch
			System.out.print("3");
		} catch (NullPointerException e) {	//No es de este tipo la exception
			System.out.print("4");
		}
		System.out.print("5");
	}

	public static void main(String[] args) {
		Cat leo = new Cat();
		leo.name = "Leo";
		leo.parseName();		//Sino captura la exception debería seguir?????
		System.out.print("6");
	}
}
