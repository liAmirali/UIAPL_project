package main.buildings;

import main.City;
import main.Country;
import main.Person;
import main.Travel.Safarable;
import main.Travel.Travel;
import main.exceptions.CityDoesNotExistsException;
import main.vehicles.Vehicle;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

abstract public class Terminal implements Safarable {
    public static final String OUT_GOING = "OUT_GOING";
    public static final String IN_GOING = "IN_GOING";
    public static final String BOTH_OUT_IN_GOING = "BOTH_OUT_IN_GOING";

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
    public Travel createNewTravel(Terminal originTerminal, Terminal destinationTerminal, Person driver, Vehicle vehicle, LocalDateTime dateTime, int cost) {
        Travel newTravel = new Travel(originTerminal, destinationTerminal, driver, vehicle, dateTime, cost);
        originTerminal.getTravels().add(newTravel);
        destinationTerminal.getTravels().add(newTravel);

        destinationTerminal.getDrivers().removeIf(person -> person.equals(driver));
        originTerminal.getDrivers().add(driver);

        destinationTerminal.getVehicles().removeIf(thatVehicle -> thatVehicle.equals(vehicle));
        originTerminal.getVehicles().add(vehicle);

        City destinationCity = null;
        try {
            destinationCity = Country.getCityByName(newTravel.getDestinationTerminal().getCityName());
        } catch (CityDoesNotExistsException ignored) {
        }

        // Removing travelers from origin city and adding them to the destination city
        for (Person traveler : newTravel.getTravelers()) {
            try {
                City travelerOriginCity = Country.getCityByName(traveler.getCityName());
                travelerOriginCity.getCitizens().remove(traveler);

                assert destinationCity != null;
                destinationCity.getCitizens().add(traveler);

            } catch (CityDoesNotExistsException ignored) {
            }
        }

        // Removing driver from origin city and adding them to the destination city
        try {
            City driverOriginCity = Country.getCityByName(driver.getCityName());
            driverOriginCity.getCitizens().remove(driver);
            assert destinationCity != null;
            destinationCity.getCitizens().add(driver);
        } catch (CityDoesNotExistsException ignored) {
        }

        return newTravel;
    }

    @Override
    public ArrayList<Travel> sortTravels() {
        ArrayList<Travel> travelsDuplicate = new ArrayList<>(travels);
        Collections.sort(travelsDuplicate);
        return travelsDuplicate;
    }

    @Override
    public int calculateTravelCost(ArrayList<Person> travelers, Vehicle vehicle) {
        return 0;
    }

    @Override
    public ArrayList<Travel> getTravelHistory(String travelType) {
        ArrayList<Travel> history = new ArrayList<>();
        switch (travelType) {
            case IN_GOING -> {
                for (Travel travel : travels)
                    if (travel.getDestinationTerminal().equals(this))
                        history.add(travel);
            }
            case OUT_GOING -> {
                for (Travel travel : travels)
                    if (travel.getOriginTerminal().equals(this))
                        history.add(travel);
            }
            case BOTH_OUT_IN_GOING -> history.addAll(travels);
        }
        return history;
    }

    public void addNewTravel() {

    }
}
