/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 14/09/20
 *  Time: 10:23 AM
 *  File Name : NotEnoughIngredientsException.java
 * */
package examples.fastfood;

public class NotEnoughIngredientsException extends Exception {
    public NotEnoughIngredientsException(String message) {
        super(message); // calling the constructor of the parent class
    }
}
// NotEnoughIngredientsException <- child class
// Exception <- Parent class