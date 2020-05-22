package oca.cap3.arreglos;

public class _3CastingArreglos {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String[] cadenas = { "valoresString" };
		Object[] objetos = cadenas;
		String[] nuevamenteCadenas = (String[]) objetos;
		// nuevamenteCadenas[0] = new StringBuilder(); // NO COMPILA, solo se puede almacenar de tipo String
		 
		objetos[0] = new StringBuilder(); // Cuidado! En tiempo de compilación no da problema. En tiempo de ejecución
		// objetos[0] = new Object();   	// lanzará una excepción (ArrayStoreException) ya que no es del tipo
											// correcto, debería ser un String, ver líneas 7 y 8. Para el exam OCA no es
											// obligatorio saber el tipo de excepción que lanza
	}
}
