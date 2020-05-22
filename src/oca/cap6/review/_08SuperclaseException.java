/**
 * ¿Cuál es la salida del siguiente fragmento de código, suponiendo que a y b son 0? 
 *  
 * A. -1
 * B. 0
 * C. done-1
 * D. done0
 * (E). The code does not compile.
 * F. An uncaught exception is thrown.
 * 
 * 
 * @author Katty
 * @since 13/02/2019
 */

package cap6.review;

public class _08SuperclaseException {

	public int metodo()
	{
		int a=0,b=0;
		
		try {
			return a/b;
		} catch (RuntimeException e) {
			return -1;
		}
		// catch (ArithmeticException e) {
		//	return 0;
		//} 
		finally {
			System.out.print("done");
		}		
	}
	
	public static void main(String[] args) {
		_08SuperclaseException a = new _08SuperclaseException();
		a.metodo();
	}
}
