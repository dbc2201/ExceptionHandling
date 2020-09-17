/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 17/09/20
 *  Time: 10:26 AM
 *  File Name : Student.java
 * */
package examples.assignment;

public class Student {
    private final int rollNumber;
    private final String name;
    private final double cpi;
    private final Assignment[] assignments;
    private final String[] knownTopics;
    private final boolean isTopicKnown = true;

    // Exception Scenarios
    // 1. TopicNotKnown ; the student does not know the topic.
    // 2. LaptopNotWorking
    private final boolean isLaptopWorking = false;

    public Student(int rollNumber, String name, double cpi, Assignment[] assignments, String[] knownTopics) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cpi = cpi;
        this.assignments = assignments;
        this.knownTopics = knownTopics;
    }

    public void doAssignment(int assignmentNumber)
            throws TopicNotKnownYetException, LaptopNotWorkingException {
        if (!isTopicKnown) {
            throw new TopicNotKnownYetException("This topic is not known");
        }
        if (!isLaptopWorking) {
            throw new LaptopNotWorkingException("Laptop not working");
        }
        System.out.println("Assignment Number " + assignmentNumber + " is done...");
    }

}
