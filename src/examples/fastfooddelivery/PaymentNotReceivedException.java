/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 16/09/20
 *  Time: 3:13 PM
 *  File Name : PaymentNotRecievedException.java
 * */
package examples.fastfooddelivery;

public class PaymentNotReceivedException extends Exception {
    public PaymentNotReceivedException(String message) {
        super(message);
    }
}
