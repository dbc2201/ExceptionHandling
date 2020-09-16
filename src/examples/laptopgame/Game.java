/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 15/09/20
 *  Time: 1:09 PM
 *  File Name : Game.java
 * */
package examples.laptopgame;

import java.util.Objects;

public class Game {
    private int id;
    private String name;
    private boolean areFilesCorrupted;

    public Game(int id, String name, boolean areFilesCorrupted) {
        this.id = id;
        this.name = name;
        this.areFilesCorrupted = areFilesCorrupted;
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

    public boolean AreFilesCorrupted() {
        return areFilesCorrupted;
    }

    public void setAreFilesCorrupted(boolean areFilesCorrupted) {
        this.areFilesCorrupted = areFilesCorrupted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Game game = (Game) o;
        return getId() == game.getId() &&
                AreFilesCorrupted() == game.AreFilesCorrupted() &&
                Objects.equals(getName(), game.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), AreFilesCorrupted());
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", areFilesCorrupted=" + areFilesCorrupted +
                '}';
    }
}
