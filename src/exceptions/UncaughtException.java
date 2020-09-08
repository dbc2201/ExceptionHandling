/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 09/09/20
 *  Time: 12:32 AM
 *  File Name : UncaughtException.java
 * */
package exceptions;

public class UncaughtException {
    public static void main(String[] args) {
        int number = 4;
        int divisor = 0;
        // forceful division by zero.
        System.out.println(number / divisor);
    }
}
