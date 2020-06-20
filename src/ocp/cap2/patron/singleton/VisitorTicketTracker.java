package cap2.patron.singleton;

/**
 * Tercer ejemplo, el singleton VisitorTicketTracker, declara solamente
 * constructores private y devuelve el singleton con un método getInstance().
 * Sin embargo, no crea el objeto singleton cuando la clase es cargada, sino la
 * primera vez que es solicitada por un cliente
 */
public class VisitorTicketTracker {

	// Lazy instantiation (instanciación diferida)

	/**
	 * La referencia static VisitorTicketTracker no permite el modificar final:
	 * private final static VisitorTicketTracker instance;
	 * 
	 * Cuando se especifica final, debe inicializarse: en línea, en el constructor o
	 * en un bloque estático. Dado que en un sigleton se crea la instancia en el
	 * método getInstance, ya no cumpliría con lo mencionado incialmente, por que
	 * daría un error de compilación.
	 */
	private static VisitorTicketTracker instance;

	private VisitorTicketTracker() {
	}

	/**
	 * La implementación de VisitorTicketTracket, como se muestra, no se considera
	 * thread-safe (seguro para hilos o subprocesos) ya que dos hilos podrían llamar
	 * a getInstance() al mismo tiempo, lo que da como resultado la creación de dos
	 * objetos
	 */
	/*public static VisitorTicketTracker getInstance() {
		if (instance == null) {
			instance = new VisitorTicketTracker(); // NOT THREAD-SAFE!
		}

		return instance;
	}*/

	/**
	 * Una solución simple para que sea thread-safe, que es compatible con la
	 * instanciación diferida es usando el modificador synchronized
	 */
	
	public static synchronized VisitorTicketTracker getInstance() {
		if (instance == null) {
			instance = new VisitorTicketTracker(); // THREAD-SAFE!
		}

		return instance;
	}

	// Data access methods

}
