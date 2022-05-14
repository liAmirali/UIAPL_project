package main.buildings;

import main.vehicles.Train;

import java.util.ArrayList;

public class RailwayStation extends Terminal {
    private final ArrayList<Train> trains;
    private final int inputRail;
    private final int outputRail;

    public RailwayStation(int costToBuild, String cityName, String name, String address, int area, int vehicleCount, int inputRail, int outputRail) {
        super(costToBuild, cityName, name, address, area, vehicleCount);
        this.trains = new ArrayList<>();
        this.inputRail = inputRail;
        this.outputRail = outputRail;
    }

    public ArrayList<Train> getTrains() {
        return trains;
    }

    public int getInputRail() {
        return inputRail;
    }

    public int getOutputRail() {
        return outputRail;
    }
}
