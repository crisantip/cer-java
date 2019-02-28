/**
 * ¿Cuál es la salida del siguiente código? 
 * 
 * A. true
 * (B). false
 * C. The code will not compile because of line 2.
 * D. The code will not compile because of line 5.
 * E. The code will not compile because of line 7.
 * F. The code will not compile because of line 8.
 * 
 * 
 * @author Katty
 * @since 02/02/2019
 */

package cap5.review;

public class _12InterfaceImplements {

}

interface Nocturnal {
	default boolean isBlind() {
		return true;
	}
}

class Owl implements Nocturnal {
	public boolean isBlind() {
		return false;
	}

	public static void main(String[] args) {
		Nocturnal nocturnal = (Nocturnal) new Owl();
		System.out.println(nocturnal.isBlind());
		
		Nocturnal nocturnal1 = new Owl();			//??????????????
		System.out.println(nocturnal1.isBlind());
	}
}
