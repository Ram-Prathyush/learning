package com.ram;
import java.util.Scanner;

public class Javabot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\tHi i am javabot, what is your name?\n");
        String name = scan.nextLine();
        System.out.println("\t\tHey , "+name+"! where are you from? I am from a place called as oracle\n\n");
        String home = scan.nextLine();
        System.out.println("\t\tI here Your house is located " + home +"\n");
               System.out.println("\tWhat is your age?\n");
        int age = scan.nextInt();
        System.out.println("What is that all my age is 400 and yours is "+age+"\n ");
        
        System.out.println("What is your Mother Tongue i guess tamil?\n");
        String language = scan.nextLine();
        language = scan.nextLine();
        System.out.println("What is your favorite Language but not your "+ language);
        scan.nextLine();

        System.out.println("Bye see you tommorrow " + name);

        System.out.println("hey! hey hey...\n\n");
        System.out.println("Q1:What is the fastest car");
        String string = "options:ssc tutara, buggatti, peel 95, ferrarri la ferrarri";
        System.out.println(string);y
        String ans1 = scan.nextLine();

        System.out.println("Q2: Which is  the slowest car");
        System.out.println("options: hennessy venom GT, tata nano, peel 95, cobra");
        String ans2 = scan.nextLine();

        if(ans1.equals("buggatti")){
        }else{
            System.out.println("Wrong!");
        }

        if(ans2.equals("peel 95")){
            System.out.println("What you are just somthing else");
        }else {
            System.out.println("wrong again");
        }
        scan.close();
    }
}
