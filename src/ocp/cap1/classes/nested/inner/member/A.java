package cap1.classes.nested.inner.member;

/*
 * Las clases anidadas pueden tener nombres de variables iguales, vea 'x' en el siguiente ejemplo:
 */
public class A {

	private int x = 10;

	class B {
		
		private int x = 20;

		class C {
			
			private int x = 30;

			private void allThenX() {
				System.out.println(x);			// 30
				System.out.println(this.x);		// 30
				System.out.println(B.this.x);	// 20
				System.out.println(A.this.x);	// 10
			}
		}
	}
	
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();		// B b = a.new B();
		A.B.C c = b.new C();	// B.C c = b.new C();
		c.allThenX();
	}
}
