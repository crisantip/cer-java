package cap2.patron.factory;

public class Zookeeper {

	public static void main(String[] args) {

		/**
		 * no importa el tipo particular de comida que obtenemos, siempre que sea un
		 * Food (IS-A). Este bajo acoplamiento de ZooKeeper y Food nos permite cambiar
		 * las reglas en FoodFactory en una fecha posterior sin requerir ningún cambio
		 * de código en nuestra clase ZooKeeper. el desarrollador podría castear el
		 * objeto a una subclase particular de Food después de que sea devuelto por
		 * FoodFactory, aunque esa práctica generalmente se desaconseja cuando se usa un
		 * patrón factory, ya que crea una solución fuertemente acoplada
		 */
		final Food food = FoodFactory.getFood("polar bear");
		food.consumed();
	}

}
