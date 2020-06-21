package cap2.objetos.inmutables;

import java.util.ArrayList;
import java.util.List;

public final class AnimalNoValido {
	private final List<String> favoriteFoods;

	public AnimalNoValido(List<String> favoriteFoods) {

		/**
		 * Para asegurar que la lista favoriteFoods no sea null, se valida esta en el
		 * constructor y se lanza una excepción si ésta no es provista
		 */
		if (favoriteFoods == null) {
			throw new RuntimeException("favoriteFoods is required");
		}
		this.favoriteFoods = new ArrayList<String>(favoriteFoods);
	}

	/**
	 * El problema en este ejemplo es que se tiene acceso directo a la lista
	 * definida en la instancia de Animal. No pueden cambiar el objeto List al cual
	 * este apunta, pero si pueden modificar los ítems en la lista, por ejemplo
	 * borrando todos los ítems al llamar a getFavoriteFoods().clear()
	 */
	public List<String> getFavoriteFoods() { // MAKES CLASS MUTABLE!
		return favoriteFoods;
	}

}
