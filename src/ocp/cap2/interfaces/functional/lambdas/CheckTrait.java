package cap2.interfaces.functional.lambdas;

import cap2.interfaces.functional.Animal;

public interface CheckTrait {
	/**
	 * Dado que la interface del método toma un Animal, esto significa que el
	 * parámetro lambda tiene que ser un Animal. Y dado que la interface del método
	 * retorna un boolean, sabemos que el lambda retorna un boolean
	 */
	public boolean test(Animal a);
}
