package cap2.patron.factory;

public abstract class Food {
	private int quantity;

	/**
	 * Todos los constructores de clase y subclase de Food están marcados como
	 * públicos. NO se puede marcar los constructores como privados, ya que esto
	 * evitaría que la clase FoodFactory cree instancias de clases Food. Tampoco
	 * podríamos marcarlos como protegidos, ya que la clase FoodFactory no es una
	 * subclase de ninguna de las clases Food, ni debería serlo.
	 * 
	 * El problema con marcarlos como públicos es que cualquier clase podría pasar
	 * por alto nuestro patrón factory y crear instancias de las clases Food
	 * directamente. Si quisiéramos ajustar nuestro control de acceso, podríamos
	 * haber declarado a estos constructores con acceso default o package-private
	 * (sin modificador)
	 * 
	 * La ventaja de usar el acceso default es que obliga a cualquier clase fuera
	 * del paquete a usar la clase FoodFactory para crear una instancia de un objeto
	 * Food, evitando así que instancie un objeto Food directamente. La única
	 * limitación es que nuestra FoodFactory y todas nuestras clases de Food deben
	 * estar configuradas en el mismo paquete Java. Si existe una clase Food en un
	 * paquete diferente que FoodFactory, y queremos usar FoodFactory para crear una
	 * instancia de la misma, entonces debe proporcionar un método public.
	 * 
	 * Al usar un patrón factory, creamos un código débilmente acoplado que es más
	 * resistente a los cambios en los comportamientos de alimentación animal
	 */
	public Food(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public abstract void consumed();
}
