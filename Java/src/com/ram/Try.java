package com.ram;

public class Try {

	public static void main(String[] args) {
		
		try {
			int[] myNum={11,12,13};
			System.out.println(myNum[0]);
		} catch (Exception e) {
			System.out.println("Somthing went wrong");
			e.printStackTrace();
		}
	}

}
