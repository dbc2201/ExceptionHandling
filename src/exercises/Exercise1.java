/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 18/09/20
 *  Time: 1:14 AM
 *  File Name : Exercise1.java
 * */
package exercises;

public class Exercise1 {

    private static final int OFFSET = 1;

    public static void main(String[] args) {
        int[] numbers = {22, 1, 96, 24}; //length-> ?4, maxIndex->?3
        int index = getRandomIndex(numbers);
        try {
            display(numbers, index); // when index is 4
        } catch (ArrayIndexOutOfBoundsException exception) {
            display(numbers, index - 1); // pass index - 1 (3)
        }
    }

    private static void display(int[] numbers, int index) throws ArrayIndexOutOfBoundsException {
        System.out.println("Number at index (" + index + ") is " + numbers[index]);
    }

    private static int getRandomIndex(int[] numbers) {
        return (int) (Math.random() * numbers.length + OFFSET);
    }
}
