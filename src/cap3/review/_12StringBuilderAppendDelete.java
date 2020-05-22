package cap3.review;

/**
 * (A). 01+89–
 * B. 012+9–
 * C. 012+–9
 * D. 0123456789
 * E. An exception is thrown.
 * F. The code does not compile.
 * 
 * Muestra que el delete elimina los elmentos comprendidos desde el índice inicial incluido 
 * hasta el índice final NO incluido y que los métodos se van aplicando de izquierda a derecha
 * 
 * @author Katty
 * @since 11/12/2018
 */
public class _12StringBuilderAppendDelete {

	public static void main(String[] args) {
		StringBuilder numbers = new StringBuilder("0123456789");
		numbers.delete(2, 8); //Elimina los elementos desde el índice 2 hasta el índice 8 no incluido -> 0189
		numbers.append("-").insert(2, "+"); //Añade un guión al final con append e inserta en el índice 2 que es el 8 un + -> 01+89-
		System.out.println(numbers);
		
	}
}
