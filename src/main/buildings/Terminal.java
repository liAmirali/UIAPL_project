package main.buildings;

import main.Person;

import java.util.ArrayList;

abstract public class Terminal {
    private final int costToBuild;
    private final String cityName;
    private final String name;
    private final String address;
    private final int area;
    private int vehicleCount;
    private final ArrayList<Person> drivers;

    public Terminal(int costToBuild, String cityName, String name, String address, int area, int vehicleCount) {
        this.costToBuild = costToBuild;
        this.cityName = cityName;
        this.name = name;
        this.address = address;
        this.area = area;
        this.vehicleCount = vehicleCount;
        this.drivers = new ArrayList<>();
    }

    // Getters
    public int getCostToBuild() {
        return costToBuild;
    }

    public String getCityName() {
        return cityName;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getArea() {
        return area;
    }

    public int getVehicleCount() {
        return vehicleCount;
    }

    public ArrayList<Person> getDrivers() {
        return drivers;
    }

    // Setters
    public void setVehicleCount(int vehicleCount) {
        this.vehicleCount = vehicleCount;
    }
}
