package cap1.classes.nested.statics;

public class OuterForStaticNestedClass {
	private int amout = 4;

	/*
	 * Static Nested Class (clase estática anidada), se define al nivel de miembro
	 */
	static class Nested {
		private int price = 6;
		public int calc() {
			/*
			 * Dado que Nested es una clase estática no puede acceder a la variable de
			 * instancia 'price' de la clase Nested; se requiere un objeto explícito de
			 * OuterForStaticNestedClass.
			 * El código:	return amout * price; 
			 * Da error de compilación:
			 * 'Cannot make a static reference to the non-static field amout'
			 */
			return new OuterForStaticNestedClass().amout * price;
		}
	}

	public static void main(String[] args) {
		/*
		 * Dado que Nested es una clase estática se puede instanciarla directamente; no
		 * es necesario una instancia de la clase OuterForStaticNestedClass para usarla.
		 */
		Nested nested = new Nested();
		/*
		 * Se puede acceder a variables de instancia private, desde OuterForStaticNestedClass
		 */
		System.out.println(nested.price);  // 4
		new OtherClass().foo(); // 24
	}
}

class OtherClass {
	/*
	 * Para referenciar a una clase estática anidada se debe usar, como especie de
	 * namespace, el nombre de la clase que la contiene
	 */
	public void foo() {
		OuterForStaticNestedClass.Nested staticNested = new OuterForStaticNestedClass.Nested();
		System.out.println(staticNested.calc());
	}
}