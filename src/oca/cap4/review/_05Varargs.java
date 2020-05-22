/**
 * Dado el siguiente método, ¿cuál de las llamadas al método devuelve 2? (Elija todo lo que corresponda)
 * 
 * A. howMany();
 * B. howMany(true);
 * C. howMany(true, true);
 * (D). howMany(true, true, true);
 * E. howMany(true, {true});
 * F. howMany(true, {true, true});
 * (G). howMany(true, new boolean[2]);
 * 
 * 
 * @author Katty
 * @since 09/01/2019
 */

package cap4.review;


public class _05Varargs {
	
	public static void main(String[] args) {
		//howMany();					//No compila debe enviar al menos el primer parámetro
		howMany(true);
		howMany(true, true);
		howMany(true, true, true);
		//howMany(true, {true});		//No compila no es la forma de enviar datos a un vararg
		//howMany(true, {true, true});	//No compila no es la forma de enviar datos a un vararg
		howMany(true, new boolean[2]);
	}
	
	public static int howMany(boolean b, boolean... b2) {
		System.out.println(b2.length);
		return b2.length;
	}

}


