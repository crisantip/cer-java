/**
 * ¿Cuántos errores de compilador hay en el siguiente código?
 * 
 * A. 0
 * B. 1
 * C. 2
 * D. 3
 * (E). 4
 * F. 5
 * 
 * 
 * @author Katty
 * @since 13/01/2019
 */

package oca.cap4.review;

public class _13Initialization {

}

class RopeSwing13 {

	private static final String leftRope;
	private static final String rightRope;
	//private static final String bench;
	private static final String name = "name";

	static {
		leftRope = "left";
		rightRope = "right";
	}
	static {
		//name = "name";			//No se puede asignar un valor a una variable estática final, que ya tiene un valor asignado
		//rightRope = "right";	//No se puede asignar un valor a una variable final que ya fue asignada en el bloque de inicialización anterior
	}

	public static void main(String[] args) {
		//bench = "bench";		//No se puede asignar un valor a una variable final ????? por cua
	}
}
