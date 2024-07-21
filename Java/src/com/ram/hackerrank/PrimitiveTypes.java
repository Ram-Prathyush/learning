package com.ram.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimitiveTypes {
	public static void main(IntroToS[] args) {
		Scanner scan = new Scanner(System.in);
		int d =scan.nextInt() ;
		scan.nextLine();
		List<String> list = new ArrayList<>();
		for(int i = 0; i < d &&scan.hasNext(); i++) {
			list.add(scan.nextLine());
		}
		for (String n : list) {
			
		
	    try{
			long value = Long.valueOf(n);
			System.out.println(n+" can be fitted in:");

			if (value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE) {
				//System.out.println(n+"");
			
					System.out.println(" *byte");
			}
			if (value >= Short.MIN_VALUE && value <= Short.MAX_VALUE) {
				//System.out.println(n+"");
			
					System.out.println("*short");
				
			}
			if (value >= Integer.MIN_VALUE && value <= Integer.MAX_VALUE) {
				//System.out.println(n+"");
					System.out.println("*int");
				
			}
			if (value >= Long.MIN_VALUE && value <= Long.MAX_VALUE) {
				//System.out.println(n+"");
					System.out.println("*long");
				
			}
				System.out.println("");
			}
	  
	     catch (Exception e) {
			System.out.println(n+" can't be fitted anywhere.");
		}
		}
	}

}
