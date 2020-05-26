package cap1.nestedclasses;

/**
 * Usa una inner class para imprimir "Hi" tres veces
 */
public class Outer {

	private String greeting = "Hi";

	protected class Inner {

		public int repeat = 3;

		public void go() {
			for (int i = 0; i < repeat; i++) {
				// Accede a la variable privada de Outer ya que Inner también pertenece a Outer
				System.out.println(greeting);
			}
		}
	}

	public void callInner() {
		Inner inner = new Inner();
		inner.go();
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.callInner();
	}

}
