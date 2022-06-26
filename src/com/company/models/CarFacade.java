package com.company.models;

import com.company.models.equipment.Engine;
import com.company.models.equipment.Radio;
import com.company.models.hardware.Door;
import com.company.models.hardware.Hood;
import com.company.models.hardware.Trunk;

public abstract class CarFacade {

    //doors
    Door[] doors;
    Door frontLeftDoor = new Door("front left");
    Door frontRightDoor = new Door("front right");
    Door rearLeftDoor = new Door("rear left");
    Door rearRightDoor = new Door("rear right");

    //hood
    Hood hood = new Hood();

    //trunk
    Trunk trunk = new Trunk();

    //engine
    Engine engine = new Engine();

    //radio
    Radio radio = new Radio();

    //constructor
    public CarFacade(
            Door frontLeftDoor,
            Door frontRightDoor,
            Door rearLeftDoor,
            Door rearRightDoor,
            Hood hood,
            Trunk trunk,
            Engine engine,
            Radio radio) {
        this.frontLeftDoor = frontLeftDoor;
        this.frontRightDoor = frontRightDoor;
        this.rearLeftDoor = rearLeftDoor;
        this.rearRightDoor = rearRightDoor;
        this.hood = hood;
        this.trunk = trunk;
        this.engine = engine;
        this.radio = radio;

        Door[] possibleDoors = {frontLeftDoor,frontRightDoor, rearLeftDoor, rearRightDoor};

        int c = 0;

        for (int i = 0; i < possibleDoors.length; i++) {
            Door door = possibleDoors[i];
            if (door.exists()) {
                c++;
            }
        }

        doors = new Door[c];

        for (int i = 0; i < doors.length; i++) {
            for (int j = 0; j < possibleDoors.length; j++) {
                Door door = possibleDoors[j];
                if (door.exists() && !doors[i].equals(door)) {
                    doors[i] = door;
                }
            }
        }
    }

    //methods
    public final void go(String radioChannel, int nrPassengers) //template method
    {
        loadLuggage();
        boardDriver();
        prepareRadio(radioChannel);
        loadPassengers(nrPassengers);
        playRadio();
        driveCar();
    }
    public abstract void loadLuggage();
    public abstract void boardDriver();
    public abstract void loadPassengers(int nrPassengers);
    public void prepareRadio(String radioChannel){
        radio.start();
        radio.setChannel(radioChannel);
        radio.setVolume(5);
    }
    public void playRadio() {
        radio.play();
    }
    public void driveCar(){
        engine.start();
        engine.accelerate();
    }


}
