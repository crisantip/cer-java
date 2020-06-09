package cap2.interfaces.extiende;

/*
 * Interface padre*/
public interface Walk {

	/*
	 * El compilador agrega public a todos los métodos de la interface y abstract a
	 * todos los métodos que no son estáticos ni default
	 */
	boolean isQuadruped();

	/*
	 * Las definiciones de los métodos de la interfaz pueden estar duplicados en una
	 * interfaz hija sin ningún problema
	 */
	abstract double getMaxSpeed();

}
