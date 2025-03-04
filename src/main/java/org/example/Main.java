package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Wall wall1 = new Wall("Kuzey");
        Wall wall2 = new Wall("Doğu");
        Wall wall3 = new Wall("Batı");
        Wall wall4 = new Wall("Güney");
        Ceiling ceiling = new Ceiling(3, PaintColor.RED);
        Bed bed = new Bed("single",1,2,2,1);
        Lamp lamp = new Lamp(LampType.NORMAL,false,1);
        Wardrobe wardrobe = new Wardrobe(1,3,72.5);
        Carpet carpet = new Carpet(2,2,PaintColor.RED);
        Room room = new Room(wall1,wall2,wall3,wall4,lamp,ceiling,carpet);

        Bedroom bedroom = new Bedroom("Single Bedroom",room,bed,wardrobe);

        lamp.turnOn();
        bed.make();
        wardrobe.add();
        carpet.lying();
        ceiling.create();
        wall1.create();
        System.out.println(wall1.getDirection());
        wall2.getDirection();
        wall3.getDirection();
        wall4.getDirection();
        bedroom.getBed();
        bedroom.getLamp();
        bedroom.getCarpet();
        bedroom.getCeiling();
        bedroom.getName();
        System.out.println(room.getWall1());
        room.getWall2();
        room.getWall3();
        room.getWall4();
    }
    

}