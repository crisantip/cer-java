package cap3.review;

/**
 * (A). one
 * B. two
 * (C). three
 * (D). four
 * E. five
 * F. The code does not compile.
 * 
 * Muestra las diferencias entre igualdad referencial y lógica
 * 
 * @author Chris
 * @since 11/12/2018
 */
public class _02Equality {

	public static void main(String[] args) {
		String s = "Hello";
		String t = new String(s);
		if ("Hello".equals(s)) System.out.println("one"); // igualdad lógica si se cumple,									imprime one
		if (t == s) System.out.println("two"); // igualdad referencial no se cumple, s y t son objetos diferentes
		if (t.equals(s)) System.out.println("three"); // igualdad logica si se cumple, 										imprime three
		if ("Hello" == s) System.out.println("four"); // igualdad referencial si se cumple en literales por el StringPool, 	imprime four
		if ("Hello" == t) System.out.println("five"); // igualdad referencial no se cumple, t no es un literal
	}
}
