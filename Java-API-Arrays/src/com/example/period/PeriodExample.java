package com.example.period;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {

	public static void main(String[] args) {
		Period period1 = Period.of(1, 2, 7);
		Period period2 = Period.ofYears(2);
		
		LocalDate carnivalStart = LocalDate.of(2050, 12, 31);
		LocalDate carnivalEnd = LocalDate.of(2051, 1, 2);
		Period periodBetween = Period.between(carnivalStart, carnivalEnd);
		System.out.println(periodBetween);
	}
}
