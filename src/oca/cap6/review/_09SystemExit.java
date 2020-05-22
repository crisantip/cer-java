/**
 * ¿Cuál es la salida del siguiente programa? 
 *  
 * A. Starting up
 * (B). Starting up Problem
 * C. Starting up Problem Shutting down
 * D. Starting up Shutting down
 * E. The code does not compile.
 * F. An uncaught exception is thrown.
 * 
 * 
 * @author Katty
 * @since 13/02/2019
 */

package cap6.review;

public class _09SystemExit {
	public void start() {
		try {
			System.out.print("Starting up ");
			throw new Exception();
		} catch (Exception e) {
			System.out.print("Problem ");
			System.exit(0);
		} finally {
			System.out.print("Shutting down ");
		}
	}

	public static void main(String[] args) {
		new _09SystemExit().start();
	}
}
