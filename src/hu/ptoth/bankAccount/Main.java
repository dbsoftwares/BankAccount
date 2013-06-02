/**
 * 
 */
package hu.ptoth.bankAccount;

import hu.ptoth.bankAccount.extendedClasses.Current;
import hu.ptoth.bankAccount.extendedClasses.Saving;

/**
 * @author ptoth
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Started");
		BankAccount myBankAccount = new BankAccount();
		myBankAccount.checkBalance();
		myBankAccount.deposit();
		myBankAccount.withdraw();
		
		Saving mySaving = new Saving();
		mySaving.checkBalance();
		mySaving.deposit();
		mySaving.withdraw();
		
		Current myCurrent = new Current();
		myCurrent.checkBalance();
		myCurrent.deposit();
		myCurrent.withdraw();
		
		System.out.println("Finished.");
	}

}
