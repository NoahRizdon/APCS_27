/*
 *	Author:  
 *  Date: 
*/
import java.util.Scanner;

class starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=================================");
        System.out.println("    WELCOME RESTAURANT OWNER");
        System.out.println("=================================");
        System.out.println("Hello! What is your name?");
        String name = sc.nextLine();
        System.out.println("What would you like to name your restaurant, " + name + "?");
        String nameRestaurant = sc.nextLine();

        System.out.println();
        System.out.println("What would you like to be on " + nameRestaurant + "'s menu, " + name + "? We need three items.");
        
        System.out.println("Item 1:");
        String item1 = sc.nextLine();
        System.out.print("Price of " + item1 + " ($): ");
        double costOne = sc.nextDouble();
        System.out.print("How many " + item1 + "(s) would you like to order? ");
        int orderOne = sc.nextInt();
        sc.nextLine(); // Clear buffer

        System.out.println();
        System.out.println("Item 2:");
        String item2 = sc.nextLine();
        System.out.print("Price of " + item2 + " ($): ");
        double costTwo = sc.nextDouble();
        System.out.print("How many " + item2 + "(s) would you like to order? ");
        int orderTwo = sc.nextInt();
        sc.nextLine();
        

        System.out.println();
        System.out.println("Item 3:");
        String item3 = sc.nextLine();
        System.out.print("Price of " + item3 + " ($): ");
        double costThree = sc.nextDouble();
        System.out.print("How many " + item3 + "(s) would you like to order? ");
        int orderThree = sc.nextInt();
        sc.nextLine();

        System.out.println();
        System.out.println("What percentage would you like to tip?");
        double tipPercent = sc.nextDouble();

        double item1Total = costOne * orderOne;
        double item2Total = costTwo * orderTwo;
        double item3Total = costThree * orderThree;

        double subtotal = item1Total + item2Total + item3Total;
        double taxAmount = subtotal * 0.0925;
        double tipAmount = subtotal * (tipPercent / 100.0);
        double total = subtotal + taxAmount + tipAmount;

       System.out.println();
        System.out.println("Muchas Gracias mi compa. Your total will come out in a sec.");
        System.out.println();
        System.out.println("=================================");
        System.out.println("    " + nameRestaurant);
        System.out.println("=================================");
        System.out.println(orderOne + "x " + item1 + " = $" + item1Total);
        System.out.println(orderTwo + "x " + item2 + " = $" + item2Total);
        System.out.println(orderThree + "x " + item3 + " = $" + item3Total);
        System.out.println("---------------------------------");
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + taxAmount);
        System.out.println("Tip: $" + tipAmount);
        System.out.println("Total: $" + total);
        System.out.println("=================================");
        
    }
}
