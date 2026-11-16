/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int [] arr1 = new int[1001];
		int a = 0;
		int val = 0;
		int num = 0;
		while(a < 1001){
		val+=3;
		arr1[num] = val;
		System.out.println(val);
		num++;
		a++;
		}
		
		int [] arr2 = new int[1001];
		int valu = 1000;
		int numb = 0;
		while(numb<1000){
		valu--;
		arr2[numb] = valu;
		System.out.println(valu);
		numb++;
		}
	}
}
