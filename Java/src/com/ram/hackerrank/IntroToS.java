package com.ram.hackerrank;

import java.util.Scanner;

public class IntroToS {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String A = scan.next();
		String B = scan.next();
		scan.close();
		
		int sum = A.length()+B.length();	
		
		boolean compare = A.compareTo(B) > 0;
		
		String Ca = capitalizeFirstLetter(A);
		String Cb = capitalizeFirstLetter(B);
		
		System.out.println(sum);
		System.out.println(compare == false ? "No" : "Yes" );
		System.out.println(Ca +" "+ Cb);

	}

	private static String capitalizeFirstLetter(String a) {
		// TODO Auto-generated method stub
		if( a.length()== 0 || a.equals(null)){
            return a;
        }
        return Character.toUpperCase(a.charAt(0)) + a.substring(1);

	}
}
