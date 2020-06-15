package cap2.interfaces.functional.lambdas;

import cap2.interfaces.functional.Animal;
import java.util.function.Predicate;

public class FindMatchingAnimalsPredicate {

	/**Java provee esta interface dentro del paquete java.util.function
	 * para no tener que crear muchas interfaces funcionales
	 * Usa un tipo genérico en lugar del específico del ejemplo que es Animal
	 * */
	//public interface Predicate<T> {
	//	public boolean test(T t);
	//}

	/**
	 * El resultado de usar Predicate es que ya no se necesita la interface
	 * funcional
	 */
	private static void print(Animal animal, Predicate<Animal> trait) {
		if (trait.test(animal))
			System.out.println(animal);
	}

	public static void main(String[] args) {

		print(new Animal("fish", false, true), a -> a.canHop());
		print(new Animal("kangaroo", true, false), a -> a.canHop());

	}
}
