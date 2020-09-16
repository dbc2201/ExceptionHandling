/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 14/09/20
 *  Time: 11:09 AM
 *  File Name : MobilePhone.java
 * */
package examples.telephony;

public class MobilePhone {

    private final double MINIMUM_BALANCE_FOR_MESSAGE = 1.5;
    // the help of a constructor, so we can choose to not initialize them here.
    private double balance; // field, fields can be initialized with

    public MobilePhone(double balance) {
        this.balance = balance;
    }

    public void sendTextMessage(long recipientContactNumber, String messageText) throws LowBalanceException {
        // local variable
//        int a;
//        System.out.println(a)
        if (this.balance <= MINIMUM_BALANCE_FOR_MESSAGE) {
            // Option1. This method can handle the exception itself using try/catch.
            // Option2. This method can pass the exception object to the method that is
            // calling this method.
            throw new LowBalanceException("Balance: " + this.balance);
        } else {
            System.out.println(messageText);
            this.balance -= MINIMUM_BALANCE_FOR_MESSAGE;
        }
    }

    private void getLoan() {
        this.balance += MINIMUM_BALANCE_FOR_MESSAGE;
    }

}
