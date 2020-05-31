package cap1.classes.nested.inner.anonymous;

public class AnnonymousInnerAsArgument {

	// Interface inner
	interface SaleTodayOnly {
		// el modificador de acceso por default en una interface es 'public'
		int dollarsOff();
	}

	public int pay() {
		return admission(5, new SaleTodayOnly() { // La implementación anónima como argumento
			@Override
			public int dollarsOff() {
				return 3;
			}
		}); // fin de la invocación al método 'admission'
	}

	public int admission(int basePrice, SaleTodayOnly sale) {
		return basePrice - sale.dollarsOff();
	}
}
