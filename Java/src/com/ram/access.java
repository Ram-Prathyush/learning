package com.ram;

import java.util.Scanner;

public class access {
    
    public static void main(String[] args) {
        
       
    
   {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to vote?");
        System.out.println("if you want to say 'yes'");
        scan.nextLine();
        System.out.println("What is your age?");
        int i = scan.nextInt();
        if(i > 17){
            System.out.println("accsess fully granted");
        }else if(i == 17){
            System.out.println("you are not suppose to but you can");
        }else if (i < 17){
            System.out.println("you are not suppose to.");
        }
        scan.close();
     }
}
}
