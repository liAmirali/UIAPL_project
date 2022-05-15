package main;

import main.buildings.Hotel;
import main.buildings.Terminal;

import java.util.ArrayList;

public class City {
    private final ArrayList<Person> citizens;
    private final ArrayList<Hotel> hotels;
    private final ArrayList<Terminal> terminals;

    private int population;
    private int budget;

    public City(ArrayList<Person> citizens, ArrayList<Hotel> hotels, ArrayList<Terminal> terminals, int population, int budget) {
        this.citizens = citizens;
        this.hotels = hotels;
        this.terminals = terminals;
        this.population = population;
        this.budget = budget;
    }

    // Getters
    public ArrayList<Person> getCitizens() {
        return citizens;
    }

    public ArrayList<Hotel> getHotels() {
        return hotels;
    }

    public ArrayList<Terminal> getTerminals() {
        return terminals;
    }

    public int getPopulation() {
        return population;
    }

    public int getBudget() {
        return budget;
    }

    // Setters
    public void setPopulation(int population) {
        this.population = population;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}
