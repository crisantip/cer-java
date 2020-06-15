package cap2.polimorfismo;

/**
 * Oceanographer incluye un método llamado checkSound() que es capaz de aceptar
 * cualquier objeto cuya clase implemente la interface LivesInOcean
 */
public class Oceanographer {
	public void checkSound(LiveslnOcean animal) {
		animal.makeSound();
	}

	public void main(String[] args) {
		Oceanographer o = new Oceanographer();
		o.checkSound(new Dolphin());
		o.checkSound(new Whale());
	}

	// Salida:
	// whistle
	// sing

}
