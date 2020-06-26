package cap2.patron.builder;

import java.util.*;

public final class Animal {

	private final String species;
	private final int age;
	private final List<String> favoriteFoods;


	/**
	 * La clase de destino pueden optar por hacer que el constructor sea private o default (package private), lo que obliga al usuario a confiar en el objeto builder para obtener instancias de la clase de destino.*/
	Animal(String species, int age, List<String> favoriteFoods) {
		this.species = species;
		this.age = age;
		if (favoriteFoods == null) {
			throw new RuntimeException("favoriteFoods is required");
		}
		this.favoriteFoods = new ArrayList<String>(favoriteFoods);
	}

	public String getSpecies() {
		return species;
	}

	public int getAge() {
		return age;
	}

	public int getFavoriteFoodsCount() {
		return favoriteFoods.size();
	}

	public String getFavoriteFood(int index) {
		return favoriteFoods.get(index);
	}
}
