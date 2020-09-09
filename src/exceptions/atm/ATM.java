/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 09/09/20
 *  Time: 3:19 PM
 *  File Name : ATM.java
 * */
package exceptions.atm;

public interface ATM {
    /**
     * This method dispenses cash for a customer of the Bank.
     *
     * @param amount The amount of money the customer want to withdraw.
     */
    void dispenseMoney(double amount);
}
