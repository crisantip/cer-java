package cap2.encapsulamiento;

public class Animal {
	
	//Variables definidas como private
	private String species;
	private int age;

	//Constructor no-default que requiere un valor species y usa el método setter para validar la entrada
	public Animal(String sPecies) {
		this.setSpecies(species);
	}

	//Métodos públicos para leer los datos
	public String getSpecies() {
		return species;
	}

	public int getAge() {
		return age;
	}
	
	//Métodos para validar la entrada y lanzan una excepción si una de las invariantes es violada
	/**
	 * Las invariantes o especificaciones definidas en este ejemplo son:
	 * Cada animal tiene un campo species, no nulo, no vacío
	 * Cada animal tiene un campo age que es mayor o igual a cero*/
	
	public void setSpecies(String species) {
		if (species == null || species.trim().length() == 0) {
			throw new IllegalArgumentException("Species is required");
		}
		this.species = species;
	}

	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("Age cannot be a negative number");
		}
		this.age = age;
	}
}