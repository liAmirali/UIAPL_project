package main.buildings;

import main.vehicles.SeaVehicle;

import java.util.ArrayList;

public class ShippingPort extends Terminal {
    private final ArrayList<SeaVehicle> seaVehicles;
    private int wharfCount;

    public ShippingPort(int costToBuild, String cityName, String name, String address, int area, int vehicleCount, ArrayList<SeaVehicle> seaVehicles, int wharfCount) {
        super(costToBuild, cityName, name, address, area, vehicleCount);
        this.seaVehicles = seaVehicles;
        this.wharfCount = wharfCount;
    }

    // Getters
    public ArrayList<SeaVehicle> getSeaVehicles() {
        return seaVehicles;
    }

    public int getWharfCount() {
        return wharfCount;
    }

    // Setters
    public void setWharfCount(int wharfCount) {
        this.wharfCount = wharfCount;
    }
}
