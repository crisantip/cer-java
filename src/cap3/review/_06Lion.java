package cap3.review;

/**
 * A. roar roar
 * B. roar roar!!!
 * C. roar!!! roar
 * D. roar!!! roar!!!
 * E. An exception is thrown.
 * F. The code does not compile.
 * 
 * Muestra la inmutabilidad de un String vs la mutabilidad de un StringBuilder
 * 
 * @author Chris
 * @since 11/12/2018
 */
public class _06Lion {

	public void roar(String roar1, StringBuilder roar2) {
		roar1.concat("!!!"); // String es inmutable, por lo tanto roar1 no cambiará
		roar2.append("!!!"); // StringBuilder es mutable, roar2 si cambiará
	}
	
	public static void main(String[] args) {
		String roar1 = "roar";
		StringBuilder roar2 = new StringBuilder("roar");
		new _06Lion().roar(roar1, roar2);
		System.out.println(roar1 + " " + roar2); // imprime roar roar!!!
	}
}
