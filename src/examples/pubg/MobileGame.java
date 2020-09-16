/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 16/09/20
 *  Time: 11:05 AM
 *  File Name : MobileGame.java
 * */
package examples.pubg;

import java.util.Objects;

public class MobileGame {
    private int id;
    private String name;
    private double memoryCost;

    public MobileGame(int id, String name, double memoryCost) {
        this.id = id;
        this.name = name;
        this.memoryCost = memoryCost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMemoryCost() {
        return memoryCost;
    }

    public void setMemoryCost(double memoryCost) {
        this.memoryCost = memoryCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MobileGame that = (MobileGame) o;
        return getId() == that.getId() &&
                Double.compare(that.getMemoryCost(), getMemoryCost()) == 0 &&
                Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getMemoryCost());
    }

    @Override
    public String toString() {
        return "MobileGame{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", memoryCost=" + memoryCost +
                '}';
    }
}
