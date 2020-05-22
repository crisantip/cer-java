/**
 * ¿Cuál de los siguientes son generados por el siguiente código? (Elija todo lo que corresponda)
 * 
 * A. s1 = a
 * (B). s1 = s1
 * C. s2 = s2
 * (D). s2 = s2b
 * (E). s3 = a
 * F. s3 = null
 * G. The code does not compile.
 * 
 * 
 * @author Katty
 * @since 20/01/2019
 */

package oca.cap4.review;

public class _17PassByReference {

	public static StringBuilder work(StringBuilder a, StringBuilder b) {
		a = new StringBuilder("a");
		b.append("b");
		return a;
	}

	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("s1");
		StringBuilder s2 = new StringBuilder("s2");
		StringBuilder s3 = work(s1, s2);
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
	}

}
