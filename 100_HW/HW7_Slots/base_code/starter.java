/*
 *	Author: Noah Risdon
 *  Date: 10/7/2026
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Would you like to play the game? You should try your luck!");
    System.out.println("Yes/yes/y/Y");
    int cash = 100;
    String answer = sc.nextLine();
    boolean userWantsPlay = answer.equals("Yes") || answer.equals("yes") || answer.equals("y") || answer.equals("Y");
    while(userWantsPlay && cash > 0){
        System.out.println("You have $" + cash + ". Place a wager!");
        System.out.println("Wager: $");
        int wager = sc.nextInt();
        sc.nextLine();
        if(wager > cash){
        System.out.println("You dont have that much cash bud");
        continue;
        }
        cash = cash - wager;
        int roll1 = (int)(Math.random()*10)+1;
        int roll2 = (int)(Math.random()*10)+1;
        int roll3 = (int)(Math.random()*10)+1;
        System.out.println("| "+ roll1+  " | " + roll2 + " | " + roll3 + " |");
        if (roll1 == roll2 && roll2 == roll3){
            System.out.println("Jackpot!!!");
            cash = cash + wager*3;
        }
        else if(roll1 == roll2 || roll2 == roll3 || roll3 == roll1){
            cash = cash + wager*2;
        }
        else{
            System.out.println("You lost this round.");
        }

    System.out.println("New cash balance: $" + cash);
    if(cash <= 0){
        System.out.println("Game over!");
        break;
    }
    System.out.println("Would you like to play again?");
    System.out.println("Yes/yes/y/Y");
    System.out.println("No/no/n/N");
    String newAnswer = sc.nextLine();
    if(newAnswer.equals("Yes") || newAnswer.equals("yes") || newAnswer.equals("y") || newAnswer.equals("Y")){
    userWantsPlay = true;
    }
    else{
    userWantsPlay = false;
    }
            }
    }
}