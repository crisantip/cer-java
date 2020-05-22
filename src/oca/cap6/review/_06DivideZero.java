/**
 * ¿Qué sucederá si agrega la declaración system.out.println (5/0); a un método main ()? 
 *  
 * A. It will not compile.
 * B. It will not run.
 * (C). It will run and throw an ArithmeticException.
 * D. It will run and throw an IllegalArgumentException.
 * E. None of the above
 * 
 * 
 * @author Katty
 * @since 13/02/2019
 */

package cap6.review;

public class _06DivideZero {

	public static void main(String[] args) {
		System.out.println(5/0);		
	}
}
