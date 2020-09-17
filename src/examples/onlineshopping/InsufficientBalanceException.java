/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 17/09/20
 *  Time: 1:14 PM
 *  File Name : InsufficientBalanceException.java
 * */
package examples.onlineshopping;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
