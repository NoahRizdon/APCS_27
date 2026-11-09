/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me an integer");
		int ans = sc.nextInt();
		sc.nextLine();
		printPrimes(ans);
	}

	public static boolean checkPrime(int a){
		int b = 2;
		boolean prime = true;
		if(a < 2){
			return false;
		}
		else{
		while(b < a && prime){
		prime = a%b != 0;
		b++;
		}
		return prime;
	}
}

	public static void printPrimes(int ans){
		int b = 2;
		while(b < ans){
			if(checkPrime(b)){
				System.out.println(b);
				b++;
			}
			else{
				b++;
			}
			
		}
	}
}
