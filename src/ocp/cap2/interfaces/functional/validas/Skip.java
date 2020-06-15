package cap2.interfaces.functional.validas;


import cap2.interfaces.functional.*;

/*
 * Skip, extiende Sprint y define un método static y un método default, cada uno con una implementación. 
 * Dado que ninguno de estos métodos son abstract, la interface resultante tiene solamente un método abstract 
 * y es una interface funcional.*/
public interface Skip extends Sprint {
	public default int getHopCount(Kangaroo kangaroo) {
		return 10;
	}

	public static void skip(int speed) {}
	
}