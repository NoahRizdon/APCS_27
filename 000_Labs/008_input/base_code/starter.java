/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

import javax.lang.model.element.Name;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your first name?");
	String text = sc.nextLine();
	System.out.println("What is your age?");
	sc.nextLine();
	System.out.println("What month were you born in?");
	sc.nextLine();
	System.out.println("What year were you born in?");
	int number = sc.nextInt();
	sc.nextLine();
	System.out.println("If I have a dollar and two quarters, how much money do I have?");
	double dollar = sc.nextDouble();

	}
}
