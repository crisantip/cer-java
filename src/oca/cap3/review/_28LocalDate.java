package cap3.review;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

/**
 * Qué código aplica para crear la fecha: June 21, 2014
 * 
 * A. new LocalDate(2014, 5, 21);
 * B. new LocalDate(2014, 6, 21);
 * C. LocalDate.of(2014, 5, 21);
 * (D). LocalDate.of(2014, 6, 21);
 * E. LocalDate.of(2014, Calendar.JUNE, 21);
 * (F). LocalDate.of(2014, Month.JUNE, 21);
 * 
 * Muestra la creación de fechas
 * 
 * @author Katty
 * @since 12/12/2018
 */
public class _28LocalDate {

	public static void main(String[] args) {

			
		//LocalDate date = new LocalDate(2014, 5, 21);	//No existe esta forma
		//LocalDate date1 = new LocalDate(2014, 6, 21);	//No existe esta forma
		LocalDate date2 = LocalDate.of(2014, 5, 21);
		System.out.println(date2);
		LocalDate date3 = LocalDate.of(2014, 6, 21);
		System.out.println(date3);
		LocalDate date4 = LocalDate.of(2014, Calendar.JUNE, 21);
		System.out.println(date4);
		LocalDate date5 = LocalDate.of(2014, Month.JUNE, 21);
		System.out.println(date5);
		
	}
}
