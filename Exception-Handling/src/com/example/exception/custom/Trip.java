package com.example.exception.custom;

import java.time.LocalTime;

public class Trip {
	public void goTrekking(LocalTime startTime) {
		// compare time now and start time
		// throw FeelingHungryException if difference is > 2 hrs
		int hrs = LocalTime.now().getHour() - startTime.getHour();
		if (hrs >= 2) throw new FeelingHungryException();
		}

	

}
