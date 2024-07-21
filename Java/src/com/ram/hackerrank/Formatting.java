package com.ram.hackerrank;

import java.util.Scanner;

public class Formatting {

	public static void main(IntroToS[] args) {
		Scanner ram = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			
			java.lang.String str= ram.next();
			int a = ram.nextInt();
			
//			System.out.println(str +" - "+ a);
			System.out.printf("%15s%03d",str,a);
			
		}
	}
}
