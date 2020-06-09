package cap2.interfaces.implementa;

public interface Fly {

	/*
	 * Método que declara una excepción. La regla de sobreescritura permite eliminar
	 * la excepción en el método sobrescrito en la clase Eagle
	 */
	public int getWingSpan() throws Exception;

	/*Miembro estático disponible sin una instancia de la interface*/
	public static final int MAX_SPEED = 100;

	/*
	 * Método default que ha sido opcionalmente sobreescrito en la clase Eagle*/
	public default void land() {
		System.out.println("Animal is landing");
	}

	/*Miembro estático disponible sin una instancia de la interface*/
	public static double calculateSpeed(float distance, double time) {
		return distance / time;
	}

}

