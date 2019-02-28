/**
 * ¿Cuál es el resultado de lo siguiente?
 * 
 * A. curur
 * B. ucrcr
 * C. u ucrcr
 * D. u u curcur
 * (E). u u ucrcr
 * F. ur ur urc
 * G. The code does not compile.
 * 
 * 
 * @author Katty
 * @since 21/01/2019
 */

package cap4.review;

public class _22StaticInitializer {

}

class Order {
	static String result = "";
	{
		result += "c";	
	}
	static {
		result += "u";
	}
	{
		result += "r";
	}
}

class OrderDriver {
	public static void main(String[] args) {
		System.out.print(Order.result + " ");	//u		//Refiere a Order la primera vez, los elementos státicos son inicializados   
		System.out.print(Order.result + " ");	//u 	//Es igual que la anterior porque la inicialización de los elementos estáticos es por una vez
		new Order();							//ucr	//Crea un nuevo Order el cual dispara los inicializadores de instancia en el orden que están en el archivo
		new Order();							//ucrcr	//Crea un nuevo Order el cual dispara nuevamento los inicializadores de instancia en el orden que están en el archivo
		System.out.print(Order.result + " ");			//Imprime ucrcr
		
		//Imprime u u ucrcr
		 
	}
}