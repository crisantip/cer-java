package cap3.review;

/**
 * A. puzzle.reverse();
 * B. puzzle.append("vaJ$").substring(0, 4);
 * C. puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1);
 * D. puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length());
 * E. None of the above.
 * 
 * Muestra la existencia de un método reverse y como a través de otros métodos encadenados se puede llegar al resultado 
 * 
 * @author Katty
 * @since 11/12/2018
 */
public class _14StringBuilderReverse {

	public static void main(String[] args) {
		StringBuilder puzzle = new StringBuilder("Java");
		puzzle.reverse(); //Método reverse simple voltea las letras de la palabra
		System.out.println(puzzle);

		StringBuilder puzzle1 = new StringBuilder("Java");
		puzzle1.append("vaJ$").substring(0, 4); //??
		System.out.println(puzzle1);

		StringBuilder puzzle2 = new StringBuilder("Java");
		puzzle2.append("vaJ$").delete(0, 3).deleteCharAt(puzzle2.length() - 1); //??
		System.out.println(puzzle2);
		
		StringBuilder puzzle3 = new StringBuilder("Java");
		puzzle3.append("vaJ$").delete(0, 3).deleteCharAt(puzzle3.length());
		System.out.println(puzzle3);
		
	}
}
