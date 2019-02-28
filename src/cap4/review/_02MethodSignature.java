/**
 * ¿Cuál de las siguientes sentencias compila? (Elija todas los que apliquen)
 * 
 * (A). final static void method4() { }
 * B. public final int void method() { }
 * C. private void int method() { }
 * (D). static final void method3() { }
 * E. void final method() {}
 * F. void public method() { }
 * 
 * @author Katty
 * @since 09/01/2019
 */

package cap4.review;


public class _02MethodSignature {
	final static void method4() { }
	//public final int void method() { }	//No compila sólo debe tener un retorno
	//private void int method() { }			//No compila sólo debe tener un retorno
	static final void method3() { }
	//void final method() {}				//No compila el retorno debe estar junto al nombre del método
	//void public method() { }				//No compila el retorno debe estar junto al nombre del método
}


