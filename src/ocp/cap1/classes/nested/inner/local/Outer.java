package cap1.classes.nested.inner.local;

/*
 * Ejemplo de Local Inner Class (Clase interna local), que se define dentro de un método
 */
public class Outer {

	private int length = 5;

	public void calculate() {

		final int width = 20;

		// Clase Interna Local, pertenece al método calculate()
		class Inner {
			public void multiply() {
				/*
				 * la clase puede acceder a variables de instancia y variables final (o
				 * efectivamente final)
				 */
				System.out.println(length * width);
			}
		}

		Inner inner = new Inner();
		inner.multiply();
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.calculate();
	}
}
