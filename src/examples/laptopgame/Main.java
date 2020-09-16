/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 15/09/20
 *  Time: 11:09 AM
 *  File Name : Main.java
 * */
package examples.laptopgame;

public class Main {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop(25.0, 45.0);
        // Rule for writing multiple catch blocks:
        // The child Exception class should be caught first!
        try {
            myLaptop.playGame("Hitman");
            try {
                System.out.println(4 / 0);
            } catch (ArithmeticException exception) {
                System.err.println(exception.getMessage());
            }
        } catch (LowBatteryException | LowRAMException
                | GameFilesCorruptedException | GameLauncherMissingException exception) {
            System.err.println(exception.getMessage());
        } catch (GameNotInstalledException exception) {
            System.err.println("Game launcher is missing");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
