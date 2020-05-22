/**
 * ¿Cuál es la salida del siguiente código?
 * 
 * A. swing swing 5
 * (B). swing swing 10
 * C. Compiler error on line 2 of Chimp.
 * D. Compiler error on line 5 of Chimp.
 * E. Compiler error on line 6 of Chimp.
 * F. Compiler error on line 7 of Chimp.
 * 
 * 
 * @author Katty
 * @since 09/01/2019
 */

package cap4.review;

import static cap4.my.rope._10Rope.*;

import cap4.my.rope.*;

public class _10Initialization {
	/*
	 * 1: package rope; 
	 * 2: public class Rope { 
	 * 3: public static int LENGTH = 5;
	 * 4: static { 
	 * 5: LENGTH = 10; 
	 * 6: } 
	 * 7: public static void swing() { 
	 * 8:
	 * System.out.print("swing "); 
	 * 9: } 
	 * 10: }
	 * 
	 * 1: import rope.*; 
	 * 2: import static rope.Rope.*; 
	 * 3: public class Chimp {
	 * 4: public static void main(String[] args) { 
	 * 5: Rope.swing(); 
	 * 6: new Rope().swing(); 
	 * 7: System.out.println(LENGTH); 
	 * 8: } 
	 * 9: }
	 */
}

class Chimp {
	public static void main(String[] args) {
		//1. variables/inicializadores estáticos (se hacen una sóla vez)
		//2. variables/inicializadores de instancia (por cada instancia)
		//3. constructor
		
		_10Rope.swing();				//Accede a variable estática crea LENGTH = 5 y 
									//luego lo sobreescribe con el inicializador estático LENGTH = 10 y
									//luego llama al método swing donde imprime "swing "
		
		new _10Rope().swing();			//Llama al método swing donde imprime "swing ", ya no llama a los estáticos 
		
		System.out.println(LENGTH);	//Imprime 10 que fue el último valor con la que fue asignada 
									//la variable (en el inicializador estático)
	}
}
