package oca.cap3.igualdad;

public class _6EjercicioCombinado {

	String name;
	
	public static void main(String[] args) {
		_6EjercicioCombinado c1 = new _6EjercicioCombinado();
		_6EjercicioCombinado c2 = new _6EjercicioCombinado();
		_6EjercicioCombinado c3 = c1;
		System.out.println(c1 == c1); // true, es el mismo objeto
		System.out.println(c1 == c3); // true, las referencias c1 y c3 apuntan al mismo objeto
		System.out.println(c1 == c2); // false, las referencias c1, y c2 apuntan a diferentes objetos
		System.out.println(c1.equals(c2)); 	// false, la clase no tiene implementación de equals
							// por lo que compara como si fuera el operador '=='
	}
}
