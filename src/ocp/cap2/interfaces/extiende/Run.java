package cap2.interfaces.extiende;

/*
 * Run hereda todos los métodos abstractos de la interface padre Walk*/
public interface Run extends Walk {

	/*
	 * El compilador agrega public a todos los métodos de la interface y abstract a
	 * todos los métodos que no son estáticos ni default
	 */
	public abstract boolean canHuntWhileRunning();

	/*
	 * Las definiciones de los métodos de la interfaz pueden estar duplicados en una
	 * interfaz hija sin ningún problema
	 */
	abstract double getMaxSpeed();
}
