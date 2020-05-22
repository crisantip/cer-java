/**
 * ¿Cuál es el resultado del siguiente código? 
 * 
 * (A). match
 * B. not match
 * C. Compiler error on line 8.
 * D. Compiler error on line 10.
 * E. Compiler error on line 11.
 * F. A runtime exception is thrown.
 * 
 * 
 * @author Katty
 * @since 27/01/2019
 */

package oca.cap4.review;

import java.util.function.*;

public class _26Lamda {

}

class Panda {
	int age;

	public static void main(String[] args) {
		Panda p1 = new Panda();
		p1.age = 1;
		//línea 8
		check(p1, p -> p.age < 5);
	}

	//línea 10
	private static void check(Panda panda, Predicate<Panda> pred) {
		//línea 11
		String result = pred.test(panda) ? "match" : "not match";
		System.out.print(result);
	}
}

