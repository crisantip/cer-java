package cap3.igualdad;

public class _7ImplementacionEquals {

	private int patas;

	public _7ImplementacionEquals(int patas) {
		this.patas = patas;
	}

	@Override
	public boolean equals(Object obj) {
		_7ImplementacionEquals perroAComparar = (_7ImplementacionEquals)obj;
		return this.patas == perroAComparar.patas;
	}
	
	public static void main(String[] args) {
		_7ImplementacionEquals mia = new _7ImplementacionEquals(4);
		_7ImplementacionEquals negro = new _7ImplementacionEquals(4); 
		System.out.println(mia.equals(negro)); //true porque el método equals es sobreescrito y su definición compara el número de patas
		
		_7ImplementacionEquals abril = new _7ImplementacionEquals(3);
		System.out.println(mia.equals(abril)); //false porque el método equals es sobreescrito y su definición compara el número de patas
	}
}