/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
private String owner;
private double acctBalance;
private int acctNum = (int)(Math.random()*10000+1);
private boolean closed;


	// -------CONSTRUCTORS-------
public BankAccount(){
	owner = "unkown";
	acctBalance = 0;
	acctNum = 0;
	acctNum++;
	closed = false;
}
public BankAccount(String own){
	owner = own;
	acctBalance = 0;
	acctNum = acctNum;
	acctNum++;
	closed = false;
}
public BankAccount(String own, double bal){
	owner = own;
	acctBalance = bal;
	acctNum = acctNum;
	acctNum++;
	closed = false;
}

	// -------METHODS-------
public String getOwner(){
	return owner;
}
public String setOwner(String owned){
	owner = owned;
	return owner;
}
public double getBalance(){
	return acctBalance;
}
public double deposit(double d){
	if(closed){
		System.out.println("Cannot desposit, account is closed");
	}
	else{
	acctBalance = d;
}
	return acctBalance;
}
public double withdraw(double a){
	if(closed){
		System.out.println("Cannot withdraw, account is closed");
	}
	else{
	System.out.print(owner + " is trying to withdraw" + a);
	if(acctBalance <= a){
	System.out.println("Withrew $" + a);
	System.out.print("The current account balance of " + owner + "is " + (acctBalance - a));
}
else{
	System.out.println("Insufficient funds!");
	}
}
return acctBalance;
}
public void displayAccountInfo(){
	System.out.println(acctNum);
	System.out.println(owner);
	System.out.println(acctBalance);
}
public boolean closeAccount(){
	System.out.println("Account is closed for " + owner);
	closed = true;
	return closed;
}
public double checkBalance(){
	System.out.print("Current account balance: $" + acctBalance);
	return acctBalance;
}
}