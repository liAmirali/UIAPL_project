package main.buildings;

import main.vehicles.AirVehicle;

import java.util.ArrayList;

public class Airport extends Terminal {
    private int runwayCount;
    final private boolean isInternational;

    // Constructors
    public Airport(int costToBuild, String cityName, String name, String address, int area, int runwayCount, boolean isInternational) {
        super(costToBuild, cityName, name, address, area);
        this.runwayCount = runwayCount;
        this.isInternational = isInternational;
    }

    public int getRunwayCount() {
        return runwayCount;
    }

    public boolean isInternational() {
        return isInternational;
    }

    // Setters
    public void setRunwayCount(int runwayCount) {
        if (runwayCount <= 0) {
            this.runwayCount = 1;
            return;
        }
        this.runwayCount = runwayCount;
    }

    @Override
    public String toString() {
        return super.toString() + ", runwayCount=" + runwayCount + ", isInternational=" + isInternational;
    }
}
