package cap3.review;

/**
 * Prueba de métodos substring
 * 
 * @author Chris
 * @since 11/12/2018
 */
public class _08SubstringMethods {

	public static void main(String[] args) {
		String numbers = "012345678";
		System.out.println(numbers.substring(1, 3)); // imprime 12
		System.out.println(numbers.substring(7, 7)); // imprime una línea en blanco
		System.out.println(numbers.substring(7)); // imprime 78
	}
}
