package com.ram;

import java.io.File;
import java.io.IOException;
import java.util.List;


public class CreatFile{
	
	public static void main(String[] args)  {
		try {
			File Creatfile= new File("Icreatedit.txt");
			if(Creatfile.createNewFile()) {
			System.out.println("New File Created" + Creatfile);
		
			}else {
				System.out.println("File aldredy exist");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
}