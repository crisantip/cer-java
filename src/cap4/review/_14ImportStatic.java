/**
 * ¿Cuál de los siguientes puede reemplazar la línea 2 para compilar este código? (Escoger todo lo que corresponda)
 * 
 * A. import static java.util.Collections;
 * (B). import static java.util.Collections.*;
 * C. import static java.util.Collections.sort(ArrayList<String>);
 * D. static import java.util.Collections;
 * E. static import java.util.Collections.*;
 * F. static import java.util.Collections.sort(ArrayList<String>);
 * 
 * 
 * @author Katty
 * @since 13/01/2019
 */

package cap4.review;

import java.util.*;

//import static java.util.Collections; 							//No hay miembro estático
import static java.util.Collections.*;							//Si hay miembros estáticos
//import static java.util.Collections.sort(ArrayList<String>);	//No aplica a métodos??
//static import java.util.Collections;							//Orden de palabras static e import no es correcta
//static import java.util.Collections.*;						//Orden de palabras static e import no es correcta
//static import java.util.Collections.sort(ArrayList<String>);	//Orden de palabras static e import no es correcta

public class _14ImportStatic {
	public void method(ArrayList<String> list) {
		sort(list);
	}
}