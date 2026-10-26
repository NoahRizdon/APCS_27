/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
int acctNum;
double acctBalance;
String acctName;
static int nextAcct = (int)(Math.random()*1000);

	// -------CONSTRUCTORS-------
public BankAccount(){
acctNum = nextAcct;
nextAcct++;
acctBalance = 0.0;
acctName = "unkown";
}
public BankAccount(double bal){
acctNum = nextAcct;
nextAcct++;
acctBalance = bal;
acctName = "unknown";
}
public BankAccount(double bal, String nam){
acctNum = nextAcct;
nextAcct++;
acctBalance = bal;
acctName = nam;
}

	// -------METHODS-------

public int getAccount(){
	return acctNum;
}
public double checkBalance(){}

//public static double checkBalance(double val){
//System.out.print("How much would you like to add to your account?")
//val = nextint();
//return val
//}
}