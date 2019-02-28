/**
 * Elija la declaración correcta sobre el siguiente código: 
 * 
 * A. It compiles and runs without issue.
 * B. The code will not compile because of line 2.
 * C. The code will not compile because of line 4.
 * (D). The code will not compile because of line 7.
 * E. It compiles but throws an exception at runtime.
 * 
 * 
 * @author Katty
 * @since 30/01/2019
 */

package cap5.review;

public class _06Interfaces {

}

interface HasExoskeleton {
	abstract int getNumberOfSections();
}

abstract class Insect implements HasExoskeleton {
	abstract int getNumberOfLegs();
}

//línea 7
class Beetle extends Insect {
	
	int getNumberOfLegs() {
		return 6;
	}
	
	//Siendo la primera subclase concreta debe implementar el método getNumberOfSections
	public int getNumberOfSections() {
		return 6;
	}
	
}