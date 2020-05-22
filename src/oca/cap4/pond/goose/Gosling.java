package oca.cap4.pond.goose;

import oca.cap4.pond.shore.Bird;

public class Gosling extends Bird { // extends means create subclass
	
	public void swim() {
		floatInWater(); // calling protected member
		System.out.println(text); // calling protected member
	}
	
}
