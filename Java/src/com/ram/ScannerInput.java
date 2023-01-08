package com.ram;
import java.util.Scanner;

public class ScannerInput {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		String userName;
		
		System.out.println("Enter username");
		userName = myScanner.nextLine();
		
		System.out.println("Username is " + userName);
	}

}
