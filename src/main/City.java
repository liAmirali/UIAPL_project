package main;

import main.buildings.*;
import main.exceptions.NotEnoughBudgetException;

import java.util.ArrayList;

public class City {
    private String name;
    private int population;
    private int budget;

    private final ArrayList<Person> citizens;
    private final ArrayList<Hotel> hotels;
    private final ArrayList<Terminal> terminals;

    public City(String name, int population, int budget) {
        this.citizens = new ArrayList<>();
        this.hotels = new ArrayList<>();

        this.terminals = new ArrayList<>();

        this.name = name;
        this.population = population;
        this.budget = budget;

        initialize();
    }

    public void initialize() {
        // Adding citizens
        Person person1 = new Person("Amirali", "Lotfi", 2002, this.name, "Pilot", true, 70);
        Person person2 = new Person("Sepehr", "Hamedinia", 2004, this.name, "Pilot", true, 20);
        Person person3 = new Person("Khosro", "Sepehri", 1847, this.name, "Sailor", true, 40);
        Person person4 = new Person("Peyman", "Moradi", 2001, this.name, "Bus Driver", false, 300);
        Person person5 = new Person("Saeed", "Ghadimi", 1981, this.name, "Locomotive Driver", true, 10);
        Person person6 = new Person("Mohsen", "Ahmadi", 1983, this.name, "Bus Driver", true, 80);

        citizens.add(person1);
        citizens.add(person2);
        citizens.add(person3);
        citizens.add(person4);
        citizens.add(person5);
        citizens.add(person6);

        // Adding hotels
        Hotel hotel1 = new Hotel("Grand Hotel", 200, this.name, 5, 10);
        Hotel hotel2 = new Hotel("Hasht Behsht Hotel", 400, this.name, 5, 20);
        Hotel hotel3 = new Hotel("Shahr Hotel", 300, this.name, 3, 15);

        try {
            buildHotel(hotel1);
            buildHotel(hotel2);
            buildHotel(hotel3);
        } catch (NotEnoughBudgetException e) {
            System.out.println(e.getMessage());
        }


        // Adding Terminals
        Terminal terminal1 = new Airport(300, this.name, "Mehr Abad Airport", "Tehran Iran", 90000, 3, false);
        Terminal terminal2 = new Airport(400, this.name, "Imam Khomeini Airport", "Tehran Iran", 90000, 5, true);
        Terminal terminal3 = new BusTerminal(150, this.name, "Beyhaghi Terminal", "Argantin Tehran Iran", 10000);
        Terminal terminal4 = new BusTerminal(100, this.name, "South Terminal", "Be'sat Tehran Iran", 10000);
        Terminal terminal5 = new RailwayStation(200, this.name, "Tehran Railway Station", "Rah Ahan Square Tehran Iran", 20000, 3, 3);

        try {
            buildTerminal(terminal1);
            buildTerminal(terminal2);
            buildTerminal(terminal3);
            buildTerminal(terminal4);
            buildTerminal(terminal5);
        } catch (NotEnoughBudgetException e) {
            System.out.println(e.getMessage());
        }

    }

    public ArrayList<Person> getCitizens() {
        return citizens;
    }

    public ArrayList<Hotel> getHotels() {
        return hotels;
    }

    public ArrayList<Terminal> getTerminals() {
        return terminals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "City{" + "name='" + name + '\'' + ", population=" + population + ", budget=" + budget + ", citizens=" + citizens + ", hotels=" + hotels + ", terminals=" + terminals + '}';
    }

    public void buildTerminal(Terminal terminal) throws NotEnoughBudgetException {
        if (terminal.getCostToBuild() > this.getBudget())
            throw new NotEnoughBudgetException("Can't build terminal.");

        this.setBudget(this.getBudget() - terminal.getCostToBuild());
        terminals.add(terminal);
    }

    public void buildHotel(Hotel hotel) throws NotEnoughBudgetException {
        if (hotel.getCostToBuild() > this.getBudget())
            throw new NotEnoughBudgetException("Can't build hotel.");

        this.setBudget(this.getBudget() - hotel.getCostToBuild());
        hotels.add(hotel);
    }
}
