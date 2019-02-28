/**
 * ¿Qué afirmaciones son correctas sobre el siguiente código? 
 * (Elija todo lo que corresponda)
 * 
 * A. It will compile without issue.
 * B. It fails to compile because the type of the exception the method throws is a subclass of
 * the type of exception the parent method throws.
 * (C). It fails to compile because the return types are not covariant.
 * D. It fails to compile because the method is protected in the parent class and public in
 * the subclass.
 * (E). It fails to compile because of a static modifier mismatch between the two methods.
 * 
 * 
 * @author Katty
 * @since 29/01/2019
 */

package cap5.review;

public class _04Extender {

}

class Rodent {
	protected static Integer chew() throws Exception {
		System.out.println("Rodent is chewing");
		return 1;
	}
}

class Beaver extends Rodent {
	//public Number chew() throws RuntimeException {			//Number no es un tipo covariante con Integer y no es estático como el padre
	//	System.out.println("Beaver is chewing on wood");
	//	return 2;
	//}
	
	public static Integer chew() throws RuntimeException {
		System.out.println("Beaver is chewing on wood");
		return 2;
	}	
}

