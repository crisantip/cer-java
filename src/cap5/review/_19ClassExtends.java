/**
 * ¿Cuál de las siguientes afirmaciones se puede insertar en el espacio en blanco 
 * para que el código compilar con éxito? (Elija todo lo que corresponda)
 *  
 * (A). new Cobra()
 * B. new GardenSnake()
 * (C). new Snake()
 * D. new Object()
 * E. new String("Snake")
 * (F). null
 * 
 * 
 * @author Katty
 * @since 04/02/2019
 */

package cap5.review;

public class _19ClassExtends {

}

class Snake {
}

class Cobra extends Snake {
}

class GardenSnake {
}

class SnakeHandler {
	private Snake snake;

	public void setSnake(Snake snake) {
		this.snake = snake;
	}

	public static void main(String[] args) {
		new SnakeHandler().setSnake(new Cobra());
		//new SnakeHandler().setSnake(new GardenSnake());		//No tiene relación con Snake
		new SnakeHandler().setSnake(new Snake());
		//new SnakeHandler().setSnake(new Object());			//Object no es subclase de Snake es superclase
		//new SnakeHandler().setSnake(new String("Snake"));		//El método espera un tipo Sanake
		new SnakeHandler().setSnake(null);		
		
	}
}