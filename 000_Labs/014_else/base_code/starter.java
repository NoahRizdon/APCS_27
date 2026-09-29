/*
 *	Author:  Noah Risdon
 *  Date: 9/25/3036
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int answer = (int)(Math.random()*1000) + 1;
		System.out.println("Try and guess my number between 1-1000: ");
		int guess = sc.nextInt();
		if(guess == answer){
			System.out.println("You guessed right! The number was " + answer);
		}
		else {
			System.out.println("You guessed wrong. The number was " + answer);
		}
	}
}
