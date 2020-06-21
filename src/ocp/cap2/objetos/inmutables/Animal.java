package cap2.objetos.inmutables;

import java.util.*;

/**
 * Las 5 reglas para objetos inmutables son preservadas y las instancias de esta
 * clase son inmutables
 */
public final class Animal {

	/**
	 * Regla1: los campos son marcados private y final
	 */
	private final String species;
	private final int age;

	/**
	 * Regla4: La clase contiene un objeto mutable, List, pero no hay referencias al objeto
	 * que estén disponibles públicamente
	 */
	private final List<String> favoriteFoods;

	/**
	 * Regla2: el constructor asigna sus valores en la creación
	 */
	public Animal(String species, int age, List<String> favoriteFoods) {
		this.species = species;
		this.age = age;
		if (favoriteFoods == null) {
			throw new RuntimeException("favoriteFoods is required");
		}
		this.favoriteFoods = new ArrayList<String>(favoriteFoods);
	}

	/**
	 * Regla3: no hay métodos setter y la clase en sí es marcada final, por tanto
	 * los métodos no pueden ser sobrescritos por una subclas
	 */
	public String getSpecies() {
		return species;
	}

	public int getAge() {
		return age;
	}

	/**
	 * Regla5: Se provee dos métodos uno para obtener el número total de comidas favoritas y
	 * otro método para obtener una comida basada en un valor de índice.
	 */
	public int getFavoriteFoodsCount() {
		return favoriteFoods.size();
	}

	public String getFavoriteFood(int index) {
		return favoriteFoods.get(index);
	}
}
