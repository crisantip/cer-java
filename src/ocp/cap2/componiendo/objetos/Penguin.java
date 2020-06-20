package cap2.componiendo.objetos;

/**
 * Componemos una nueva clase que contiene instancias de Flippers (aletas) y
 * WebbedFeet (pies palmeados) y delega sus métodos a ellos
 */
public class Penguin {

	private final Flippers flippers;
	private final WebbedFeet webbedFeet;

	public Penguin() {
		this.flippers = new Flippers();
		this.webbedFeet = new WebbedFeet();
	}

	//Método aletear se delega a la clase Flippers
	public void flap() {
		this.flippers.flap();
	}

	//Método patear se delega a la clase WebbedFeet
	public void kick() {
		this.webbedFeet.kick();
	}

}
