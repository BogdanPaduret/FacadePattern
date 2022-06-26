package com.company.models.hardware;

public class Window implements CarHardware {

    private final String side;

    public Window(String side) {
        this.side = side;
    }

    @Override
    public void open() {
        System.out.println("Window opening on " + side + " side");
    }

    @Override
    public void close() {
        System.out.println("Window opening on " + side + " side");
    }
}
