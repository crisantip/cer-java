package oca.cap3.date.time.format;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class _1Format {

	
	public static void main(String[] args) {
		
		LocalDate fecha = LocalDate.of(1982, Month.APRIL, 9);
		LocalTime tiempo = LocalTime.of(10, 50);
		LocalDateTime fechaTiempo = LocalDateTime.of(fecha, tiempo);
		System.out.println(fecha.format(DateTimeFormatter.ISO_DATE));
		System.out.println(tiempo.format(DateTimeFormatter.ISO_TIME));
		System.out.println(fechaTiempo.format(DateTimeFormatter.ISO_DATE_TIME));
	}
}
