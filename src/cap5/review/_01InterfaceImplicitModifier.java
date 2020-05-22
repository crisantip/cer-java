/**
 * ¿Qué modificadores se aplican implícitamente a todos los métodos de interfaz? 
 * (Elija todo lo que corresponda)
 * 
 * A. protected
 * (B). public	implícito el compilador lo coloca
 * C. static
 * D. void
 * E. abstract	desde java8 pueden existir métodos static y default a los cuales no se les asigna abstract de manera implícita 
 * F. default
 * 
 * 
 * @author Chris
 * @since 28/01/2019
 */

package oca.cap5.review;

public interface _01InterfaceImplicitModifier {
	void metodo();
	default void metodoDefault() {
		System.out.println("Implementación predeterminada");
	}
	
	static void metodoEstatico() {
		System.out.println("Implementación estática");
	}
}
