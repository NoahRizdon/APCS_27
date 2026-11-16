/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
int [] element = new int[20];
int i=0;
for(i=0; i<20; i++){
	element[i] = (int)(Math.random()*9+1);
}
int dupe = (int)(Math.random()*9+1);
findDupes(dupe, element);
findConsecutives(element);
	}

public static void findDupes(int a, int [] b){
	int dupes = 0;
	int i=0;
	for(i=0; i<20; i++){
		if(b[i]==a){
			System.out.println("element [" + i + "]");
			dupes++;
		}
	}
	System.out.println("total duplicates of "  + a + "'s: " + dupes);
}

public static void findConsecutives(int [] a){
int i = 0;
int b = 1;
for(i=0; i<20; i++){
if(a[i]==a[b]){
	System.out.println("element [" + i + "] and element [" + b + "] were both:  " + a[i]);
}
b++;
if(b == 20){
 b= 19;
}
}

}
}

