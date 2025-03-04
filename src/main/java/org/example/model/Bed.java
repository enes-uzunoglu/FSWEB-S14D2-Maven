package org.example.model;

public class Bed {
    // instanceVariable
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilts;
    // constructor
    public Bed(String style, int height, int pillows, int sheets, int quilts) {
        this.style = style;
        this.height = height;
        this.pillows = pillows;
        this.sheets = sheets;
        this.quilts = quilts;
    }
    // methods
    public void make(){
        System.out.println("The bed is being made.");
    }
    public String getStyle() {
        return style;
    }
    public int getPillows() {
        return pillows;
    }
    public int getHeight() {
        return height;
    }
    public int getSheets() {
        return sheets;
    }
    public int getQuilts() {
        return quilts;
    }
}
