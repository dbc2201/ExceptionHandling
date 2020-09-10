/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 09/09/20
 *  Time: 3:19 PM
 *  File Name : ATM.java
 * */
package examples.atm;

import examples.atm.exceptions.NotEnoughMoneyException;

public interface ATM {
    /**
     * This method dispenses cash for a customer of the Bank.
     *
     * @param amount The amount of money the customer want to withdraw.
     */
    void dispenseMoney(double amount) throws NotEnoughMoneyException;
}

// Method Signature
// 1. visibility modifier
// 2. static (access) modifier
// 3. return type
// 4. method name
// 5. parameter list
// 6. exception list