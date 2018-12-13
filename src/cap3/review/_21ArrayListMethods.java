package cap3.review;

import java.util.ArrayList;
import java.util.List;

/**
 * A. 4
 * B. 5
 * (C). 6
 * D. 46
 * E. 45
 * F. An exception is thrown.
 * G. The code does not compile.
 * 
 * Muestra los métodos set, add y remove aplicados a un ArrayList 
 * 
 * @author Katty
 * @since 12/12/2018
 */
public class _21ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<Integer> values = new ArrayList<>();
		values.add(4);		//Añade el 4 en el índice 0
		values.add(5);		//Añade el 5 en el índice 1
		values.set(1, 6);	//Reemplaza el 6 en el índice 1 45 pasa a 46
		values.remove(0);	//Elimina el elemnto ubicado en el índice 0 es decir el 4 quedando 6
		
		for (Integer v : values) 
			System.out.print(v);
		
	}
}
