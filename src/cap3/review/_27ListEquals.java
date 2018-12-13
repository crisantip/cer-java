package cap3.review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A. A
 * (B). B
 * C. C
 * D. An exception is thrown.
 * E. The code does not compile.
 * 
 * Muestra la igualdad entre listas 
 * 
 * @author Katty
 * @since 12/12/2018
 */
public class _27ListEquals {

	public static void main(String[] args) {

		List<String> one = new ArrayList<String>();
		one.add("abc");
		
		List<String> two = new ArrayList<>();
		two.add("abc");
		
		if (one == two)				//No aplica igualdad son objetos distintos
			System.out.println("A");	
		else if (one.equals(two))	//Aplica igualdad en elementos y orden
			System.out.println("B");
		else
			System.out.println("C");
		
	}
}
