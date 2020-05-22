/**
 * ¿Cuál de las siguientes sentencias compila? (Elija todas los que apliquen)
 * 
 * (A). public void methodA() { return;}
 * B. public void methodB() { return null;}
 * (C). public void methodC() {}
 * (D). public int methodD() { return 9;}
 * E. public int methodE() { return 9.0;}
 * F. public int methodF() { return;}
 * G. public int methodG() { return null;}
 * 
 * 
 * @author Katty
 * @since 09/01/2019
 */

package cap4.review;


public class _03MethodSignatureReturn {
	public void methodA() { return;}
	//public void methodB() { return null;}	//No compila siendo void no debe retornar nada
	public void methodC() {}
	public int methodD() { return 9;}
	//public int methodE() { return 9.0;}	//No compila está retornando un double cuando el método espera un int
	//public int methodF() { return;}		//No compila se espera un retorno de un entero
	//public int methodG() { return null;}	//No compila está retornando un null cuando el método espera un int
	
}


