package cap2.patron.factory;

/**
 * Retorna un tipo de comida basado en un conjunto de datos de entrada
 */
public class FoodFactory {

	/**
	 * Dependiendo del valor de animalName, devolvemos diferentes tipos de food para
	 * usar en nuestra factory.
	 */
	public static Food getFood(String animalName) {

		/**
		 * Diferentes animales pueden compartir la misma comida, como la cabra y el
		 * conejo, que comen bolitas, pero en cantidades variables
		 */
		switch (animalName) {
		case "zebra":
			return new Hay(108);
		case "rabbit":
			return new Pellets(5);
		case "goat":
			return new Pellets(30);
		case "polar bear":
			return new Fish(10);
		}

		// Good practice to throw an exception if no matching subclass could be found
		throw new UnsupportedOperationException("Unsupported animal: " + animalName);
	}
}