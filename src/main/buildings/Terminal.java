package main.buildings;

import main.Person;

import java.util.ArrayList;

abstract public class Terminal {
    int costToBuild;
    String cityName;
    String name;
    String address;
    int area;
    int vehicleCount;
    ArrayList<Person> drivers;

    public Terminal(int costToBuild, String cityName, String name, String address, int area, int vehicleCount) {
        this.costToBuild = costToBuild;
        this.cityName = cityName;
        this.name = name;
        this.address = address;
        this.area = area;
        this.vehicleCount = vehicleCount;
        this.drivers = new ArrayList<>();
    }
}
