package oca.cap3.review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A. 2
 * B. 4
 * C. 6
 * (D). The result is undefined.
 * E. An exception is thrown.
 * F. The code does not compile.
 * 
 * Muestra los métodos set, add y remove aplicados a un ArrayList 
 * 
 * @author Katty
 * @since 12/12/2018
 */
public class _22ArrayBinarySearch {

	public static void main(String[] args) {

		int[] random = { 6, -4, 12, 0, -10 };
		int x = 12;
		int y = Arrays.binarySearch(random, x); //El arreglo debe estar ordenado en contenido sino el resultado es indefinido
		System.out.println(y);

		int[] random1 = { 6, -4, 6, 7, 12, 0, -10 };
		int x1 = 12;
		int y1 = Arrays.binarySearch(random1, x1); //El arreglo debe estar ordenado en contenido sino el resultado es indefinido
		System.out.println(y1);
		
	}
}
