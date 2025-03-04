package org.example.model;

import org.example.model.enums.PaintColor;

public class Ceiling {
    // instanceVariable
    private int height;
    private PaintColor color;
    // constructor
    public Ceiling(int height, PaintColor color) {
        this.height = height;
        this.color = color;
    }
    // methods
    public int getHeight() {
        return height;
    }
    public PaintColor getColor() {
        return color;
    }
    public void create(){
        System.out.println("Ceiling has been built.");
    }
}
