package com.ram;
import java.util.ArrayList;

public class Lambda {
	public static void main (String[] args) {
		ArrayList<Integer> bestCars = new ArrayList<Integer>();
		bestCars.add(678);
		bestCars.add(466578);
		 bestCars.forEach( (n) -> { System.out.println(n); } );
	  }
	
}
