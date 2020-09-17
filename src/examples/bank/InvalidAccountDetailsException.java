/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 16/09/20
 *  Time: 1:26 PM
 *  File Name : InvalidAccountDetailsException.java
 * */
package examples.bank;

public class InvalidAccountDetailsException extends Exception {
    public InvalidAccountDetailsException(String message) {
        super(message);
    }
}
