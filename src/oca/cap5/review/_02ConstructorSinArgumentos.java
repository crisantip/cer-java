/**
 * ¿Cuál es la salida del siguiente código? 
 * 
 * A. Platypus
 * B. Mammal
 * C. PlatypusMammal
 * D. MammalPlatypus
 * (E). The code will not compile because of line 8.
 * F. The code will not compile because of line 11.
 * 
 * 
 * @author Katty
 * @since 29/01/2019
 */

package oca.cap5.review;

public class _02ConstructorSinArgumentos {

}

class Mammal {
	public Mammal(int age) {
		System.out.print("Mammal");
	}
}

class Platypus extends Mammal {
	//Línea 8
	public Platypus() {
		super(3);	//Se debía llamar al constructor padre default pero no existe por lo que se debe especificar el constructor existente ???
		System.out.print("Platypus");
	}

	public static void main(String[] args) {
		new Mammal(5);
	}
}
