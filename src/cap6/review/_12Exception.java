/**
 * ¿Qué se imprime en lo siguiente? 
 *  
 * (A). 1
 * (B). 2
 * C. 3
 * (D). 4
 * E. 5
 * F. 6
 * (G). The stack trace for a NullPointerException
 * 
 * 
 * @author Katty
 * @since 27/02/2019
 */

package cap6.review;

public class _12Exception {

}

class Mouse {
	public String name;

	public void run() {
		System.out.print("1");
		try {
			System.out.print("2");
			name.toString();
			System.out.print("3");
		} catch (NullPointerException e) {
			System.out.print("4");
			throw e;
		}
		System.out.print("5");
	}

	public static void main(String[] args) {
		Mouse jerry = new Mouse();
		jerry.run();
		System.out.print("6");
	}
}