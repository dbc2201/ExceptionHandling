/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 14/09/20
 *  Time: 10:47 AM
 *  File Name : Example1.java
 * */
package examples.multiplecatch;

public class Example1 {
    public static void main(String[] args) {
        int result = 0;
        try {
            int numberOfArguments = args.length;
            System.out.println("numberOfArguments = " + numberOfArguments);
            result = 42 / numberOfArguments;
            int[] array = {1};
            array[result] = 99;
        } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException.getMessage());
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println(arrayIndexOutOfBoundsException.getCause());
        } catch (Exception exception) {
            System.out.println(exception.getLocalizedMessage());
        }
    }
}
