/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
	
		
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 10.0);
	

		Employee jim = new Employee(2474, "Jim", "Halpert", 10000.0);
	
		
		Employee pam = new Employee(2011, "Pam", "Beesly", 10000.0);
	

		Employee alexP = new Employee(10, "Alex", "Pokrikian", -19.0);
	

		michael.raiseSalary(15);
		dwight.raiseSalary(5);
		jim.raiseSalary(10);
		pam.raiseSalary(10);
		alexP.raiseSalary(0);

		System.out.println("Michael: " + "\n" + "Salary: "+ michael.getSalary() + " Yearly salary: " + michael.getAnnualSalary());
		System.out.println();
		System.out.println("Dwight: "  + "\n" + "Salary: "+ dwight.getSalary() + " Yearly salary: " + dwight.getAnnualSalary());
		System.out.println();
		System.out.println("Jim: " +  "\n" +  "Salary: "+ jim.getSalary() + " Yearly salary: " + jim.getAnnualSalary());
		System.out.println();
		System.out.println("Pam: " + "\n" + "Salary: "+ pam.getSalary() + " Yearly salary: " + pam.getAnnualSalary());
		System.out.println();
		System.out.println("Alex P: " + "\n" + "Salary: "+ alexP.getSalary() + " Yearly salary: " + alexP.getAnnualSalary());
		System.out.println();

		
		}
	}
