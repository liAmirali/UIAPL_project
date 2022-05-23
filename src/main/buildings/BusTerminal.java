package main.buildings;

import main.vehicles.InterCityBus;

import java.util.ArrayList;

public class BusTerminal extends Terminal {
    private final ArrayList<InterCityBus> buses;

    public BusTerminal(int costToBuild, String cityName, String name, String address, int area) {
        super(costToBuild, cityName, name, address, area);
        this.buses = new ArrayList<>();
    }

    public ArrayList<InterCityBus> getBuses() {
        return buses;
    }
}
