package com.ram.hackerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Locale;

class Result {

	/*
	 * Complete the 'findDay' function below.
	 *
	 * The function is expected to return a STRING. The function accepts following
	 * parameters: 1. INTEGER month 2. INTEGER day 3. INTEGER year
	 */

	public static java.lang.String findDay(int month, int day, int year) {
		
		System.out.println(month +"- "+ day +" - "+year);
		
		month= month - 1;
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month, day);
		java.lang.String dayOfTheWeek = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault());
		System.out.println(dayOfTheWeek);
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.DATE));
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		return dayOfTheWeek;
	}
}

public class CalenderWeekDay {
	public static void main(IntroToS[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			Calendar calendar = Calendar.getInstance();
		IntroToS[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int month = Integer.parseInt(firstMultipleInput[0]);

		int day = Integer.parseInt(firstMultipleInput[1]);

		int year = Integer.parseInt(firstMultipleInput[2]);

		IntroToS res = Result.findDay(month, day, year);
		


		bufferedReader.close();
	}

}
