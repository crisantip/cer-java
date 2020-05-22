/**
 * ¿Qué lambda puede reemplazar la clase MySecret para devolver el mismo valor? 
 * (Escoger todo lo que corresponda) 
 * 
 * (A). caller((e) -> "Poof");
 * B. caller((e) -> {"Poof"});							//No es correcta porque no usa la palabra clave return
 * C. caller((e) -> { String e = ""; "Poof" });			//La variable e es usada desde el lambda y no puede ser redefinida, no tiene la palabra clave return
 * D. caller((e) -> { String e = ""; return "Poof"; });	//La variable e es usada desde el lambda y no puede ser redefinida
 * E. caller((e) -> { String e = ""; return "Poof" });	//La variable e es usada desde el lambda y no puede ser redefinida, no tiene ;
 * (F). caller((e) -> { String f = ""; return "Poof"; });
 * 
 * 
 * @author Katty
 * @since 27/01/2019
 */

package oca.cap4.review;

public class _29Lamda {

}

interface Secret {
	String magic(double d);
}

class MySecret implements Secret {
	public String magic(double d) {
		return "Poof";
	}
}
