/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 15/09/20
 *  Time: 1:23 PM
 *  File Name : GameLauncherMissingException.java
 * */
package examples.laptopgame;

public class GameLauncherMissingException extends GameNotInstalledException {
    public GameLauncherMissingException(String message) {
        super(message);
    }
}
