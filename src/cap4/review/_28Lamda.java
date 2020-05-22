/**
 * ¿Cuál de las siguientes expresiones lambda puede completar el espacio en blanco? 
 * (Elija todo lo que corresponda) 
 * 
 * (A). s -> s.isEmpty()
 * B. s -> {s.isEmpty()}
 * C. s -> {s.isEmpty();}
 * (D). s -> {return s.isEmpty();}
 * E. String s -> s.isEmpty()
 * (F). (String s) -> s.isEmpty()
 * 
 * 
 * @author Katty
 * @since 27/01/2019
 */

package oca.cap4.review;

import java.util.ArrayList;
import java.util.List;

public class _28Lamda {

	List<String> list = new ArrayList<>();
	//A
	//list.removeIf(s -> s.isEmpty());
	//B	
	//list.removeIf(s -> {s.isEmpty()});	//No usan return y no tiene ;
	//C	
	//list.removeIf(s -> {s.isEmpty();});	//No usan return
	//D	
	//list.removeIf(s -> {return s.isEmpty();});
	//E	
	//list.removeIf(String s -> s.isEmpty());	//Deba haber paréntesis al rededor de la lista
	//F	
	//list.removeIf((String s) -> s.isEmpty());
	
}
