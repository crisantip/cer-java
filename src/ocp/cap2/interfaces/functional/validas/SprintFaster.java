package cap2.interfaces.functional.validas;

import cap2.interfaces.functional.*;

/*
 * SprintFaster, extiende Sprint y define un método abstracto, 
 * pero este es una sobreescritura del método padre sprint(); 
 * por lo tanto, la interface resultante tiene solamente un método abstracto, 
 * y ésta es considerada una interface funcional*/
public interface SprintFaster extends Sprint {
	public void sprint(Animal animal);
}
