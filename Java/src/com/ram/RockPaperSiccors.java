package com.ram;

import java.util.Scanner;

public class RockPaperSiccors {
    //private static final String computerChoice = null;

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Come to play rock papper siccors if u dare!");
        System.out.println("Because i'am and legendry");
        System.out.println("Say 'yes' ");
        String ready = scan.nextLine();

        if (ready.equals("yes")) {
            System.out.println("Great");
            System.out.println("Type the letter when i say shoot");
            System.out.println("Ok Rock, Paper, Siccor and... Shoo");
            String choice = scan.nextLine();
            String  computerChoice = cChoice();
            String result = result(choice, computerChoice);
            printResult(choice, computerChoice, result);
        } else {
            System.out.println("Let us play another day , boring");

        }
    }

    /**
     * @return
     */
    public static String cChoice() {
        double randomNo = Math.random() * 3;
        final int integer = (int) randomNo;

        switch (integer) {
            case 0:
                return "Sissor";
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            default:
                return "";
        }
    }

    public static String result(String yourChoice, String computerChoice) {
        String result = "";

        if (yourChoice.equals("Rock") && computerChoice.equals("Sissor")) {
            result = "your Win";
        } else if (yourChoice.equals("Paper") && computerChoice.equals("Rock")) {
            result = "your win";
        } else if (yourChoice.equals("Paper") && computerChoice.equals("Sissor")) {
            result = "your loose";
        } else if (yourChoice.equals("Sissor") && computerChoice.equals("Paper")) {
            result = "your win";
        } else if (yourChoice.equals("Rock") && computerChoice.equals("Paper")){
            result = "your loose";
        }else if(yourChoice.equals(computerChoice)){
            result = "Its a tie";
        }else{
            System.out.println("INVILAD CHOICE");
            System.exit(0);
        }
        return result;
    }
    /**
     * @param choice
     * @param computerChoice
     * @param result
     */
    public static void printResult(String yourChoice, String computerChoice, String result){
        System.out.println(computerChoice);
        System.out.println("you Choose - " + yourChoice);
        System.out.println("Computer Choose - " + computerChoice);
        System.out.println(result);
    }
}
