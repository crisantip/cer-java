package cap3.igualdad;

public class _5MetodoEquals {

	public static void main(String[] args) {
		String x = "Hello World";
		// Por el espacio inicial, y es otro literal diferente a x
		String z = " Hello World".trim();
		System.out.println(x.equals(z)); // true
	}
}