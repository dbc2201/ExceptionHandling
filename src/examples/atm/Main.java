/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 09/09/20
 *  Time: 3:33 PM
 *  File Name : Main.java
 * */
package examples.atm;


import examples.atm.exceptions.NotEnoughMoneyException;

public class Main {
    public static void main(String[] args) {
        MyBankATM atmObject = new MyBankATM();
        try {
            atmObject.dispenseMoney(12345.0);
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        }
    }
}
