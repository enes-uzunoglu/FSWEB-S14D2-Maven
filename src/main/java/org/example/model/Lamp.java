package org.example.model;

import org.example.model.enums.LampType;

public class Lamp {
    // instanceVariable
    private LampType style;
    private boolean battery;
    private int globRating;
    // constructor
    public Lamp(LampType style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }
    //methods
    public void turnOn(){
        System.out.println("Lamp is being turned on.");
    }

    public LampType getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
