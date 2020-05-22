/**
 * ¿Cuál es el resultado del siguiente código?
 *  
 * (A). Bird is flying
 * B. Pelican is flying
 * C. The code will not compile because of line 4.
 * D. The code will not compile because of line 5.
 * E. The code will not compile because of line 9.
 * 
 * 
 * @author Katty
 * @since 04/02/2019
 */

package oca.cap5.review;

public class _20ClassAbstractExtends {

}

abstract class Bird {
	//Privado en el padre, puede ser ocultado no sobreescrito
	private void fly() {
		System.out.println("Bird is flying");
	}

	public static void main(String[] args) {
		Bird bird = new Pelican();
		//Para el caso de métodos ocultados el método a usar depende de donde es referenciado ??? cómo sería el caso
		bird.fly();
	}
}

class Pelican extends Bird {
	protected void fly() {
		System.out.println("Pelican is flying");
	}
}
