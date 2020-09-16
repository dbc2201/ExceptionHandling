/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 11/09/20
 *  Time: 12:22 PM
 *  File Name : Example3.java
 * */
package examples.simple;

public class Example3 {
    public static void main(String[] args) {
        Student student = new Student(1, null);
        try {
            System.out.println(student.getName().charAt(0));
        } catch (NullPointerException nullPointerException) {
            System.err.println("The name of the student object was not initialized!");
        }
    }
}

class Student {
    private final int rollNumber;
    private final String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }
}
