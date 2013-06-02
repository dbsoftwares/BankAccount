/**
 * 
 */
package hu.ptoth.bankAccount.interFaces;

/**
 * @author ptoth
 * @since 2013.06.02.
 * @web http://ptoth.github.io
 */
public interface ATM {
    /**
     * This interface implements the basic functionality of a bank account
     */
    public void withdraw();

    public void checkBalance();

    public void deposit();
}
