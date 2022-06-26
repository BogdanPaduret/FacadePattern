package com.company.models.hardware;

public class Hood implements CarHardware {

    @Override
    public void open() {
        System.out.println("Hood opening");
    }

    @Override
    public void close() {
        System.out.println("Hood closing");
    }
}
