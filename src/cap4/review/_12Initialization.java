/**
 * ¿Cuál es la salida del siguiente código?
 * 
 * (A). 02
 * B. 08
 * C. 2
 * D. 8
 * E. The code does not compile.
 * F. An exception is thrown.
 * 
 * 
 * @author Katty
 * @since 12/01/2019
 */

package cap4.review;

import static cap4.my.rope._12Rope.*;

import cap4.my.rope.*;

public class _12Initialization {

}

class RopeSwing {
	private static _12Rope rope1 = new _12Rope();
	private static _12Rope rope2 = new _12Rope();
	{
		System.out.println(rope1.length);
	}

	public static void main(String[] args) {
		rope1.length = 2;
		rope2.length = 8;
		System.out.println(rope1.length);
	}
}