/**
 * ¿Qué código se puede insertar para imprimir el valor 2?
 * 
 * A. Replace line 1 with BirdSeed(2);
 * B. Replace line 2 with BirdSeed(2);
 * C. Replace line 1 with new BirdSeed(2);
 * D. Replace line 2 with new BirdSeed(2);
 * (E). Replace line 1 with this(2);
 * F. Replace line 2 with this(2);
 * 
 * 
 * @author Katty
 * @since 20/01/2019
 */

package cap4.review;

public class _20Constructor {

}

class BirdSeed {
	
	private int numberBags;
	boolean call;

	public BirdSeed() {
		// LINE 1
		//BirdSeed(2);		//No compila constructores deben ser llamados con new
		//new BirdSeed(2);	//No imprime 2 porque están creando un nuevo objeto distinto al que está en el main, la variable no se actualiza ???
		this(2);			//Imprime 2
		call = false;
		// LINE 2
		//BirdSeed(2);		//No compila constructores deben ser llamados con new
		new BirdSeed(2);	//No imprime 2 porque están creando un nuevo objeto distinto al que está en el main, la variable no se actualiza ???
		//this(2);			//this debe ser la primera línea del constructor
	}

	public BirdSeed(int numberBags) {
		this.numberBags = numberBags;
	}

	public static void main(String[] args) {
		BirdSeed seed = new BirdSeed();
		System.out.println(seed.numberBags);
	}
}