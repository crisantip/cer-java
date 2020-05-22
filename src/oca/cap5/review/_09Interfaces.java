/**
 * Elija la declaración correcta sobre el siguiente código: 
 * 
 * (A). It compiles without issue.
 * B. The code will not compile because of line 2.
 * C. The code will not compile because of line 4.
 * D. The code will not compile because of line 5.
 * E. The code will not compile because of lines 2 and 5.
 * F. The code will not compile because the class Falcon doesn’t implement the interface methods.
 * 
 * 
 * @author Katty
 * @since 30/01/2019
 */

package oca.cap5.review;

public class _09Interfaces {

}

interface CanFly {
	void fly();	//public abstract lo coloca el compilador
}

interface HasWings {
	public abstract Object getWindSpan();
}

abstract class Falcon implements CanFly, HasWings {	//No requiere implementar los métodos abstractos siendo una clase abstracta ????
}

