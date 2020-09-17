/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 17/09/20
 *  Time: 10:24 AM
 *  File Name : Assignment.java
 * */
package examples.assignment;

public class Assignment {
    private final int number;
    private final String topic;
    private final double marks;
    private final boolean isDueSoon;

    public Assignment(int number, String topic, double marks, boolean isDueSoon) {
        this.number = number;
        this.topic = topic;
        this.marks = marks;
        this.isDueSoon = isDueSoon;
    }

    public int getNumber() {
        return number;
    }

    public String getTopic() {
        return topic;
    }

    public double getMarks() {
        return marks;
    }

    public boolean isDueSoon() {
        return isDueSoon;
    }
}
