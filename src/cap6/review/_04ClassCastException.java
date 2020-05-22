/**
 * ¿Qué excepción lanzará el siguiente código? 
 *  
 * A. ArrayIndexOutOfBoundsException
 * (B). ClassCastException
 * C. IllegalArgumentException
 * D. NumberFormatException
 * E. None of the above.
 * 
 * 
 * @author Katty
 * @since 13/02/2019
 */

package cap6.review;

public class _04ClassCastException {

	public static void main(String[] args) {
		Object obj = new Integer(3);
		String str = (String) obj;
		System.out.println(str);		
	}
}
