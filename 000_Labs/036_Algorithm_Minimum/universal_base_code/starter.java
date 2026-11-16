/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
nt n = (int)(Math.random()*150)+51 ;
      int[] a=new int[ n ];
 for(int i=0; i<n ;i++)
   {
        a[i]=(int)(Math.random() * 100)+1;
  }

int min =a[0];
    int max= a[0];
  double sum=0 ;


      for (int i=0;i < n;i++){
 if(a[i]<min)
       {
min=a[i];
   }
        if (a[i] >max){
  max = a[i];
             }
    sum=sum+ a[i] ;
}
   System.out.println("elements: "+n);
System.out.println( "min: " +min);
        System.out.println("max: "+ max);
  System.out.println("avg: "+sum/n );
}
       }
