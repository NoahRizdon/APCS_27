/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
 	Scanner sc = new Scanner(System.in);
	System.out.print("Do you want to be a Wizard, Warrior, or Rogue? ");
	String role = sc.nextLine();
	String role1 = "Wizard";
	String role2 = "Warrior";
	String role3 = "Rogue";
	if(role.equalsIgnoreCase(role1)){
	System.out.println("You chose " + role1);
	}
	else if(role.equalsIgnoreCase(role2)){
	System.out.println("You chose " + role2);
	}
	else if(role.equalsIgnoreCase(role3)){
	System.out.println("You chose " + role3);
	}
	else{
	System.out.println("I believe you entered something wrong. Please try again!");
	}
}
}