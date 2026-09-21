/*
 *	Author: Noah Risdon
 *  Date: 9/17/26
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please choose two integers for your range");
	System.out.println("Integer one: ");
	int int1 = sc.nextInt();
	System.out.println("Integer two (Needs to be bigger than the first): ");	
	int int2 = sc.nextInt();
	System.out.println("Your range is: " + int1 + " to " + int2);
	System.out.println("Here are 5 random numbers in your range");
	int range = int2 - int1;
	int intOne = ((int)(Math.random()*range) + int1);
	int intTwo = ((int)(Math.random()*range) + int1);
	int intThree = ((int)(Math.random()*range) + int1);
	int intFour = ((int)(Math.random()*range) + int1);
	int intFive = ((int)(Math.random()*range) + int1);
	System.out.println(intOne);
	System.out.println(intTwo);
	System.out.println(intThree);
	System.out.println(intFour);
	System.out.println(intFive);
	}
}
