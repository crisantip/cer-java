package cap2.patron.singleton;

public class LlamaTrainer {

	public boolean feedLlamas(int number0fLlamas) {

		int amountNeeded = 5 * number0fLlamas;

		/**
		 * Este proceso quiere usar el singleton HayStorage, para esto primero llama al
		 * método getInstance() y luego al método public apropiado
		 */
		HayStorage hayStorage = HayStorage.getInstance();

		if (hayStorage.getHayQuantity() < amountNeeded) {
			hayStorage.addHay(amountNeeded + 10);
		}
		boolean fed = hayStorage.removeHay(amountNeeded);

		if (fed)
			System.out.println("Llamas have been Hod");

		return fed;
	}
}
