package com.ram;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Time {
	public static void main(String[] args) {
	String myLocal = LocalDate.now().getDayOfWeek().name();
		System.out.println(myLocal);
	}

}
