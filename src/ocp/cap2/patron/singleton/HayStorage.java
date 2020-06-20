package cap2.patron.singleton;

/**
 * Primer ejemplo HayStorage, instanciamos un objeto singleton directamente en
 * la definición de la referencia instance
 */
public class HayStorage {

	private int quantity = 0;

	/**
	 * Todos los constructores en una clase singleton son marcados private, lo cual
	 * asegura que ninguna otra clase es capaz de instanciar otra versión de la
	 * clase. Al marcar los constructores como private, hemos marcado implícitamente
	 * la clase como final.
	 */
	private HayStorage() {
	}

	/**
	 * Variables private static dentro de la clase, normalmente con el nombre
	 * instance
	 */
	private static final HayStorage instance = new HayStorage();

	/**
	 * Accedida por medio de un único método public static, a menudo llamado
	 * getInstance(), el cual devuelve la referencia al objeto singleton
	 */
	public static HayStorage getInstance() {
		return instance;
	}

	/**
	 * Métodos con el modificador synchronized, que evita que dos hilos ejecuten el
	 * mismo método exactamente al mismo tiempo
	 */
	public synchronized void addHay(int amount) {
		quantity += amount;
	}

	public synchronized boolean removeHay(int amount) {
		if (quantity < amount)
			return false;
		quantity -= amount;
		return true;
	}

	public synchronized int getHayQuantity() {
		return quantity;
	}

}
