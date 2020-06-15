package cap2.interfaces.functional;

/*
 *La clase Tiger es una clase válida que implementa la interface 
 */
public class Tiger implements Sprint {
	public void sprint(Animal animal) {
		System.out.println("Animal is sprinting fast!" + animal.toString());
	}
}
