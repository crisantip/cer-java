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
 * A. 2018 APRIL 2
 * (B). 2018 APRIL 30
 * C. 2018 MAY 2
 * D. 2021 APRIL 2
 * E. 2021 APRIL 30
 * F. 2021 MAY 2
 * G. A runtime exception is thrown.
 * 
 * Muestra que la fecha es inmutable
 * 
 * @author Katty
 * @since 13/12/2018
 */
public class _31DateInmutable {

	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
		date.plusDays(2);	//Añade 2 días pero date no cambia 
		date.plusYears(3);	//Añade 3 años pero date no cambia
		System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth()); //2018 APRIL 30
		
	}
}
