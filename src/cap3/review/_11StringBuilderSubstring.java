package cap3.review;

/**
 * A. 1
 * B. 2
 * C. 3
 * D. 7
 * E. An exception is thrown.
 * F. The code does not compile.
 * 
 * Muestra que cuando se realiza un substring de un índice hasta menor al índice desde 
 * se produce una excepción
 * 
 * @author Katty
 * @since 11/12/2018
 */
public class _11StringBuilderSubstring {

	public static void main(String[] args) {
		int total = 0;
		StringBuilder letters = new StringBuilder("abcdefg");
		total += letters.substring(1, 2).length(); //el substring es b el length 1
		total += letters.substring(6, 6).length(); //el substring es vacio el length 0
		total += letters.substring(6, 5).length(); //StringIndexOutOfBoundsException 
		System.out.println(total);
		
	}
}
