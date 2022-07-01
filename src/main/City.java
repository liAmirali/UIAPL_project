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

    public City(int population, int budget) {
        this.citizens = new ArrayList<>();
        this.hotels = new ArrayList<>();

        this.terminals = new ArrayList<>();

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

    public void addInitialCitizens() {
        Person person1 = new Person("Amirali", "Lotfi", 2002, "Tehran", "Front-end Developer", true, 70);
        Person person2 = new Person("Sepehr", "Hamedinia", 2004, "Tehran", "Athlete", true, 20);
        Person person3 = new Person("Alexander", "Graham Bell", 1847, "Edinburgh", "Inventor", true, 40);
        Person person4 = new Person("Billie", "Eilish", 2001, "Los Angeles", "Singer", false, 300);
        Person person5 = new Person("Akbar", "Akbari", 1981, "Qom", "Bus Driver", true, 10);
        Person person6 = new Person("Gholam", "Gholami", 1983, "Kashan", "Pilot", true, 80);

        citizens.add(person1);
        citizens.add(person2);
        citizens.add(person3);
        citizens.add(person4);
        citizens.add(person5);
        citizens.add(person6);

    }

}
