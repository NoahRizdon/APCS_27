/*
 *	Author: Noah Risdon
 *  Date: 9/27/2026
 * 	Collaborator:
*/

import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = (int)(Math.random() * 3) + 1;
        
        String answer1 = "Earth";
        String answer2 = "Apple";
        String answer3 = "Computer Science";

        if (num == 1) {
            System.out.println("The goal of the game is to guess a word with two hints!");
            System.out.println();
            System.out.println("It's a planet in our solar system!");
            System.out.print("What is your guess? ");
            String guess1 = sc.nextLine();

            boolean isCorrect1 = guess1.contains(answer1) && guess1.length() == answer1.length();

            if (isCorrect1) {
                System.out.println("You got it! Woo!");
            } else {
                System.out.println("You sadly didn't guess right, here's another hint!");
                System.out.println("It's the only one with humans on it!");
                String secondGuess1 = sc.nextLine();

                boolean isSecondCorrect1 = secondGuess1.contains(answer1) && secondGuess1.length() == answer1.length();

                if (isSecondCorrect1) {
                    System.out.println("You got it! Woo!");
                } else {
                    System.out.println("Nope! Restart and try again!");
                }
            }
        } else if (num == 2) {
            System.out.println("The goal of the game is to guess a word with two hints!");
            System.out.println();
            System.out.println("First hint: A fruit!");
            System.out.print("What is your guess? ");
            String guess2 = sc.nextLine();

            boolean isCorrect2 = ();

            if (isCorrect2) {
                System.out.println("You got it! Woo!");
            } else {
                System.out.println("You sadly didn't guess right, here's another hint!");
                System.out.println("It keeps the doctor away!");
                String secondGuess2 = sc.nextLine();

                boolean isSecondCorrect2 = secondGuess2.contains(answer2) && secondGuess2.length() == answer2.length();

                if (isSecondCorrect2) {
                    System.out.println("You got it! Woo!");
                } else {
                    System.out.println("Nope! Restart and try again!");
                }
            }
        } else if (num == 3) {
            System.out.println("The goal of the game is to guess a word with two hints!");
            System.out.println();
            System.out.println("First hint: The class with computers!");
            System.out.print("What is your guess? ");
            String guess3 = sc.nextLine();

            boolean isCorrect3 = guess3.contains(answer3) && guess3.length() == answer3.length();

            if (isCorrect3) {
                System.out.println("You got it! Woo!");
            } else {
                System.out.println("You sadly didn't guess right, here's another hint!");
                System.out.println("The science class with computers!");
                String secondGuess3 = sc.nextLine();

                boolean isSecondCorrect3 = secondGuess3.contains(answer3) && secondGuess3.length() == answer3.length();

                if (isSecondCorrect3) {
                    System.out.println("You got it! Woo!");
                } else {
                    System.out.println("Nope! Restart and try again!");
                }
            }
        }
    }
}