/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 17/09/20
 *  Time: 10:33 AM
 *  File Name : Main.java
 * */
package examples.assignment;

public class Main {
    public static void main(String[] args) {
        Assignment assignment1 = new Assignment(
                1,
                "Arrays",
                10.0,
                true
        );
        Student student1 = new Student(
                12345,
                "john",
                5.6,
                new Assignment[]{assignment1},
                new String[]{"Arrays", "Methods", "Exception Handling"}
        );
        try {
            student1.doAssignment(assignment1.getNumber());
        } catch (TopicNotKnownYetException | LaptopNotWorkingException e) {
            e.printStackTrace();
        } catch (Exception e) {

        }
    }
}
