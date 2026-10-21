/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
		String code = sc.nextLine();
		String decoded = Cipher.keyedEncode(code);
		System.out.println(decoded);
	}
	public static void main(String args[]) {
		System.out.print("Code: ");
		Scanner sc = new Scanner(System.in);
		String code = sc.nextLine();
		int key = 0;
		int a = 0;
		while(a < 36){
		int y = (int)(Math.random()*36);
		String decoded = Cipher.keyedEncode(code, key);
		String decodedAgain = Cipher.keyedEncode(decoded, y);
		System.out.println(decoded);
		key = key + 1;
		a = a + 1;
	}
}
}