package cap2.polimorfismo;

public class Lemur extends Primate implements HasTail {
	public int age = 10;

	public boolean isTailStriped() {
		return false;
	}

	public static void main(String[] args) {

		// Lemur, es creado y referenciado
		Lemur lemur = new Lemur();
		System.out.println(lemur.age);

		// La habilidad del objeto Lemur para ser pasado como una instancia
		// de una interface que este implementa, HasTail
		HasTail hasTail = lemur;
		System.out.println(hasTail.isTailStriped());

		// Así como también una instancia de su clase padre, Primate,
		// es la naturaleza del polimorfismo
		Primate primate = lemur;
		System.out.println(primate.hasHair());
		
		/**
		 * Si usas una variable para referirte a un objeto, entonces solamente los
		 * métodos o variables que son parte del tipo de referencia de la variable
		 * pueden ser llamados sin un cast explicito
		 */

		/**
		 * En este ejemplo, la referencia hasTail tiene un acceso directo solamente a
		 * métodos definidos con la interface HasTail; por lo tanto, esta no sabe que la
		 * variable age es parte de un objeto
		 */
		// System.out.println(hastail.age);

		/**
		 * La referencia primate tiene acceso solamente a métodos definidos en la clase
		 * Primate, y no tiene acceso directo al método isTailStriped()
		 */
		//System.out.println(primate.isTailStriped());
		

		//CASTEANDO REFERENCIAS DE OBJETOS

		Lemur lemur1 = new Lemur();
		Primate primate1 = lemur1;
		
		//Al convertir la referencia primate de vuelta a una referencia lemur2 (del tipo Lemur) 
		//sin un cast explícito, el resultado es que el código no compilará.
		//Lemur lemur2 = primate1;
		
		//Al castear explícitamente el objeto a una subclase del objeto Primate,
		//se gana acceso a todos los métodos disponibles en la clase Lemur
		Lemur lemur3 = (Lemur)primate1;
		System.out.println(lemur3.age);
		

	}

	// Salida:
	// 10
	// false
	// true
}
