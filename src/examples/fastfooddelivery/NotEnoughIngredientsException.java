/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 16/09/20
 *  Time: 3:06 PM
 *  File Name : NotEnoughIngredientsException.java
 * */
package examples.fastfooddelivery;

public class NotEnoughIngredientsException extends Exception {
    public NotEnoughIngredientsException(String message) {
        super(message);
    }
}
