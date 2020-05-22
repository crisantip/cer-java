/**
 * ¿Cuál de las siguientes afirmaciones se puede insertar en la línea en blanco 
 * para que el código compilar con éxito? (Elija todo lo que corresponda)
 * 
 * A. Frog
 * B. TurtleFrog
 * C. BrazilianHornedFrog
 * D. CanHop
 * E. Object
 * F. Long
 * 
 * 
 * @author Katty
 * @since 29/01/2019
 */

package oca.cap5.review;

public class _03TiposReferenciaPermitidos {

}

interface CanHop {
}

class Frog implements CanHop {
	public static void main(String[] args) {
		Frog frog = new TurtleFrog();
		TurtleFrog frog1 = new TurtleFrog();
		//BrazilianHornedFrog frog2 = new TurtleFrog();	//BrazilianHornedFrog no es un TurtleFrog
		CanHop frog3 = new TurtleFrog();
		Object frog4 = new TurtleFrog();		
		//Long frog5 = new TurtleFrog();				//No está defida esta clase?????
		
	}
}

class BrazilianHornedFrog extends Frog {
}

class TurtleFrog extends Frog {
}

/*
 * 
 * CanHop Frog --> CanHop BrasilianHornedFrog -> Frog TurtleFrog -> Frog
 * 
 * TurtleFrog -> Frog --> CanHop -> Object
 * 
 * ____ = new TurtleFrog(); // En el espacio puede ir una referencia de
 * cualquier tipo igual o superior en la jerarquía // "isA"
 * 
 * LagartoFrog -> TurtleFrog -> Frog --> CanHop -> Object
 * 
 * LagartoFrog x = (LagartoFrog) new TurtleFrog();
 * 
 */