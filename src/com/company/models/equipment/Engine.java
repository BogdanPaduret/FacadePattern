package com.company.models.equipment;

public class Engine implements CarEquipment {

    @Override
    public void start() {
        System.out.println("Engine starting");
    }

    @Override
    public void stop() {
        System.out.println("Engine stopping");
    }

    public void accelerate() {
        System.out.println("Accelerating");
    }

    public void brake() {
        System.out.println("Braking");
    }
}
