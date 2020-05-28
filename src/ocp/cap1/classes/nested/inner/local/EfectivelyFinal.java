package cap1.classes.nested.inner.local;

/*
 * Una variable es efectivamente final cuando se le asigna un valor por una única vez
 */
public class EfectivelyFinal {

	public void isItFinal() {
		// one es efectivamente final
		int one = 20;
		
		// no es efectivamente final ya que se asigna un valor en las líneas 13 y 14 
		int two = one;
		two++;
		
		// three es efectivamente final, solo se asigna en las líneas 19 ó 21
		int three;
		if (one == 4) {
			three = 3;
		} else {
			three = 4;
		}
		
		// four no es efectivamente final, se asigna en las líneas 25 y 28
		int four = 4;
		
		class Inner {
		
		}
		four = 5;
	}
}
