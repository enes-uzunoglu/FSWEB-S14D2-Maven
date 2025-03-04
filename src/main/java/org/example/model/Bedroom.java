package org.example.model;

public class Bedroom {
    // instanceVariable
    private String name;
    private Room room;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;
    private Wardrobe wardrobe;
    private Carpet carpet;
    // constructor

    public Bedroom(String name, Room room, Bed bed, Wardrobe wardrobe) {
        this.name = name;
        this.room = room;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
        this.wardrobe = wardrobe;
        this.carpet = carpet;
    }



    // methods
    public String getName() {
        return name;
    }
    public Ceiling getCeiling() {
        return ceiling;
    }
    public Bed getBed() {
        return bed;
    }
    public Lamp getLamp() {
        return lamp;
    }
    public Wardrobe getWardrobe() {
        return wardrobe;
    }
    public Carpet getCarpet() {
        return carpet;
    }
}
