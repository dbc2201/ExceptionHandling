/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 17/09/20
 *  Time: 1:15 PM
 *  File Name : Main.java
 * */
package examples.onlineshopping;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                1,
                "John",
                100.0,
                "XYZ1"
        );
        Item item = new Item(
                5,
                "ABC",
                "DEF",
                135.0,
                0.0,
                true
        );
        ShoppingWebsite amakart = new ShoppingWebsite();
        try {
            amakart.purchaseItem("ABC");
        } catch (ItemOutOfStockException | InsufficientBalanceException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
