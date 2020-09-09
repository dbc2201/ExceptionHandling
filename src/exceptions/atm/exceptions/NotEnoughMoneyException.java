/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 09/09/20
 *  Time: 3:25 PM
 *  File Name : NotEnoughMoneyException.java
 * */
package exceptions.atm.exceptions;

// This is not an ordinary definition class,
// this class is a definition class for an Exception type.
// Custom Exceptions (because we [the developers] are creating our own exceptions)
// Pre-Defined Exceptions
public class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException(String message) {
        super(message);
        // we are calling the constructor of the Exception class
        // by writing super()
        // and, we are passing the message argument to it.
    }
}
