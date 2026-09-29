/*
 *	Author:  Noah Risdon
 *  Date: 9/23/2026
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
Scanner sc = new Scanner(System.in);

System.out.println("Number 1: ");
int val1 = sc.nextInt();
String valOne = sc.nextLine();

System.out.println("Number 2: ");
int val2 = sc.nextInt();
String valTwo = sc.nextLine();

System.out.println("Number 2: ");
int val3 = sc.nextInt();
String valThree = sc.nextLine();

if(val1 < val2 && val1 < val3){
	System.out.print("Number 1 is the smallest. ");
}
if(val2 < val1 && val2 < val3){
	System.out.print("Number 2 is the smallest. ");
}
if(val3 < val1 && val3 < val2){
	System.out.print("Number 3 is the smallest. ");
}
if(val1 > val2 && val1 > val3){
	System.out.print("Number 1 is the biggest.");
}
if(val2 > val1 && val2 > val3){
	System.out.print("Number 2 is the biggest.");
}
if(val3 > val2 && val3 > val1){
	System.out.print("Number 3 is the biggest.");
}
	}
}
