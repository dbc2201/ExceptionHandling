/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 14/09/20
 *  Time: 11:13 AM
 *  File Name : Main.java
 * */
package examples.telephony;

public class Main {
    public static void main(String[] args) {
        MobilePhone myPhone = new MobilePhone(0.0);
        try {
            myPhone.sendTextMessage(123456789, "Hello");
        } catch (LowBalanceException lowBalanceException) {
            System.out.println(lowBalanceException.getMessage());
        }
    }
}
