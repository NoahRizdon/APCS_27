/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("What's your name?");
	String name = sc.nextLine();
	System.out.println("How many times do you wanna see your name?");
	int numOfNames = sc.nextInt();
	int x = 0;
	boolean isNumCoo = true;
	while(isNumCoo){
		System.out.println(name);
		x = x + 1;
		if(x == numOfNames){
		isNumCoo = false;
	}
	}
	}
}
