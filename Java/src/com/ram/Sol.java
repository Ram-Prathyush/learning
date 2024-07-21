package com.ram;

import java.io.IOException;
import java.util.Scanner;

public class Sol {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		if (n >= 2 && n <= 20) {
			for(int i = 1; i<=10;i++) {
				//System.out.println(n +"x"+ i+"="+i*n);
				System.out.printf("%dx%d=%d%n",n,i,i*n);
				
			}
		}
	}
}
