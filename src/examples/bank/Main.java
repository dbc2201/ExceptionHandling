/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 16/09/20
 *  Time: 1:14 PM
 *  File Name : Main.java
 * */
package examples.bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.openAccount("Divyansh");
        try {
            bank.withdrawMoney(1200.0, 4);
        } catch (InvalidAccountDetailsException e) {
            e.printStackTrace();
        }
    }
}
