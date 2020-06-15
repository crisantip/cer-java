package cap2.interfaces.functional.novalidas;

/*
 * La interface Crowl define dos métodos abstractos; por lo tanto esta no puede ser una interface funcional
 * En estos ejemplos, aplicando la anotación @FunctionalInterface a cualquiera de estas interfaces 
 * resultará en un error de compilación, como lo haría intentar usarlas implícitamente 
 * como interfaces funcionales en una expresión lambda
 * */
public interface Crawl {
	public void crawl();

	public int getCount();
}
