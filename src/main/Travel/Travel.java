package main.Travel;

import main.Person;
import main.buildings.Terminal;
import main.vehicles.Vehicle;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Travel implements Comparable<Travel> {
    private static int count = 0;
    private final int ID;
    private Terminal originTerminal;
    private Terminal sourceTerminal;
    private final ArrayList<Person> travelers;
    private Person driver;
    private Vehicle vehicle;
    private LocalDateTime dateTime;
    private int cost;

    public Travel(Terminal originTerminal, Terminal sourceTerminal, Person driver, Vehicle vehicle, LocalDateTime dateTime, int cost) {
        this.ID = count++;
        this.originTerminal = originTerminal;
        this.sourceTerminal = sourceTerminal;
        this.travelers = new ArrayList<>();
        this.driver = driver;
        this.vehicle = vehicle;
        this.dateTime = dateTime;
        this.cost = cost;
    }

    public int getID() {
        return ID;
    }

    public Terminal getOriginTerminal() {
        return originTerminal;
    }

    public void setOriginTerminal(Terminal originTerminal) {
        this.originTerminal = originTerminal;
    }

    public Terminal getSourceTerminal() {
        return sourceTerminal;
    }

    public void setSourceTerminal(Terminal sourceTerminal) {
        this.sourceTerminal = sourceTerminal;
    }

    public ArrayList<Person> getTravelers() {
        return travelers;
    }

    public Person getDriver() {
        return driver;
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public int compareTo(Travel travel) {
        if (this.dateTime.isAfter(travel.getDateTime())) return 1;
        else if (this.dateTime.isBefore(travel.getDateTime())) return -1;

        return this.cost - travel.getCost();
    }
}
