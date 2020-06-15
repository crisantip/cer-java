package cap2.polimorfismo;

public class Oceanographer {
	public void checkSound(LiveslnOcean animal) {
		animal.makeSound();
	}

	public void main(String[] args) {
		Oceanographer o = new Oceanographer();
		o.checkSound(new Dolphin());
		o.checkSound(new Whale());
	}

	//Salida:
	//whistle
	//sing
	
}
