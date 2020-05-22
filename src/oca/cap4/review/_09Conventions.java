/**
 * ¿Cuáles son los métodos que utilizan las convenciones de nomenclatura de JavaBeans para los 
 * accesores y mutadores? (Elija todo lo que corresponda)
 * 
 * A. public boolean getCanSwim() { return canSwim;}
 * B. public boolean canSwim() { return numberWings;}
 * (C). public int getNumWings() { return numberWings;}	//No es correcto
 * D. public int numWings() { return numberWings;}
 * (E). public void setCanSwim(boolean b) { canSwim = b;}
 * 
 * 
 * @author Katty
 * @since 09/01/2019
 */

package oca.cap4.review;

public class _09Conventions {
	public boolean canSwim;
	public boolean numberWings;
	public int numberWings1;

	public boolean getCanSwim() {return canSwim;}	//No usa convención, el nombre del método accesor debe ser isNombreMetodo cuando es un boolean

	public boolean canSwim() {return numberWings;} 	//No usa convención, el nombre del método accesor debe ser isNombreMetodo cuando es un boolean y 
													//el nombre de la variable de retorno debe ser igual que el nombre del método sin is

	public int getNumWings() {return numberWings1;}	//No usa convención, el nombre de la variable de retorno debe ser igual que el nombre del método sin get

	public int numWings() {return numberWings1;}	//No usa convención, el nombre del método accesor debe ser getNombreMetodo cuando es distinto de boolean y
													//el nombre de la variable de retorno debe ser igual que el nombre del método sin get
	
	public void setCanSwim(boolean b) {canSwim = b;}	//Si usa convención, nombre del método mutador debe ser setNombreMetodo y 
														//el nombre de la variable de retorno debe ser igual que el nombre del método sin set
	
}
