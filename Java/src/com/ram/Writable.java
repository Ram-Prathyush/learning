package com.ram;

import java.io.FileWriter;
import java.io.IOException;

public class Writable {

	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("filename.txt");
			myWriter.write("oh ya java is fun");
			myWriter.close();
			System.out.println("success");
		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace();
			
		}
		}
}
