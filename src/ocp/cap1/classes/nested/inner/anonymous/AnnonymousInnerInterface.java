package cap1.classes.nested.inner.anonymous;

public class AnnonymousInnerInterface {

	// Interface inner
	interface SaleTodayOnly {
		// el modificador de acceso por default en una interface es 'public'
		int dollarsOff();
	}

	public int admission(int basePrice) {

		/*
		 * Clase interna anonima, notar que no tiene nombre. Además, a pesar que
		 * SaleTodayOnly una interface si permite usar 'new' ya que inmediatamente se
		 * provee un cuerpo con la implementación
		 */
		SaleTodayOnly sale = new SaleTodayOnly() {  // La implementación anónima implementa la interface 'SaleTodayOnly'
			@Override
			public int dollarsOff() {
				return 3;
			}
		}; // Requiere ; ya que en esta línea se termina la declaración de la variable 'sale'
		
		return basePrice - sale.dollarsOff();
	}
}
