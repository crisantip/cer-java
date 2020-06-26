package cap2.patron.builder;

import java.util.*;

/**
 * Esta clase es mutable
 */
public final class AnimalBuilder {

	private String species;
	private int age;
	private List<String> favoriteFoods;

	/**
	 * Todos los métodos setter retornan una instancia del objeto builder this
	 */
	public AnimalBuilder setAge(int age) {
		this.age = age;
		return this;
	}

	public AnimalBuilder setSpecies(String species) {
		this.species = species;
		return this;
	}

	public AnimalBuilder setFavoriteFoods(List<String> favoriteFoods) {
		this.favoriteFoods = favoriteFoods;
		return this;
	}

	/**
	 * El resultado del método build será un objeto inmutable
	 */
	public Animal build() {
		return new Animal(species, age, favoriteFoods);
	}

	public static void main(String[] args) {
		AnimalBuilder duckBuilder = new AnimalBuilder();
		duckBuilder
		.setAge(4)
		.setFavoriteFoods(Arrays.asList("grass", "fish")).setSpecies("duck");

		/**
		 * Creamos un método de construcción del objeto destino, generalmente llamado
		 * build(), lo que le permite interactuar directamente con el constructor de
		 * Animal
		 */
		Animal duck = duckBuilder.build();

		/**
		 * En este ejemplo, nunca guardamos una instancia de nuestro objeto builder, a
		 * menudo, los objetos de builder se usan una vez y luego se descartan. En este
		 * ejemplo no se asigna explícitamente age, para este caso no es requerido. Se
		 * puede hacer que el método build lance una excepción, si ciertos campos
		 * requeridos no son asignados, Alternativamente, el método build() puede
		 * también ser asignado con valores por defecto para cualquier cosa que el
		 * usuario no haya podido especificar en el objeto builder.
		 */
		Animal flamingo = new AnimalBuilder()
				.setFavoriteFoods(Arrays.asList("algae", "insects"))
				.setSpecies("flamingo")
				.build();

	}
}
