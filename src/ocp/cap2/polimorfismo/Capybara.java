package cap2.polimorfismo;

public class Capybara extends Rodent {
	public static void main(String[] args) {

		/**
		 * Este código crea una instancia de Rodent y entonces trata de castearlo a una
		 * subclase de Rodent, Capybara. Aunque este código compilará sin problemas,
		 * lanzará un ClassCastException en runtime ya que el objeto que está siendo
		 * referenciado no es una instancia de la clase Capybara
		 */
		Rodent rodent = new Rodent();
		Capybara capybara = (Capybara) rodent;	//lanzará un ClassCastException en runtime
	}

}
