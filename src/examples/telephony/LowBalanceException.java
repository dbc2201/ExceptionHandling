/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 14/09/20
 *  Time: 11:20 AM
 *  File Name : LowBalanceException.java
 * */
package examples.telephony;

public class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        // call the constructor of the parent class
        // parent class? -> Exception
        // child class? -> LowBalanceException
        super(message);
    }
}
