package com.example.localdate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateExample {
	public static void main(String[] args) {
		
		/**LocalDate can be used to store dates like 2015-12-27 without time or time zones.
		LocalDate instances are immutable and hence safe to be used in a multithreaded
		environment.**/
		
		//create local date
		LocalDate date1 = LocalDate.of(2020, 04, 10);
		LocalDate date2 = LocalDate.of(2020, Month.APRIL, 10);
		System.out.println(date1);
		System.out.println(date2);
		
		LocalDate date3 = LocalDate.now();
		System.out.println(date3);
		
		LocalDate date4 = LocalDate.parse("2020-04-10");
		System.out.println(date4);
		/**If you pass invalid values to parse() or of(), you’ll get Date-
TimeParseException. The format of the string passed to parse() must be
exactly of the format 9999-99-99. The month and date values passed to
parse() must be of two digits; a single digit is considered an invalid value. For
days and months with values 1–9, pass 01–09.**/
		
		LocalDate date = LocalDate.parse("2020-04-10");
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getDayOfYear());
		System.out.println(date.getMonth());
		System.out.println(date.getMonthValue());
		System.out.println(date.getYear());
		
		LocalDate anujaBday = LocalDate.parse("1996-05-23");
		LocalDate nikitaBday = LocalDate.parse("1994-02-14");
		System.out.println(anujaBday.isAfter(nikitaBday));
		System.out.println(anujaBday.isBefore(nikitaBday));
		System.out.println(nikitaBday.isBefore(anujaBday));
		
		LocalDate bday = LocalDate.of(1996,05,23);
		System.out.println(bday.minusDays(10));
		System.out.println(bday.minusMonths(2));
		System.out.println(bday.minusWeeks(30));
		System.out.println(bday.minusYears(1));
		
		System.out.println(bday.plusDays(1));
		System.out.println(bday.plusMonths(1));
		System.out.println(bday.plusWeeks(7));
		System.out.println(bday.plusYears(1));
		
		LocalDate first = LocalDate.of(2036,02,28);
		System.out.println(first.withDayOfMonth(1));
		System.out.println(first.withDayOfYear(1));
		System.out.println(first.withMonth(7));
		System.out.println(first.withYear(1));
		
		//If you pass any invalid hours, minutes, or seconds value to the
		//method atTime, it will throw a DateTimeException at runtime
		LocalDate interviewDate = LocalDate.of(2016,02,28);
		System.out.println(interviewDate.atTime(16, 30));
		System.out.println(interviewDate.atTime(16, 30, 20));
		System.out.println(interviewDate.atTime(16, 30, 20, 300));
		System.out.println(interviewDate.atTime(LocalTime.of(16, 30)));

	}

}
