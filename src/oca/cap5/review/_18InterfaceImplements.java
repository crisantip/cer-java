/**
 * ¿Cuál es la salida del siguiente código? 
 * (Elija todo lo que corresponda) 
 *  
 * A. 2
 * B. 4
 * C. 6
 * D. The code will not compile because of line 5.
 * (E). The code will not compile because of line 6.
 * F. The code will not compile because of line 8.
 * 
 * 
 * @author Katty
 * @since 04/02/2019
 */

package cap5.review;

public class _18InterfaceImplements {

}

interface Aquatic {
	public default int getNumberOfGills(int input) {
		return 2;
	}
}

class ClownFish implements Aquatic {
	//línea 5
	public String getNumberOfGills() {
		return "4";
	}

	//línea 6
	//public String getNumberOfGills(int input) {	//No puede sobreescribir porque cambió el tipo de retorno
	//	return "6";
	//}

	public static void main(String[] args) {
		//línea 8
		System.out.println(new ClownFish().getNumberOfGills(-1));
	}
}