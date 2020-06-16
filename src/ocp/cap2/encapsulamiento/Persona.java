package cap2.encapsulamiento;

public class Persona {

	/**
	 * Es una buena práctica de diseño siempre encapsular todas las variables en una
	 * clase. Aún si el campo name pueda ser cambiado sin apliacr ninguna regla.
	 * 
	 * La ventaja viene del hecho que los escritores de la clase pueden actualizar
	 * el método getter o setter para tener reglas más complejas sin causar que los
	 * usuarios de la clase tengan que recompilar su código.
	 * 
	 * Por ejemplo: el requerimiento para la variable name es que el string no sea
	 * vacío y no venga espacios en blanco o null
	 * 
	 */

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = (name == null || name.trim().length() == 0) ? null : name;
	}
}
