package cap2.interfaces.functional.lambdas;

import cap2.interfaces.functional.Animal;

public class FindMatchingAnimals {
	private static void print(Animal animal, CheckTrait trait) {
		if (trait.test(animal))
			System.out.println(animal);
	}

	public static void main(String[] args) {

		/**
		 * Expresión Lambda a -> a.canHop() Esta expresión significa que Java debería
		 * llamar un método con un parámetro Animal que retorna un valor boolean que es
		 * el resultado de a.canHop()
		 */
		/**
		 * El lambda es pasado como el segundo parámetro del método print(). El método
		 * print espera un CheckTrait como segundo parámetro. Dado que nosotros estamos
		 * pasando un lambda en su lugar, Java trata CheckTrait como una interface
		 * funcional y trata de mapearlo al único método abstracto
		 */

		print(new Animal("fish", false, true), a -> a.canHop());
		print(new Animal("kangaroo", true, false), a -> a.canHop());

		/**
		 * Sintaxis equivalente
		 */
		print(new Animal("bear", true, false), (Animal a) -> { return a.canHop();} );
	
	}
}
