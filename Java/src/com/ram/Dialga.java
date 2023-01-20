package com.ram;

public class Dialga {
	public static void main(String[] args) {

		String orginalStr = "Dialga";
		String ultaStr = "";
		System.out.println("Original string: " + orginalStr);

		for (int i = 0; i < orginalStr.length(); i++) {
			ultaStr = orginalStr.charAt(i) + ultaStr;
		}
System.out.println("Ulta string: " + ultaStr );
	}

}
