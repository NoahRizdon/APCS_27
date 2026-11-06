/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
		public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dog name?");
        String name1 = sc.nextLine();
        Dog dog1 = new Dog(name1);

        System.out.println("What age should " + dog1.getName() + " be?");
    int age1 = sc.nextInt();
        dog1.setAge(age1);
        sc.nextLine();

        System.out.println(dog1.getName() + " is a " + dog1.getBreed() + " that is " + dog1.getAge() + " years old!");


     Dog dog2 = new Dog("Toto", "Cairn Terrier");
        System.out.println(dog2.getName() + " is a " + dog2.getBreed() + " that is " + dog2.getAge() + " year old!");

        boolean dog1Sleeping = dog1.isSleeping();
        boolean dog1Barked = false;

 if (dog1Sleeping) {
            System.out.println(dog1.getName() + " is sleeping! Don't wake " + dog1.getName() + " up!");
        } 
        else {
            dog1.bark();
            dog1Barked = true;
        }

        boolean dog2Sleeping = dog2.isSleeping();

        if (dog2Sleeping) {
            System.out.println(dog2.getName() + " is sleeping too!");
            if (dog1Barked) {
                dog2.bark();
            }
         } 
         else {
            if (dog1Barked) {
                dog2.bark();
            }
 }
    }
}
