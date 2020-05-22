package cap3.review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A 0 1 –2
 * B. 0 1 –3
 * C. 2 1 –2
 * (D). 2 1 –3
 * E. None of the above.
 * F. The code doesn’t compile.
 * 
 * Muestra orden de hexadecimales y uso de binarySearch 
 * 
 * @author Katty
 * @since 12/12/2018
 */
public class _25ListBinarySearch {

	public static void main(String[] args) {

		List<String> hex = Arrays.asList("30", "8", "3A", "FF");
		Collections.sort(hex);				//30, 3A, 8, FF
		System.out.println(hex.toString());	//[30, 3A, 8, FF]
		
		int x = Collections.binarySearch(hex, "8");		//Lo encuentra en el índice 2 luego de ordenarlo
		int y = Collections.binarySearch(hex, "3A");	//Lo encuentra en el índice 1 luego de ordenarlo
		int z = Collections.binarySearch(hex, "4F");	//De acuerdo al orden se ubicaría en el índice 2, a este se la transforma en negativo y se le resta -1 dando -3
		System.out.println(x + " " + y + " " + z);
		
	}
}
