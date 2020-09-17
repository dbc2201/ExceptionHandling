/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 16/09/20
 *  Time: 10:07 AM
 *  File Name : Hotel.java
 * */
package examples.fastfooddelivery;

public class Hotel {
    private final int id;
    private final double orderForOnePrice;
    private final String[] cuisines;
    private final String address;
    private final boolean isHotelOpen;
    private final boolean areIngredientsEnough;
    private final boolean areDeliveryConditionsOK;
    private final boolean isPaymentReceived;

    public Hotel(int id, double orderForOnePrice, String[] cuisines, String address) {
        this.id = id;
        this.orderForOnePrice = orderForOnePrice;
        this.cuisines = cuisines;
        this.address = address;
        this.isHotelOpen = true;
        this.areIngredientsEnough = true;
        this.areDeliveryConditionsOK = true;
        this.isPaymentReceived = false;
    }

    // Exception Scenarios
    // 1. Hotel is closed.
    // 2. Ingredients not sufficient.
    // 3. Delivery conditions not good.
    // 4. Did not receive payment.
    public void createOrder(String foodItemName) throws HotelCurrentlyClosedException,
            NotEnoughIngredientsException, BadDeliveryConditionsException, PaymentNotReceivedException {
        if (isHotelOpen) {
            // this means the hotel is open.
            System.out.println("Order Accepted for " + foodItemName + ".");
        } else {
            // this means the hotel is closed.
            // to generate our customer exception at run-time, we use the
            // `throw` keyword
            // Option 1. we can use the try/catch block to handle the
            // exception in the same method.
            throw new HotelCurrentlyClosedException("Hotel" + this.id +
                    " is currently closed.");
            // Option 2. we can use the `throws` keyword to pass the exception
            // object to the method that is calling this method.
        }
        if (areIngredientsEnough) {
            System.out.println("Order accepted");
        } else {
            throw new NotEnoughIngredientsException("Hotel can't take that order right now.");
        }
        if (!areDeliveryConditionsOK) {
            throw new BadDeliveryConditionsException("It is raining heavily outside.");
        }
        if (!isPaymentReceived) {
            throw new PaymentNotReceivedException("Please check the payment info");
        }
    }
}






