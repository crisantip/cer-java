/**
 * ¿Cuál de las siguientes afirmaciones sobre el siguiente código es cierta? 
 * (Elija todo lo que corresponda) 
 * 
 * (A). The code prints out 2 4.
 * B. The code prints out 3 4.
 * C. The code prints out 4 2.
 * D. The code prints out 4 4.
 * (E). The code prints 3 4 if you remove the constructor Create(int num).
 * F. The code prints 4 4 if you remove the constructor Create(int num).
 * G. The code prints 5 4 if you remove the constructor Create(int num).
 * 
 * 
 * @author Katty
 * @since 27/01/2019
 */

package cap4.review;

public class _25Autoboxing {

}

class Create {
	Create() {
		System.out.print("1 ");
	}

	Create(int num) {
		System.out.print("2 ");
	}

	Create(Integer num) {
		System.out.print("3 ");
	}

	Create(Object num) {
		System.out.print("4 ");
	}

	Create(int... nums) {
		System.out.print("5 ");
	}

	public static void main(String[] args) {
		new Create(100);
		new Create(1000L);
	}
}