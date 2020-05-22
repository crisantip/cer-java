/**
 * ¿Cuál de estas clases compila y usa un constructor DEFAULT? (Elija todo lo que corresponda)
 * 
 * (A). public class Bird { }
 * B. public class Bird { public bird() {} }
 * C. public class Bird { public bird(String name) {} }
 * D. public class Bird { public Bird() {} }
 * E. public class Bird { Bird(String name) {} }
 * F. public class Bird { private Bird(int age) {} }
 * (G). public class Bird { void Bird() { }
 * 
 * 
 * @author Katty
 * @since 20/01/2019
 */

package oca.cap4.review;

public class _19DefaultConstructor {

}

//A
class Bird1 {
} // Si posee un constructor default porque no es necesario escribirlo

//B
class Bird2 {
	//public bird2() {}				//No es constructor válido ni default porque no tiene el mismo nombre de la clase, case sensitive
}

//C
class Bird3 {
	//public bird3(String name) {}	//No es constructor válido ni default porque no tiene el mismo nombre de la clase, case sensitive
}

//D
class Bird4 {
	public Bird4() {			//Si es un constructor válido pero no es default porque ha sido definido por el usuario
	}
}

//E
class Bird5 {
	Bird5(String name) {		//Si es un constructor válido pero no es default porque ha sido definido por el usuario
	}
}

//F
class Bird6 {
	private Bird6(int age) {	//Si es un constructor válido pero no es default porque ha sido definido por el usuario
	}
}

//G
class Bird7 {
	void Bird7() { }	//El ejemplo describe un método y no tiene un constructor definido por el usuario, por tanto existe el constructor default
}
