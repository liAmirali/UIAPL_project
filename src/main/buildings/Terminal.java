package main.buildings;

import main.Person;
import main.Travel.Safarable;
import main.Travel.Travel;
import main.vehicles.Vehicle;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

abstract public class Terminal implements Safarable {
    private final int costToBuild;
    private final String cityName;
    private final String name;
    private final String address;
    private final int area;
    private static int vehicleCount = 0;
    private final ArrayList<Person> drivers;
    private final ArrayList<Travel> travels;
    final private ArrayList<Vehicle> vehicles;

    public Terminal(int costToBuild, String cityName, String name, String address, int area) {
        vehicleCount++;
        this.costToBuild = costToBuild;
        this.cityName = cityName;
        this.name = name;
        this.address = address;
        this.area = area;
        this.drivers = new ArrayList<>();
        this.travels = new ArrayList<>();
        this.vehicles = new ArrayList<>();
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

    public ArrayList<Travel> getTravels() {
        return travels;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    @Override
    public String toString() {
        String output = "Cost To Build: " + costToBuild + ", City's name: " + cityName + ", Terminal's name: " + name + ", Address: " + address + ", Area: " + area + ", Vehicle Count: " + vehicleCount;

        output += "\nDrivers:\n";
        for (Person driver : drivers)
            System.out.println(driver);

        output += "\nVehicles:\n";
        for (Vehicle vehicle : vehicles)
            System.out.println(vehicle);

        return output;
    }

    @Override
    public Travel createNewTravel(Terminal originTerminal, Terminal sourceTerminal, Person driver, Vehicle vehicle, LocalDateTime dateTime, int cost) {
        Travel newTravel = new Travel(originTerminal, sourceTerminal, driver, vehicle, dateTime, cost);
        originTerminal.getTravels().add(newTravel);
        sourceTerminal.getTravels().add(newTravel);

        sourceTerminal.getDrivers().removeIf(person -> person.equals(driver));
        originTerminal.getDrivers().add(driver);

        sourceTerminal.getVehicles().removeIf(thatVehicle -> thatVehicle.equals(vehicle));
        originTerminal.getVehicles().add(vehicle);


    }

    @Override
    public ArrayList<Travel> sortTravels() {
        return Collections.sort(travels);
    }

    @Override
    public int calculateTravelCost(ArrayList<Person> travelers, Vehicle vehicle) {
        return 0;
    }

    @Override
    public ArrayList<Travel> getTravelHistory() {
        return null;
    }

    public void addNewTravel() {

    }
}
