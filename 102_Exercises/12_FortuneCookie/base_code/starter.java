/*
 *	Author: Noah Risdon
 *  Date: 9/22/2026
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Fortune Cookie Generator!");
        
        // Generates a random integer from 1 to 10
        int fortuneNum = (int)(Math.random() * 10) + 1;

        if (fortuneNum == 1) { 
            System.out.println("A fresh perspective will unlock a solution to a problem you’ve been mulling over.");
        }
        if (fortuneNum == 2) { 
            System.out.println("An unexpected conversation today will lead to an exciting opportunity tomorrow.");
        }
        if (fortuneNum == 3) { 
            System.out.println("Your creativity is at an all-time high; give your wildest ideas a chance.");
        }
        if (fortuneNum == 4) { 
            System.out.println("A small act of kindness you perform soon will return to you tenfold.");
        }
        if (fortuneNum == 5) { 
            System.out.println("Patience with a current project will yield far better results than rushing.");
        }
        if (fortuneNum == 6) { 
            System.out.println("Someone you haven't spoken to in a while will reach out with good news.");
        }
        if (fortuneNum == 7) { 
            System.out.println("A new skill you decide to learn this week will pay off in surprising ways later.");
        }
        if (fortuneNum == 8) { 
            System.out.println("Trust your gut on an upcoming decision—it knows more than you think.");
        }
        if (fortuneNum == 9) { 
            System.out.println("Adventure is waiting just outside your usual comfort zone.");
        }
        if (fortuneNum == 10) { 
            System.out.println("The hard work you’ve been putting in behind the scenes is about to be recognized.");
        }
    }
}