package com.ram;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        counter++;

        System.out.println("What is your hobby?");
        String hobby = scanner.nextLine();
        counter++;

        System.out.println("What is your favorite car?");
        String car = scanner.nextLine();
        counter++;

        System.out.println("what is your favorite bike?");
        String bike = scanner.nextLine();
        counter++;

        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();
        counter++;

        System.out.println("How much do you spent on coffe?");
        double coffe = scanner.nextDouble();
        counter++;

        System.out.println("How much do you spent on your favorite food?");
        double favoriteFood = scanner.nextDouble();
        counter++;

        scanner.close();

        System.out.println("Thandyou For Responing all the questions " +name+".And you answered " +counter+ " ");
        double total = coffe+favoriteFood;
        System.out.println("you spent $ "+total+" ");
    }
    
}
