package com.example.exception.custom;

import java.time.LocalTime;

public class TestTrip {
	public static void main(String args[]) {
		Trip trip = new Trip();
		trip.goTrekking(LocalTime.of(11,24));
	}
	}


