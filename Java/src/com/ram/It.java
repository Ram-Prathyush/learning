package com.ram;
import java.util.ArrayList;
import java.util.Iterator;

public class It {
public static void main(String[] args) {
	
	ArrayList cars = new ArrayList();
	  
	 cars.add("Ford GT");
	 cars.add("Vritue GT");
	 cars.add("Toyato Supra");
	 cars.add("SSC tutara");
	 
	 Iterator<String> it = cars.iterator();
	 
	    System.out.println(it.next());

}
}
