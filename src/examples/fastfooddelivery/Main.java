/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 16/09/20
 *  Time: 10:12 AM
 *  File Name : Main.java
 * */
package examples.fastfooddelivery;

public class Main {
    public static void main(String[] args) {
        Hotel myHotel = new Hotel(
                12,
                200.0,
                new String[]{"Indian", "Italian"},
                "JKL4"
        );
        try {
            myHotel.createOrder("Pasta");
        } catch (HotelCurrentlyClosedException | NotEnoughIngredientsException
                | PaymentNotReceivedException | HeavyRainException e) {
            System.err.println(e.getMessage());
        } catch (BadDeliveryConditionsException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Some Exception");
        }
    }
}
