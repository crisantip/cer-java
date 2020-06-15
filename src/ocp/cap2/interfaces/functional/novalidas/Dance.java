package cap2.interfaces.functional.novalidas;

import cap2.interfaces.functional.*;

/*
 * La interface Dance extiende Sprint, la cual ya incluye un único método abstract, 
 * dando el total de dos métodos abstract; por consiguiente, 
 * esta no puede ser una interface funcional*/
public interface Dance extends Sprint {
	public void dance(Animal animal);

}
