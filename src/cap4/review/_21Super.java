/**
 * ¿Cuál de las siguientes opciones completa el constructor para que este código se imprima en 50? 
 * (Escoger todo lo que corresponda)
 * 
 * A. numSpots = numSpots;
 * B. numSpots = this.numSpots;
 * (C). this.numSpots = numSpots;
 * D. numSpots = super.numSpots;
 * E. super.numSpots = numSpots;
 * F. None of the above.
 * 
 * 
 * @author Katty
 * @since 21/01/2019
 */

package cap4.review;

public class _21Super {

}

class Cheetah {
	int numSpots;

	public Cheetah(int numSpots) {

		// INSERT CODE HERE
		//A
		//numSpots = numSpots;			//Imprime 0	setea el parámetro del constructor a si mismo dejando la variable de instancia con 0
		//B
		//numSpots = this.numSpots;		//Imprime 0	setea la variable de instancia al parámetro del constructor dejando la variable de instanca con su mismo valor 0
		//C
		this.numSpots = numSpots;		//Imprime 50 setea la variable de instancia con el valor del parámetro del constructor
		//D
		//numSpots = super.numSpots; 	//No compila
		//E
		//super.numSpots = numSpots;	//No compila
		
	}

	public static void main(String[] args) {
		System.out.println(new Cheetah(50).numSpots);
	}
}
