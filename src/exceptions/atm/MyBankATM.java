/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 09/09/20
 *  Time: 3:21 PM
 *  File Name : MyBankATM.java
 * */
package exceptions.atm;

public class MyBankATM implements ATM {

    private double amountLeftInATM;

    @Override
    public void dispenseMoney(double amount) {
        if (amountLeftInATM < amount) {
            System.out.println("Not enough money in the ATM!");
        } else {
            System.out.println("Please collect your cash!");
            amountLeftInATM = amountLeftInATM - amount;
        }
    }
}
