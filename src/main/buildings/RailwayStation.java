package main.buildings;

import main.vehicles.Train;

import java.util.ArrayList;

public class RailwayStation extends Terminal {
    private final ArrayList<Train> trains;
    private final int inputRailCount;
    private final int outputRailCount;

    public RailwayStation(int costToBuild, String cityName, String name, String address, int area, int inputRailCount, int outputRailCount) {
        super(costToBuild, cityName, name, address, area);
        this.trains = new ArrayList<>();
        this.inputRailCount = inputRailCount;
        this.outputRailCount = outputRailCount;
    }

    public ArrayList<Train> getTrains() {
        return trains;
    }

    public int getInputRailCount() {
        return inputRailCount;
    }

    public int getOutputRailCount() {
        return outputRailCount;
    }

    @Override
    public String toString() {
        return super.toString() + ", trains=" + trains + ", inputRailCount=" + inputRailCount + ", outputRailCount=" + outputRailCount;
    }
}
