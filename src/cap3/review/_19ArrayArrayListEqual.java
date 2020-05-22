package cap3.review;

import java.util.ArrayList;

/**
 * A. Two arrays with the same content are equal.
 * (B). Two ArrayLists with the same content are equal.
 * (C). If you call remove(0) using an empty ArrayList object, it will compile successfully.
 * D. If you call remove(0) using an empty ArrayList object, it will run successfully.
 * E. None of the above.
 * 
 * Muestra equals entre arrays y ArrayList 
 * 
 * @author Katty
 * @since 11/12/2018
 */
public class _19ArrayArrayListEqual {

	public static void main(String[] args) {

		//Arreglo
		String []a = new String[4];
		
		a[0] = "a";
		a[1] = "m";
		a[2] = "o";
		a[3] = "r";
				
		String []b = new String[4];
		
		b[0] = "a";
		b[1] = "m";
		b[2] = "o";
		b[3] = "r";
		
		if (a.equals(b)) //Array no sobreescribe equals por lo tanto usa igualdad de objetos
			System.out.println("Arreglos iguales");
		
		
		//Array list
		
		ArrayList c = new ArrayList();
		
		c.add("a");
		c.add("m");
		c.add("o");
		c.add("r");
		
		ArrayList d = new ArrayList();
		
		d.add("a");
		d.add("m");
		d.add("o");
		d.add("r");
		
		if (c.equals(d)) //Sobreescribe equals mismos elementos en el mismo orden
			System.out.println("ArrayList iguales");
		
		ArrayList e = new ArrayList();
		e.remove(0); //Error en ejecución java.lang.IndexOutOfBoundsException
		
	}
}
