/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 16/09/20
 *  Time: 11:09 AM
 *  File Name : Main.java
 * */
package examples.pubg;

public class Main {
    public static void main(String[] args) {
        Mobile newPhone = new Mobile();
        try {
            newPhone.playPUBG();
        } catch (MobileBatteryLowException mobileBatteryLowException) {
            System.err.println(mobileBatteryLowException.getMessage());
        } catch (InternetNotAvailableException internetNotAvailableException) {
            System.out.println(internetNotAvailableException.getMessage());
        }
    }
}
