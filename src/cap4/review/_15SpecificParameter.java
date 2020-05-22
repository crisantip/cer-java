/**
 * ¿Cuál es el resultado de las siguientes afirmaciones?
 * 
 * A. bytefloatObject
 * B. intfloatObject
 * C. byteObjectfloat
 * D. intObjectfloat
 * (E). intObjectObject
 * F. byteObjectObject
 * 
 * 
 * @author Katty
 * @since 20/01/2019
 */

package oca.cap4.review;

public class _15SpecificParameter {
	public void print(byte x) {
		System.out.print("byte");
	}

	public void print(int x) {
		System.out.print("int");
	}

	public void print(float x) {
		System.out.print("float");
	}

	public void print(Object x) {
		System.out.print("Object");
	}

	public static void main(String[] args) {
		_15SpecificParameter t = new _15SpecificParameter();
		short s = 123;
		t.print(s);
		t.print(true);
		t.print(6.789);
	}
}
