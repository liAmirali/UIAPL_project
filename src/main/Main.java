package main;

import main.console.CityConsole;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("Tehran", 100, 10000));

        CityConsole console0 = new CityConsole(cities.get(0));

        while (true) {
            console0.showMainMenu();
        }
    }
}
