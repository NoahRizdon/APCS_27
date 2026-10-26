/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		BankAccount x = new BankAccount();
		System.out.println("Bank Account Number: " + x.getAccount());
		System.out.println("Bank Account of: " + x.getName());
		System.out.println("Current Balance: $" + x.checkBalance());
		System.out.println();

		BankAccount y = new BankAccount(1000.0);
		System.out.println("Bank Account Number: " + y.getAccount());
		System.out.println("Bank Account of: "+ y.getName());
		System.out.println("Current Balance: $" + y.checkBalance());
		System.out.println();

		BankAccount z = new BankAccount(10.0, "Alex P.");
		System.out.println("Bank Account Number: " + z.getAccount());
		System.out.println("Bank Account of: " + z.getName());
		System.out.println("Current Balance: $" + z.checkBalance());
	}
}
