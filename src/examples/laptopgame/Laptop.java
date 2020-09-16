/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 15/09/20
 *  Time: 11:03 AM
 *  File Name : Laptop.java
 * */
package examples.laptopgame;

public class Laptop {
    private static final double LOW_BATTERY_PERCENTAGE = 20.0;
    private static final double LOW_RAM_PERCENTAGE = 40.0;
    private final double batteryPercentage;
    private final double ramPercentage;
    private Game game;

    public Laptop(double batteryPercentage, double ramPercentage) {
        this.batteryPercentage = batteryPercentage;
        this.ramPercentage = ramPercentage;
    }

    // Exception Scenarios
    // 1. Low Battery
    // 2. Low RAM
    // 3. Game Files Corrupted
    // 4. Game Uninstalled
    public void playGame(String gameName)
            throws LowBatteryException, LowRAMException,
            GameFilesCorruptedException, GameNotInstalledException {
        game = new Game(1, gameName, false);
        if (this.batteryPercentage <= LOW_BATTERY_PERCENTAGE) {
            // we use the `throw` keyword
            // The method that has generated (thrown) the exception
            // option 1. can handle the exception itself using try/catch
            // option 2. can pass the exception object to another method using throws
            throw new LowBatteryException("Battery is low.");
        }
        if (this.ramPercentage <= LOW_RAM_PERCENTAGE) {
            throw new LowRAMException("Low RAM.");
        }
        if (this.game.AreFilesCorrupted()) {
            throw new GameFilesCorruptedException("Game files are corrupted.");
        }
        if (game == null) {
            throw new GameNotInstalledException("Game is not installed");
        }
        throw new GameLauncherMissingException(".exe file not found.");
//        System.out.println(gameName + " is opening...");
    }
}
