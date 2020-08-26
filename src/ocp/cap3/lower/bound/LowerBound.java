package cap3.lower.bound;

import java.util.ArrayList;
import java.util.List;

public class LowerBound {

	public static void main(String[] args) {
		List<B> listB = new ArrayList<B>();
		testMethod(listB); // B super B (OK)

		List<A> listA = new ArrayList<>();
		testMethod(listA); // A super B (OK)

		List<C> listC = new ArrayList<>();
//        testMethod(listC); // C super B (NO!)
	}

	public static void testMethod(List<? super B> list) {
//        list.add(new LowerBound().new A()); // A [NO ES UN] B
		list.add(new LowerBound().new B()); // B [ES UN] B
		list.add(new LowerBound().new C()); // C [ES UN] B
	}

	class A {
	}

	class B extends A {
	}

	class C extends B {
	}
}
