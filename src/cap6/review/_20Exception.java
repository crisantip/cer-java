/**
 * ¿Qué contiene la salida de lo siguiente? (Elija todo lo que corresponda) 
 *  
 * (A). abce
 * B. abde
 * C. An exception with the message set to "1"
 * D. An exception with the message set to "2"
 * (E). An exception with the message set to "3"
 * F. Nothing; the code does not compile.
 * 
 * 
 * @author Katty
 * @since 27/02/2019
 */

package cap6.review;

public class _20Exception {

	public static void main(String[] args) {
		System.out.print("a");
		try {
			System.out.print("b");
			throw new IllegalArgumentException();
		} catch (IllegalArgumentException e) {
			System.out.print("c");
			throw new RuntimeException("1");
		} catch (RuntimeException e) {
			System.out.print("d");
			throw new RuntimeException("2");
		} finally {
			System.out.print("e");
			throw new RuntimeException("3");
		}
	}
}
