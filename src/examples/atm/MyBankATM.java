/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 09/09/20
 *  Time: 3:21 PM
 *  File Name : MyBankATM.java
 * */
package examples.atm;

import examples.atm.exceptions.NotEnoughMoneyException;

public class MyBankATM implements ATM {

    private double amountLeftInATM;

    @Override
    public void dispenseMoney(double amount) throws NotEnoughMoneyException {
        if (amountLeftInATM < amount) {
            throw new NotEnoughMoneyException("Not enough money in the ATM!");
        } else {
            System.out.println("Please collect your cash!");
            amountLeftInATM = amountLeftInATM - amount;
        }
    }
}
