package cap3.review;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

/**
 * A. 3/7/14 11:22 AM
 * B. 5/10/15 11:22 AM
 * C. 3/7/14
 * D. 5/10/15
 * (E). 11:22 AM
 * F. The code does not compile.
 * G. A runtime exception is thrown.
 * 
 * Muestra que se debe observar el formato que se aplica a la fecha en este caso se da formato al 
 * tiempo por tanto los métodos aplicados a la parte fecha no tienen afectación en la respuesta 
 * 
 * @author Katty
 * @since 13/12/2018
 */
public class _33DateTimeFormatter {

	public static void main(String[] args) {

		LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period p = Period.of(1, 2, 3);
		d = d.minus(p); //Fecha cambia a 2014-03-07T11:22:33
		System.out.println(d);
		
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT); //El formato está aplicando al tiempo no a la fecha
		System.out.println(d.format(f));	//11:22
		
	}
}
