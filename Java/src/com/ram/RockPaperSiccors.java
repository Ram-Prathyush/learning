package com.ram;

import java.util.Scanner;

public class RockPaperSiccors {
    //private static final String computerChoice = null;

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Come to play rock papper siccors");
        System.out.println("if you dont want press anything except 'yes'");
        System.out.println("Say 'yes' ");
        String ready = scan.nextLine();
 
        if (ready.equals("yes")) {
            System.out.println("Great");
            System.out.println("Type the command when i say shoot");
            System.out.println("Ok Rock, Paper, Siccor and... Shoot\n");
            System.out.print("You choose: ");
            String choice = scan.nextLine();
            String  computerChoice = cChoice();
            String result = result(choice, computerChoice);
            printResult(choice, computerChoice, result);
        } else {
            System.out.println("Let us play another day , boring");
        }
                for(int i = 0; i < 10; i++){
                    System.out.println("type yes when you are ready to play the next match");
                    String Ques1 = scan.nextLine();
                    if(Ques1.equals("yes")){
                        System.out.println("Welcome to the next game");
                        System.out.println("Ok Rock, Paper, Siccor and... Shoot");
                    String choice2 = scan.nextLine();
                    String  computerChoice2 = cChoice();
                    String result2 = result(choice2, computerChoice2);
                    printResult(choice2, computerChoice2, result2);
                }else{
                    System.out.println("Ok bey");break;
                }
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
                return "Siccor";
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

        if (yourChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Sissor")) {
            result = "your Win";
        } else if (yourChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) {
        result = "your win";
        } else if (yourChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Siccor")) {
            result = "your loose";
        } else if (yourChoice.equalsIgnoreCase("Siccor") && computerChoice.equals("Paper")) {
            result = "your win";
        } else if (yourChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Paper")){
            result = "your loose";
        }else if(yourChoice.equalsIgnoreCase(computerChoice)){
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
