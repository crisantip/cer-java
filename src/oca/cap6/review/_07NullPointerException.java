/**
 * ¿Qué se imprime además de la traza de pila causada por la excepción NullPointerException de la línea 16? 
 *  
 * A. AE
 * B. AEBCD
 * (C). AEC
 * D. AECD
 * E. No output appears other than the stack trace.
 * 
 * 
 * @author Katty
 * @since 13/02/2019
 */

package cap6.review;

public class _07NullPointerException {
	public void go() {
		System.out.print("A");
		try {
			stop();
		} catch (ArithmeticException e) {
			System.out.print("B");
		} finally {
			System.out.print("C");
		}
		System.out.print("D");
	}

	public void stop() {
		System.out.print("E");
		Object x = null;
		x.toString();
		System.out.print("F");
	}

	public static void main(String[] args) {
		new _07NullPointerException().go();
	}
}

