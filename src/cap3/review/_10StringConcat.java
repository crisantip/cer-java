package cap3.review;

/**
 * A. Compile error on line 14.
 * B. Compile error on line 15.
 * C. Compile error on line 16.
 * D. Compile error on another line.
 * E. ==
 * F. equals
 * G. An exception is thrown.
 * 
 * Muestra que cuando se concatena un String con un valor de cualquier otro
 * tipo, da como resultado un String
 * 
 * @author Chris
 * @since 11/12/2018
 */
public class _10StringConcat {

	public static void main(String[] args) {
		String a = "";
		a += 2; // Si se puede concatenar String con int
		a += 'c'; // Si se puede concatenar String con char
		a += false; // Si se puede concatenar String con boolean
		if (a == "2cfalse") System.out.println("=="); // no cumple igualdad referencial
		if (a.equals("2cfalse")) System.out.println("equals"); // imprime equals
	}
}
