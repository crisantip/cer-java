/**
 * ¿Cuál de las siguientes sentencias compila? (Elija todas los que apliquen)
 * 
 * (A). public void moreA(int... nums) {}
 * (B). public void moreB(String values, int... nums) {}
 * C. public void moreC(int... nums, String values) {}
 * D. public void moreD(String... values, int... nums) {}
 * E. public void moreE(String[] values, ...int nums) {}
 * F. public void moreF(String... values, int[] nums) {}
 * (G). public void moreG(String[] values, int[] nums) {}
 * 
 * 
 * @author Katty
 * @since 09/01/2019
 */

package cap4.review;


public class _04Varargs {
	public void moreA(int... nums) {}
	public void moreB(String values, int... nums) {}
	//public void moreC(int... nums, String values) {}		//No compila varargs debe ser el último parámetro
	//public void moreD(String... values, int... nums) {}	//No compila sólo debe existir un varargs
	//public void moreE(String[] values, ...int nums) {}	//No compila no es la definición de un varargs
	//public void moreF(String... values, int[] nums) {}	//No compila varargs debe ser el último parámetro
	public void moreG(String[] values, int[] nums) {}
}


