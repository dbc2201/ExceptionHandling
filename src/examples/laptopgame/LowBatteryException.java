/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 15/09/20
 *  Time: 11:14 AM
 *  File Name : LowBatteryException.java
 * */
package examples.laptopgame;

public class LowBatteryException extends Exception {
    public LowBatteryException(String message) {
        // call the constructor of the Parent (Exception) class
        super(message);
    }
}
