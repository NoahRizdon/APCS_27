/*
 *	Author:  Noah Risdon
 *  Date: 10/2/2026
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);

    System.out.print("Do you want to be a Wizard, Warrior, or Rogue? ");
    String role = sc.nextLine();
    String role1 = "Wizard";
    String role2 = "Warrior";
    String role3 = "Rogue";

    if(role.equalsIgnoreCase(role1)){
    System.out.println("You chose " + role1);
    }
    else if(role.equalsIgnoreCase(role2)){
    System.out.println("You chose " + role2);
    }
    else if(role.equalsIgnoreCase(role3)){
    System.out.println("You chose " + role3);
    }
    else{
    System.out.println("I believe you entered something wrong. Please try again!");
    }

    System.out.println("Here are traits you can buff:");
    System.out.println("Strength - Buff and able to carry larger items");
    System.out.println("Dexterity - Agile and moves quick");
    System.out.println("Intelligence - Better at magic spells");
    System.out.println("Charisma - More personable");
    System.out.println("You have 20 points for upgrades. The max you can spend per trait is 10. Spend them wisely!");
    int totalPoints = 20;

    System.out.println();
    System.out.println("How much will you boost strength by?");
    int buffStrength = sc.nextInt();
    sc.nextLine();

    if(buffStrength <= 10 && buffStrength <= totalPoints && buffStrength >= 0){
    totalPoints = totalPoints - buffStrength;
    System.out.println("You have " + totalPoints + " points left");
    }
    else {
    System.out.println("That's too many points. Gimme a different number under 10.");
    buffStrength = sc.nextInt();
    sc.nextLine();
    if(buffStrength <= 10 && buffStrength <= totalPoints && buffStrength >= 0){
    totalPoints = totalPoints - buffStrength;
    System.out.println("You have " + totalPoints + " points left");
    } else {
    buffStrength = 0;
    }
}

    System.out.println();
    System.out.println("How much will you boost Dexterity by?");
    int buffD = sc.nextInt();
    sc.nextLine();

    if(buffD <= 10 && buffD <= totalPoints && buffD >= 0){
    totalPoints = totalPoints - buffD;
    System.out.println("You have " + totalPoints + " points left");
    }
    else {
    System.out.println("That's too many points. Gimme a different number under 10.");
    buffD = sc.nextInt();
    sc.nextLine();
    if(buffD <= 10 && buffD <= totalPoints && buffD >= 0){
    totalPoints = totalPoints - buffD;
    System.out.println("You have " + totalPoints + " points left");
    } else {
    buffD = 0;
    }
}

if(totalPoints == 0){
    System.out.println("You've maxxed out your points!");
}
 else if(totalPoints > 0){
    System.out.println();
    System.out.println("How much will you boost Intelligence by?");
    int buffI = sc.nextInt();
    sc.nextLine();

    if(buffI <= 10 && buffI <= totalPoints && buffI >= 0){
    totalPoints = totalPoints - buffI;
    System.out.println("You have " + totalPoints + " points left");
    }
    else {
    System.out.println("That's too many points. Gimme a different number under 10.");
    buffI = sc.nextInt();
    sc.nextLine();
    if(buffI <= 10 && buffI <= totalPoints && buffI >= 0){
    totalPoints = totalPoints - buffI;
    System.out.println("You have " + totalPoints + " points left");
    } else {
    buffI = 0;
    }
}
}

if(totalPoints == 0){
    System.out.println("You've maxxed out your points!");
}
 else if(totalPoints > 0){
    System.out.println();
    System.out.println("How much will you boost Charisma by?");
    int buffC = sc.nextInt();
    sc.nextLine();

    if(buffC <= 10 && buffC <= totalPoints && buffC >= 0){
    totalPoints = totalPoints - buffC;
    System.out.println("You have " + totalPoints + " points left");
    }
    else {
    System.out.println("That's too many points. Gimme a different number under 10.");
    buffC = sc.nextInt();
    sc.nextLine();
    if(buffC <= 10 && buffC <= totalPoints && buffC >= 0){
    totalPoints = totalPoints - buffC;
    System.out.println("You have " + totalPoints + " points left");
    } else {
    buffC = 0;
    }
}
}
    }
}