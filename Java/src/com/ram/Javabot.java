package com.ram;
import java.text.BreakIterator;
import java.util.Scanner;

public class Javabot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hi i am javabot, what is your name?\n");
        String name = scan.nextLine();
        System.out.println("Hey , "+name+"! where are you from? I am from a place called as oracle\n");
        String home = scan.nextLine();
        System.out.println("I here Your house is located " + home +"\n");
               System.out.println("What is your age?\n");
        int age = scan.nextInt();
        System.out.println("What is that all my age is 400 and yours is "+age+"\n ");
        System.out.println("This means i am "+(400/age)+"times older than your age boy.\n");
        
        System.out.println("What is your Mother Tongue?\n");
        String language = scan.nextLine();
        scan.nextLine();
        System.out.println("What is your favorite Language but not your "+ language +"\n");
        scan.nextLine();

        System.out.println("Bey see your tommorrow " + name);
    }
}
