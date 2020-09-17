/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 17/09/20
 *  Time: 1:06 PM
 *  File Name : Item.java
 * */
package examples.onlineshopping;

public class Item {
    private final int id;
    private final String name;
    private final String companyName;
    private final double price;
    private final double discount;
    private final boolean isInStock;

    public Item(int id, String name, String companyName, double price, double discount, boolean isInStock) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.price = price;
        this.discount = discount;
        this.isInStock = isInStock;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public boolean isInStock() {
        return isInStock;
    }
}
