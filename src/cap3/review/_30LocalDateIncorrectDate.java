package cap3.review;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

/**
 * A. 2018 APRIL 4
 * B. 2018 APRIL 30
 * C. 2018 MAY 10
 * D. Another date.
 * E. The code does not compile.
 * (F). A runtime exception is thrown.
 * 
 * Muestra error en runtime de una fecha incorrecta
 * Java valida en compilación errores de sintaxis, más no de data ni semántica
 * 
 * @author Katty
 * @since 12/12/2018
 */
public class _30LocalDateIncorrectDate {

	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
		
		System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
		//java.time.DateTimeException: Invalid value for DayOfMonth (valid values 1 - 28/31): 40
	}
}
