package oca.cap3.igualdad;

public class _3OperadorIgualdad {

	public static void main(String[] args) {
		String x = "Hello World";
		// Por el espacio inicial, y es otro literal diferente a x
		String y = " Hello World".trim();
		System.out.println(x == y); // false
	}
}