package com.company.models;

import com.company.models.equipment.Engine;
import com.company.models.equipment.Radio;
import com.company.models.hardware.Door;
import com.company.models.hardware.Hood;
import com.company.models.hardware.Trunk;

public class SportsCar extends CarFacade {

    private final int maxPassengers = 3;

    public SportsCar(Door frontLeftDoor,
                     Door frontRightDoor,
                     Hood hood,
                     Trunk trunk,
                     Engine engine,
                     Radio radio) {
        super(frontLeftDoor, frontRightDoor, null, null, hood, trunk, engine, radio);
    }

    @Override
    public void loadLuggage() {

    }

    @Override
    public void boardDriver() {
        doors[0].open();
        doors[0].getIn();
        doors[0].close();
        doors[0].openWindow();
    }

    @Override
    public void loadPassengers(int nrPassengers) {
        if (nrPassengers < super.doors.length) {
            loadFrontPassenger(doors[1]);
        } else {
            if (nrPassengers <= maxPassengers) {
                for (int i = 0; i < nrPassengers-1; i++) {
                    loadRearPassenger(doors[i]);
                }
                loadFrontPassenger(doors[1]);
            } else {
                System.out.println("Not enough space in this car for all passengers!");
            }
        }
    }

    //helper methods
    public void loadFrontPassenger(Door door) {
        door.open();
        door.getIn();
        door.close();
    }
    public void loadRearPassenger(Door door) {
        door.open();
        door.pullChair();
        door.getIn();
        door.reclineChair();
        door.close();
    }

}
