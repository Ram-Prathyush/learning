package com.ram;

import java.util.Scanner;

public class Pocokito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


       System.out.println("Let`s play pokorito press anything to start the game.");
       scan.nextLine();
       System.out.println(":It`s just like poker but lot simpeler.\n");
       System.out.println(":There are 2 players you and your computer.");
       System.out.println(":The dealer will give one card to each player.");
       System.out.println(":Then the dealer will draw 10 cards(the river).");
       System.out.println(":The player with the most river wins.");
       System.out.println(":It the matcher are equal everyone win`s.\n");
       System.out.println(":Ready type anything if you are!.");
       scan.nextLine();

       String yourCard = randomCard();
       String ComputerCard = randomCard();

       System.out.println("Here`s your card:");
       System.out.println(yourCard);
       System.out.println("\nHere`s the computers card:");
       System.out.println(ComputerCard);

       int YourMatches = 0;
       int computerMatches = 0;

       System.out.println("Now the dealer will draw 5 cards");
       System.out.println("Press enter for the real game");
       for(int i = 1; i <= 10; i++){
        scan.nextLine();

        String draw = randomCard();
        System.out.println("Card " + i);
        System.out.println(draw);
       

       if(yourCard.equals(draw)){
        YourMatches++;
       }
       if(ComputerCard.equals(draw)){
        computerMatches++;
       }
    }

    System.out.println("Your Matches:" + YourMatches);
    System.out.println("Computer Matches:" + computerMatches);

    if(YourMatches > computerMatches){
        System.out.println("You won the luck game");
    }else if(computerMatches > YourMatches){
        System.out.println("On noooo... computer won");
    }else{
        System.out.println("tla tla tla a tie");
    }

    scan.close();
    }
    public static String randomCard(){
        double randomNumber = Math.random()*13;
        randomNumber += 1;
        int randomInt = (int) randomNumber;

        switch(randomInt){
            case 1: return " ______ \n"+
                           "| A _  |\n"+
                           "|  ( ) |\n"+
                           "| (_ _)|\n"+
                           "|   |  |\n"+
                           "|_____V|\n";
            case 2: return " ______ \n"+
                           "| 2    |\n"+
                           "|   o  |\n"+
                           "|      |\n"+
                           "|   o  |\n"+
                           "|_____Z|\n";
            case 3:return  " ______ \n"+
                           "| 3    |\n"+
                           "| o  o |\n"+
                           "|      |\n"+
                           "|  o   |\n"+
                           "|_____E|\n";
            case 4:return   " ______ \n"+
                            "| 4    |\n"+
                            "|  o o |\n"+
                            "|      |\n"+
                            "|  o o |\n"+
                            "|_____H|\n";
            case 5:return   " ______ \n"+
                            "| 5    |\n"+
                            "|  o o |\n"+
                            "|   o  |\n"+
                            "|  o o |\n"+
                            "|_____S|\n";
            case 6:return  " ______ \n"+
                           "| 6    |\n"+
                           "|   oo |\n"+
                           "|   oo |\n"+
                           "|   oo |\n"+
                           "|_____6|\n";
            case 7:return   " ______ \n"+
                            "| 7    |\n"+
                            "|   oo |\n"+
                            "|  ooo |\n"+
                            "|   oo |\n"+
                            "|_____7|\n";
            case 8:return   " ______ \n"+
                            "|8     |\n"+
                            "|  ooo |\n"+
                            "|   oo |\n"+
                            "|  ooo |\n"+
                            "|_____8|\n";
            case 9:return   " ______ \n"+
                            "| 9    |\n"+
                            "|  ooo |\n"+
                            "|  ooo |\n"+
                            "|  ooo |\n"+
                            "|_____9|\n";
            case 10:return  " ______ \n"+
                            "| 10  o|\n"+
                            "|   ooo|\n"+
                            "|   ooo|\n"+
                            "|   ooo|\n"+
                            "|____10|\n";
            case 11:return  " ______ \n"+
                            "| J ww |\n"+
                            "| o {) |\n"+
                            "| o o% |\n"+
                            "| |  % |\n"+
                            "|___%%[|\n";
            case 12:return  " ______ \n"+
                            "| Q  ww|\n"+
                            "|  o {(|\n"+
                            "| o o%%|\n"+
                            "|  |%%%|\n"+
                            "|__%%%O|\n";
            case 13:return  " ______ \n"+
                            "| K  WW|\n"+
                            "|  o {)|\n"+
                            "| o o%%|\n"+
                            "|  |%%%|\n"+
                            "|__%%%>|\n";
            default: return "this should not get called";
        }
    }
}
