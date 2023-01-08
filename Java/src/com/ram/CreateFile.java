package com.ram;
import java.io.File; 
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		try {
			File obj = new File("filename.txt");
			if(obj.createNewFile()) {
				System.out.println("Filecreated:" + obj.getName());
			}else{
				System.out.println(obj.renameTo(new File("Writable.java")));
				System.out.println("file alredy exixt");
			}
			
		}catch(IOException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
	}

}
