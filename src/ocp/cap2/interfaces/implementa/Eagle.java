package cap2.interfaces.implementa;

public class Eagle implements Fly {

	/*
	 * Método sobrescrito, eliminando la excepción 
	 * */
	public int getWingSpan() {
		return 15;
	}

	/*
	 * Método default sobrescrito de manera opcional
	 * */
	public void land() {
		System.out.println("Eagle is diving fast");
	}
}
