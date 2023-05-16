package com.ram;

public class Car {
    public static void main(String[] args) {
        main nissan = new main();
        nissan.make = "Nissan kicks";
        nissan.colour = "Yellow";
        nissan.price = 2500300;
        nissan.year = 2015;

        main dodge = new main();
        dodge.make = "dodge challenger";
        dodge.colour = "Orange";
        dodge.price = 150000000;
        dodge.year = 2005;

        main ferrarri = new main();
        ferrarri.make = "Ferrarri la ferrarri";
        ferrarri.colour = "green";
        ferrarri.price = 500000000;
        ferrarri.year = 2019;

        System.out.println("This " + nissan.make + " is worth rupees" + nissan.price + 
        ". It was built in " + nissan.year + ". It is " + nissan.colour + ".\n");
        System.out.println("This " + dodge.make + " is worth rupeees" + dodge.price + 
        ". It was built in " + dodge.year + ". It is " + dodge.colour + ".\n");
        System.out.println("This " + ferrarri.make + "Is worth rupees" + ferrarri.price + "it was built in " + ferrarri.year + "Its colour is " + ferrarri.colour);
    }
}
