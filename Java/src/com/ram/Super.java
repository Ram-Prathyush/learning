package com.ram;

public class Super {
static void checkAge(int age)throws ArithmeticException{
if (age < 18) {
	throw new ArithmeticException("accsess denided");
}else {
	System.out.println("acsess granted");
		
	}
}
	public static void main(String[] args) {
		checkAge(16);
	}
}


