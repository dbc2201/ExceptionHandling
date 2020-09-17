/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 16/09/20
 *  Time: 1:08 PM
 *  File Name : Bank.java
 * */
package examples.bank;

public class Bank {
    private static final int customerIDs = 1;
    private static final double OPENING_BALANCE = 0.0;
    private Customer customer;

    public void openAccount(String name) {
        customer = new Customer();
        customer.setId(customerIDs);
        customer.setName(name);
        Account account = new Account(customerIDs, 10_000.0);
        customer.setAccount(account);
    }

    // Exception Scenarios
    // 1. NotEnoughBalance
    // 2. WrongAccountDetails
    // 3. AccountDoesNotExist
    // 4. BankServerNotResponding
    public void withdrawMoney(double amount, int accountID) throws InvalidAccountDetailsException {
        if (this.customer.getAccount().getId() != accountID) {
            throw new InvalidAccountDetailsException("Account ID is not valid");
        }
        if (this.customer.getAccount().getBalance() < amount) {
            // we can use the `throw` keyword to generate an exception object.
            // option 1. If we want to handle the exception in the same method
            // as it is generated, we can use the try/catch block
            try {
                throw new NotEnoughBalanceException("Not Enough Balance.");
            } catch (NotEnoughBalanceException notEnoughBalanceException) {
                System.err.println(notEnoughBalanceException.getMessage());
            }
        }
        final double currentBalance = this.customer.getAccount().getBalance();
        this.customer.getAccount().setBalance(currentBalance - amount);
        System.out.println("New Account Balance: " + this.customer.getAccount().getBalance());
    }
}
