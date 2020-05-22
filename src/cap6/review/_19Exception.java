/**
 * ¿Cuál de las siguientes opciones puede insertarse en el espacio en blanco para compilar el código? 
 * (Elegir todos los que aplican) 
 *  
 * A. Exception
 * B. IOException
 * (C). IllegalArgumentException
 * D. RuntimeException
 * (E). StackOverflowError
 * F. None of the above.
 * 
 * 
 * @author Katty
 * @since 27/02/2019
 */

package cap6.review;

import java.io.IOException;

public class _19Exception {

	public static void main(String[] args) {
		try {
		System.out.println("work real hard");
		//} catch (Exception e) {	//No porque es una exception de mayor jerarquía la de abajo queda inalcanzable
		//} catch (IOException e) {	//No porque es una exception de mayor jerarquía la de abajo queda inalcanzable
		//} catch (IllegalArgumentException e) {	//Si es permitido
		//} catch (RuntimeException e) {	//No porque es del mismo tipo
		} catch (StackOverflowError e) {	//Si es permitido
		} catch (RuntimeException e) {
		}
		}
}
