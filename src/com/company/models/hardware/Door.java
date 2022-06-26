package com.company.models.hardware;

public class Door implements CarHardware {

    //instance variables
    private final String side;
    private Window window;
    private boolean isEmpty;

    //constructor
    public Door(String side) {
        window = new Window(side);
        this.side = side;
        isEmpty = true;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    @Override
    public void open() {
        System.out.println("Door on " + side + " side opening ");
    }
    @Override
    public void close() {
        System.out.println("Door on " + side + " side closing");
    }

    public void getIn() {
        isEmpty = false;
        System.out.println("Getting in car through door on " + side + " side");
    }

    public void getOut() {
        isEmpty = true;
        System.out.println("Getting out of car through door on " + side + " side");
    }

    public void openWindow() {
        window.open();
    }
    public void closeWindow() {
        window.close();
    }

    public boolean exists() {
        return this != null;
    }

    @Override
    public boolean equals(Object o) {
        Door door = (Door) o;
        return this.side == door.side;
    }

    public void reclineChair() {
        System.out.println("Reclining chair on " + side + " side");
    }

    public void pullChair() {
        System.out.println("Pulling chair on " + side + " side");
    }


}
