package cap2.patron.singleton;

/***
 * Segundo ejemplo crea un singleton usando un bloque de inicialización estática
 * cuando la clase es cargada
 */
public class StaffRegister {
	// Instantiation using a static block

	private static final StaffRegister instance;

	/**
	 * El bloque de inicialización estático permite que se realicen pasos
	 * adicionales posteriormente a que el singleton ha sido creado. Esta también
	 * permite manejar los casos en los cuales el constructor de StaffRegister lance
	 * una excepción
	 */
	static {
		instance = new StaffRegister();
		// Perform additional steps
	}

	private StaffRegister() {
	}

	public static StaffRegister getInstance() {
		return instance;
	}

	// Data access methods

}
