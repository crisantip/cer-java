package cap3.review;

import java.util.ArrayList;

/**
 * (A). An array has a fixed size.
 * B. An ArrayList has a fixed size.
 * (C). An array allows multiple dimensions.
 * (D). An array is ordered.
 * (E). An ArrayList is ordered.
 * F. An array is immutable.
 * G. An ArrayList is immutable.
 * 
 * Muestra las características de un array y de un ArrayList 
 * 
 * @author Katty
 * @since 11/12/2018
 */
public class _18ArrayArrayList {

	public static void main(String[] args) {

		//Arreglo

		char[]c = new char[4]; //Tiene un tamaño definido, son ordenados, son mutables
		System.out.println(c.length); 
		
		c[0] = 'a';
		c[1] = 'm';
		c[2] = 'o';
		c[3] = 'r';
		
		System.out.println(c[0] + " " + c[1] + " " + c[2] + " " + c[3]);
		
		char[][]t = new char[2][3]; //Puede tener multiples dimensiones
		System.out.println(t.length); 
		
		
		//Array list
		
		ArrayList l = new ArrayList(); //No tiene un tamaño definido, son ordenados, son mutables
		System.out.println(l.size()); 
		
		l.add("prueba");
		l.add(Boolean.TRUE);
		
		System.out.println(l);
		
	}
}
