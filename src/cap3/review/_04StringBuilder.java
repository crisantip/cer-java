package cap3.review;

/**
 * A. abbaaccc
 * B. abbaccca
 * C. bbaaaccc
 * D. bbaaccca
 * E. An exception is thrown.
 * F. The code does not compile.
 * 
 * Muestra los métodos append e insert 
 * append - agrega contenido al final de la cadena 
 * insert - agrega contenido en un indice especificado, desplazando los elementos existentes al final
 * 
 * @author Chris
 * @since 11/12/2018
 */
public class _04StringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("aaa").insert(1, "bb").insert(4, "ccc");
		// Llama automáticamente a sb.toString()
		System.out.println(sb); // imprime abbaccca
	}
}
