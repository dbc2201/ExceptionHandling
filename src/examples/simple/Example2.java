/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 11/09/20
 *  Time: 10:31 AM
 *  File Name : Example2.java
 * */
package examples.simple;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String clientName = "";
        try {
            clientName = scanner.nextLine();
        } catch (NoSuchElementException noSuchElementException) {
            System.err.println(noSuchElementException.getMessage());
            System.out.println("Since you are not telling me your name, " +
                    "I'll just call you John.");
            clientName = "John";
        }
        scanner.close();
        System.out.println("Hello, " + clientName + "!");
    }
}
