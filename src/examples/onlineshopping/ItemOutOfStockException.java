/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 17/09/20
 *  Time: 1:12 PM
 *  File Name : ItemOutOfStockException.java
 * */
package examples.onlineshopping;

public class ItemOutOfStockException extends Exception {
    public ItemOutOfStockException(String message) {
        super(message);
    }
}
