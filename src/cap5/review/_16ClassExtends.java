/**
 * ¿Cuál es la salida del siguiente código? 
 *  
 * A. Reptile laying eggs
 * B. Lizard laying eggs
 * C. The code will not compile because of line 4.
 * D. The code will not compile because of line 5.
 * (E). The code will not compile because of line 9.
 * 
 * 
 * @author Katty
 * @since 04/02/2019
 */

package cap5.review;

public class _16ClassExtends {

}

abstract class Reptile {
	public final void layEggs() {	//Por ser final no puede ser sobreescrito
		System.out.println("Reptile laying eggs");
	}

	public static void main(String[] args) {
		//línea 4
		Reptile reptile = new Lizard();
		//línea 5
		reptile.layEggs();
	}
}

class Lizard extends Reptile {
	//línea 9
	//public void layEggs() {			//Trata de sobreescribir un método definido como final
	//	System.out.println("Lizard laying eggs");
	//}
}