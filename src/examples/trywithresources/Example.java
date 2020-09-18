/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 15/09/20
 *  Time: 1:30 PM
 *  File Name : Example.java
 * */
package examples.trywithresources;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        System.out.println("Please enter your name: ");
        String name = "";
        // try with resources
        // resources would be objects of classes that need to be open and closed
        // like the Scanner, File, Stream, etc.
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Hello, " + name + ".");
    }
}
