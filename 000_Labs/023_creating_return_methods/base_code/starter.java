/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What number would you like to scale up?");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.println("To what power");
		int b = sc.nextInt();
		sc.nextLine();
		int c = pow(a,b);
		System.out.print(c);
		
	}
	public static int pow(int a, int b){
		
		while(b>0){
			int d = a;
			a = a*a;
			b = b-1;
			a = a - d;
		}
		return a;
	}
}
