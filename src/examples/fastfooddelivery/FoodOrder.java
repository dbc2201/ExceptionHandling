/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 16/09/20
 *  Time: 10:04 AM
 *  File Name : FoodOrder.java
 * */
package examples.fastfooddelivery;

public class FoodOrder {
    private final int id;
    private final Customer customer;
    private final Hotel hotel;
    private final DeliveryExecutive deliveryExecutive;

    public FoodOrder(int id, Customer customer, Hotel hotel, DeliveryExecutive deliveryExecutive) {
        this.id = id;
        this.customer = customer;
        this.hotel = hotel;
        this.deliveryExecutive = deliveryExecutive;
    }

    public FoodOrder() {
        this.id = 1;
        this.customer = new Customer(8, "John", "XYZ1");
        this.hotel = new Hotel(
                1,
                150.0,
                new String[]{
                        "North Indian",
                        "South Indian",
                        "Continental",
                        "Italian"
                },
                "ABC2"
        );
        this.deliveryExecutive = new DeliveryExecutive(
                4,
                "Mark",
                "GHI3"
        );
    }


}












