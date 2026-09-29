/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		boolean higher = guess > answer;
		boolean lower = guess < answer;
		int answer = (int)(Math.random()*1000) + 1;
		System.out.println("Try and guess my number between 1-1000: ");
		int guess = sc.nextInt();
		if(guess == answer){
			System.out.println("You guessed right! The number was " + answer);
		}
		else if(higher){
			System.out.println("The number is higher");
	}
		else if(lower){
			System.out.println("The number is lower")
}

	}
}
