/**
 * ¿Cuál es la salida del siguiente código? 
 * 
 * (A). SpiderArthropod
 * B. ArthropodSpider
 * C. SpiderSpider
 * D. ArthropodArthropod
 * E. The code will not compile because of line 5.
 * F. The code will not compile because of line 9.
 * 
 * 
 * @author Katty
 * @since 02/02/2019
 */

package oca.cap5.review;

public class _13ClassExtends {

}

class Arthropod {
	public void printName(double input) {
		System.out.print("Arthropod");
	}
}

class Spider extends Arthropod {
	public void printName(int input) {
		System.out.print("Spider");
	}

	public static void main(String[] args) {
		Spider spider = new Spider();
		spider.printName(4);
		spider.printName(9.0);
	}
}
