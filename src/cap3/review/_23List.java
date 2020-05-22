package cap3.review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * (A). –1
 * B. 10
 * C. Compiler error on line 4.
 * D. Compiler error on line 5.
 * E. Compiler error on line 6.
 * F. An exception is thrown.
 * 
 * Muestra convertir una lista a un arreglo 
 * 
 * @author Katty
 * @since 12/12/2018
 */
public class _23List {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 4, -1, 5);
		Collections.sort(list); 				//Ordena la lista: -1,4,5,10
		System.out.println(list.toString());	//[-1, 4, 5, 10]
		
		Integer array[] = list.toArray(new Integer[4]); //Crea un array a través de la lista del tipo Integer con el tamaño 4
		System.out.println(array[0]);					//El arreglo está ordenado igual que la lista de tal manera que el índice 0 es -1
		System.out.println(array.length);
		
	}
}
