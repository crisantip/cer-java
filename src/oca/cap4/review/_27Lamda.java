/**
 * ¿Cuál es el resultado de la siguiente clase? 
 * 
 * A. ok
 * B. too high
 * (C). Compiler error on line 7.
 * D. Compiler error on line 10.
 * E. Compiler error on a different line.
 * F. A runtime exception is thrown.
 * 
 * 
 * @author Katty
 * @since 27/01/2019
 */

package cap4.review;

import java.util.function.*;

public class _27Lamda {

}

interface Climb {
	boolean isTooHigh(int height, int limit);
}

class Climber {
	public static void main(String[] args) {
		//línea 7		
		//check((h, l) -> h.append(l).isEmpty(), 5);
	}

	private static void check(Climb climb, int height) {
		//línea 10		
		if (climb.isTooHigh(height, 10))
			System.out.println("too high");
		else
			System.out.println("ok");
	}
}