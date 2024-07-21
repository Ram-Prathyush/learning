package com.ram.hackerrank;

import java.util.Scanner;

public class StaticBlock {
	static {
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt();
		int h = scan.nextInt();
		
		if(h > 0&&b > 0&&h<100&&b<100) {
			System.out.println(h*b);
		}else {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}
	public static void main(IntroToS[] args) {
	  	
	}
}
