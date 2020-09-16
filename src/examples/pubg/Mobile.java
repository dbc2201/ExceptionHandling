/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 16/09/20
 *  Time: 11:05 AM
 *  File Name : Mobile.java
 * */
package examples.pubg;

public class Mobile {
    private static final double BATTERY_LOW_LEVEL = 20.0;
    private final boolean isInternetAvailable;
    private double batteryRemaining;

    public Mobile() {
        this.batteryRemaining = 10.0;
        this.isInternetAvailable = true;
    }

    // Exception Scenarios
    // 1. Mobile Battery Low.
    // 2. Internet Not Available.
    // 3. Server Not Responding.
    // 4. Map Not Downloaded.

    public void playPUBG() throws MobileBatteryLowException, InternetNotAvailableException {
        if (this.batteryRemaining <= BATTERY_LOW_LEVEL) {
            // using the throw keyword
            throw new MobileBatteryLowException("Battery is " + batteryRemaining + "%");
            // Option 1. This method has created the exception object
            // and this method will handle it, using the try/catch block
            // Option 2. This method has created the exception object
            // but this method will pass the exception object to method that is calling it
            // using the throws keyword.
        }
        if (!this.isInternetAvailable) {
            throw new InternetNotAvailableException("Connect to the internet");
        }
        MobileGame pubg = new MobileGame(1, "PUBG", 1.5);
        System.out.println("Starting " + pubg.getName() + "...");
        this.batteryRemaining -= 20.0;
    }
}
