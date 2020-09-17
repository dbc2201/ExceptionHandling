/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 17/09/20
 *  Time: 1:08 PM
 *  File Name : Customer.java
 * */
package examples.onlineshopping;

public class Customer {
    private final int id;
    private final String name;
    private final double walletBalance;
    private final String address;

    public Customer(int id, String name, double walletBalance, String address) {
        this.id = id;
        this.name = name;
        this.walletBalance = walletBalance;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public String getAddress() {
        return address;
    }
}
