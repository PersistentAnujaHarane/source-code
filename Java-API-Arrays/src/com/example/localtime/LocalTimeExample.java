package com.example.localtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeExample {
	public static void main(String[] args) {
		
		//It stores time in the format hours-minutes-seconds (without a time
		//zone) and to nanosecond precision
		
		LocalTime timeHrsMin = LocalTime.of(12, 12);
		LocalTime timeHrsMinSec = LocalTime.of(0, 12, 6);
		LocalTime timeHrsMinSecNano = LocalTime.of(14, 7, 10, 998654578);
		/**LocalTime doesn’t define a method to pass a.m. or p.m. Use values
0–23 to define hours. If you pass out-of-range values to either hours, minutes,
or seconds, you’ll get a runtime exception**/
		
		LocalTime timeNow = LocalTime.now();
		System.out.println(timeNow);
		
		LocalTime timeParse = LocalTime.parse("15:08:23");
		System.out.println(timeParse);
		
		LocalTime time = LocalTime.of(16, 20, 12, 98547);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		System.out.println(time.getNano());
		
		LocalTime anujaFinishTime = LocalTime.parse("17:09:04");
		LocalTime prishaFinishTime = LocalTime.parse("17:09:12");
		if(anujaFinishTime.isBefore(prishaFinishTime))
		System.out.println("Anuja wins");
		else
		System.out.println("Prisha wins");
		
		LocalTime movieStartTime = LocalTime.parse("21:00:00");
		int commuteMin = 35;
		LocalTime anujaStartTime = movieStartTime.minusMinutes(commuteMin);
		System.out.println("Start by " + anujaStartTime + " from office");
		
		int worldRecord = 10;
		LocalTime raceStartTime = LocalTime.of(8, 10, 55);
		LocalTime raceEndTime = LocalTime.of(8, 11, 11);
		if (raceStartTime.plusSeconds(worldRecord).isAfter(raceEndTime))
		System.out.println("New world record");
		else
		System.out.println("Try harder");
		
		LocalTime time1 = LocalTime.of(14, 10, 0);
		LocalDate date = LocalDate.of(2016,02,28);
		LocalDateTime dateTime = time1.atDate(date);
		System.out.println(dateTime);
	}

}
