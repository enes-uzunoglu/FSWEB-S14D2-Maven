package org.example.model;

public class Wall {
    // instanceVariable
    private String direction;
    // constructor
    public Wall(String direction) {
        this.direction = direction;
    }
    // toString

    @Override
    public String toString() {
        return direction;
    }

    // methods
    public String getDirection() {
        return direction;
    }
    public void create(){
        System.out.println("Wall has been built.");
    }
}
