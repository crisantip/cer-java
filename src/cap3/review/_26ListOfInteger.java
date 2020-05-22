package cap3.review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Cuáles de las siguientes declaraciones son correctas?
 * 
 * (A). The code compiles.
 * (B). The code throws a runtime exception.
 * C. Exactly one of the add statements uses autoboxing.
 * (D). Exactly two of the add statements use autoboxing.
 * E. Exactly three of the add statements use autoboxing.
 * 
 * Muestra el añadir elementos a través de la clase de envoltura 
 * 
 * @author Katty
 * @since 12/12/2018
 */
public class _26ListOfInteger {

	public static void main(String[] args) {

		List<Integer> ages = new ArrayList<>();
		ages.add(Integer.parseInt("5"));	//Convierte un string a un entero primitivo; el método add recibe un primitivo y hace autoboxing a su respectiva clase de envoltura, en este caso Integer
		ages.add(Integer.valueOf("6"));	//Convierte un string a un Integer; no necesita hacer autoboxing
		ages.add(7);						//Añade un elemento de tipo entero primitivo, el método add debe realizar autoboxing
		ages.add(null);	 				//Error en ejecución java.lang.NullPointerException
		
		for (int age : ages) 
			System.out.print(age);
		
	}
}
