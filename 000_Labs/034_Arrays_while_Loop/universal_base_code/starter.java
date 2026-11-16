/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
int[] arr1 = new int[1001];
int i = 0;	
while(i<1000){
arr1 [i] = (int)(Math.random()*1000);
i++;
	}
printAll(arr1);


		
	}
	public static void printAll(int [] a){
		int i=0;
		while(i<a.length){
			System.out.println(a[i]);
			i++;
		}
	}
}
