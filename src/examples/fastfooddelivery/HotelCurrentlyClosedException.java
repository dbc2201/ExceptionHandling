/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 16/09/20
 *  Time: 10:22 AM
 *  File Name : HotelCurrentlyClosedException.java
 * */
package examples.fastfooddelivery;

public class HotelCurrentlyClosedException extends Exception {
    public HotelCurrentlyClosedException(String message) {
        // call the constructor of the parent class
        super(message);
    }
}
