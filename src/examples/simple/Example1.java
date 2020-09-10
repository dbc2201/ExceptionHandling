/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 10/09/20
 *  Time: 10:24 PM
 *  File Name : Example1.java
 * */
package examples.simple;

import java.util.Scanner;

public class Example1 {

    private static final int LEGAL_VOTING_AGE = 18;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        byte age = scanner.nextByte();
        if (age < LEGAL_VOTING_AGE) {
            System.out.println("Sorry, you are still young to age!");
        } else {
            System.out.println("Ok, you are allowed to vote!");
        }
    }
}
