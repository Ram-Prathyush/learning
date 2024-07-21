package com.ram.hackerrank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatting {

		public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        double pay = scan.nextDouble();
	       
	        scan.close();
	        
	        String us = NumberFormat.getCurrencyInstance(Locale.US).format(pay);
	        String india = NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(pay);
	        String china = NumberFormat.getCurrencyInstance(Locale.SIMPLIFIED_CHINESE).format(pay);
	        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(pay);
	        
	        System.out.println("US: " + us);
	        System.out.println("India: Rs." + india.substring(1));
	        System.out.println("China: " + china);
	        System.out.println("France: " + france);
	       
	}
	}

