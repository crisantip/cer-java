package cap3.review;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * A. 5/9/13 11:22 AM
 * (B). 5/10/13 11:22 AM
 * C. 5/9/14
 * D. 5/10/14
 * E. The code does not compile.
 * F. A runtime exception is thrown.
 * 
 * Muestra que el encadenamiento en períodos no aplica, únicamente se mantiene el último método
 * utlizado 
 * 
 * @author Katty
 * @since 13/12/2018
 */
public class _32DateTimeFormatter {

	public static void main(String[] args) {

		LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period p = Period.ofDays(1).ofYears(2);
		d = d.minus(p);	//Sólo aplica el último método es decir ofYears, no aplica encadenamiento desde la izquierda
		System.out.println(d); //Resultado: 2013-05-10T11:22:33
		
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(f.format(d)); //10/05/13 11:22 ??
				
	}
}
