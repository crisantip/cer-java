package cap1.classes.nested.inner.anonymous;

public class AnnonymousInnerAbstractClass {

	abstract class SaleTodayOnly {
		abstract int dollarsOff();
	}

	public int admission(int basePrice) {

		/*
		 * Clase interna anonima, notar que no tiene nombre. Además, a pesar que
		 * SaleTodayOnly es una clase abstracta si permite usar 'new' ya que
		 * inmediatamente se provee un cuerpo con la implementación (extends)
		 */
		SaleTodayOnly sale = new SaleTodayOnly() { // La implementación anónima extiende la clase abstracta 'SaleTodayOnly'
			@Override
			int dollarsOff() {
				return 3;
			}
		}; // Requiere ; ya que en esta línea se termina la declaración de la variable 'sale'

		return basePrice - sale.dollarsOff();
	}
}
