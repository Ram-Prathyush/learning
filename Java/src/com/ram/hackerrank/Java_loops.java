package com.ram.hackerrank;

import java.util.Scanner;

public class Java_loops {
	public static void main(IntroToS[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		if(q>=0&&q<=500) {
			for(int i = 1;i <= q; i++) {
				int a = scan.nextInt();
				int b = scan.nextInt();
				int n = scan.nextInt();
				if(a>=0&&a<=50&&b>=0&&b<=50&&n>=0&&n<=15) {
					int r = 0;
					for(int o = 0;o<=n;o++) {
						if(o ==0) {
							r=a+(int) (Math.pow(2,o)* b);
						}else {
//							int k = (int) (Math.pow(2,o)* b); 
							r = r+ (int) (Math.pow(2,o)* b);
						}
						System.out.print(r+" ");
						
					}
				}
			}
		}
	}
}
