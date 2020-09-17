/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 16/09/20
 *  Time: 1:19 PM
 *  File Name : NotEnoughBalanceException.java
 * */
package examples.bank;

public class NotEnoughBalanceException extends Exception {
    public NotEnoughBalanceException(String message) {
        super(message);
    }
}
