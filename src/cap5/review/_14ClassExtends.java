/**
 * ¿Qué afirmaciones son ciertas sobre el siguiente código? 
 * (Elija todo lo que corresponda) 
 * 
 * A. The CanBark interface doesn’t compile.
 * B. A class that implements HasVocalCords must override the makeSound() method.
 * (C). A class that implements CanBark inherits both the makeSound() and bark() methods.
 * D. A class that implements CanBark only inherits the bark() method.
 * E. An interface cannot extend another interface.
 * 
 * 
 * @author Katty
 * @since 02/02/2019
 */

package oca.cap5.review;

public class _14ClassExtends {

}

interface HasVocalCords {
	public abstract void makeSound();
}

interface CanBark extends HasVocalCords {
	public void bark();
}