/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 11/09/20
 *  Time: 12:29 PM
 *  File Name : Example4.java
 * */
package examples.simple;

public class Example4 {
    public static void main(String[] args) {
        int number = 4;
        int secondNumber = number - 4;
        try {
            int result = number / 4;
            System.out.println(result);
        } catch (ArithmeticException arithmeticException) {
            System.err.println(arithmeticException.getMessage());
        } finally {
            System.out.println("The finally block was executed!");
        }
    }
}
