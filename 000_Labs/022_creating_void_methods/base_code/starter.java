/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What would you like to print?");
		String a = sc.nextLine();
		System.out.println("What else would you like to print?");
		String b = sc.nextLine();
		toString(a, b);
	}
	public static void toString(String a, String b){
	System.out.print("Here you go! ");
	System.out.println(a + " " + b);
	}
}
