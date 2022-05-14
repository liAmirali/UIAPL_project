package main.buildings;

import main.vehicles.SeaVehicle;

import java.util.ArrayList;

public class ShippingPort extends Terminal {
    ArrayList<SeaVehicle> seaVehicles;
    int wharfCount;

    public ShippingPort(int costToBuild, String cityName, String name, String address, int area, int vehicleCount, ArrayList<SeaVehicle> seaVehicles, int wharfCount) {
        super(costToBuild, cityName, name, address, area, vehicleCount);
        this.seaVehicles = seaVehicles;
        this.wharfCount = wharfCount;
    }
}
