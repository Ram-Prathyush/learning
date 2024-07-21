package com.ram;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to pokemon quiz");


        System.out.println("And also type only the name.");


        System.out.println("1.What is the slowest pokemon?");
        System.out.println("SlowPok, Mewtow, Arcuese, SlowKing");
        String ans1 = scan.nextLine();

        System.out.println("2.What is the god of pokemon?");
        System.out.println("Mew, MewTow, Arcuese, Articuno");
        String ans2 = scan.nextLine();

        System.out.println("3.Which Pokemon is Also called as Genitic Pokemon?");
        System.out.println("MewTow, Mew, Raqweesa, Arcuese");
        String ans3 = scan.nextLine();

        System.out.println("4.Which Pokemon is also called as alpha pokemon?");
        System.out.println("Picachu, Arcuese, Infernept, Dragonite");
        String ans4 = scan.nextLine();

        System.out.println(".5 Who is the gretest pokemon gym leader?");
        System.out.println("Leon, Raihan, Bea, AshKetchum");
        String ans5 = scan.nextLine();

        System.out.println("6.Who is Ashes partner?");
        System.out.println("Picachu, Striva, Rowlet, Increroar");
        String ans6 = scan.nextLine();

        System.out.println("7.Who is ashes First bonded pokemon?");
        System.out.println("Picachu, GreyNinga, MewTow, SlowPok");
        String ans7 = scan.nextLine();

        int score = 0;

       
        if(ans2.equals("Arcuese")){
            score += 5;
        
        if(ans3.equals("Mew")){
            score += 5;
        }
        if(ans4.equals("Arcuese")){
            score += 5;
        }
        if(ans5.equals("Leon")){
            score += 5;
        }
        if(ans6.equals("Picachu")){
            score += 5;
        }
        if(ans7.equals("GreyNinga")){
            score += 5;
        }

             System.out.println("The Score you got "+score+"/35 ");
        if(score == 35){
            System.out.println("Wow, what a pokemon Fan are your!");
        }else if (score >= 15 || score >= 5){
            System.out.println("Not Very Bad!");
        }else{
            System.out.println("Better Try Again Boy!");
        }
    }
}

}
