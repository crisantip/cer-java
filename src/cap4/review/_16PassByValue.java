/**
 * ¿Cuál es el resultado del siguiente programa?
 * 
 * A. -1
 * (B). 9
 * C. 81
 * D. Compiler error on line 9.
 * E. Compiler error on a different line.
 * 
 * 
 * @author Katty
 * @since 20/01/2019
 */

package oca.cap4.review;

public class _16PassByValue {

	public static long square(int x) {
		long y = x * (long) x;
		x = -1;
		return y;
	}

	public static void main(String[] args) {
		int value = 9;
		long result = square(value);
		System.out.println(value);
	}
}
