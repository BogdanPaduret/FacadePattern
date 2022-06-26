package com.company.models.hardware;

public class Trunk implements CarHardware {

    @Override
    public void open() {
        System.out.println("Trunk opening");
    }

    @Override
    public void close() {
        System.out.println("Truck closing");
    }

    public void fill() {
        System.out.println("Filling trunk");
    }

}
