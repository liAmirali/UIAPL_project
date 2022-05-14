package main;

import main.buildings.Hotel;
import main.buildings.Terminal;

import java.util.ArrayList;

public class City {
    ArrayList<Person> citizens;
    ArrayList<Hotel> hotels;
    ArrayList<Terminal> terminals;

    int population;
    int budget;

    public City(ArrayList<Person> citizens, ArrayList<Hotel> hotels, ArrayList<Terminal> terminals, int population, int budget) {
        this.citizens = citizens;
        this.hotels = hotels;
        this.terminals = terminals;
        this.population = population;
        this.budget = budget;
    }
}
