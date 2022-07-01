package main;

import main.console.MainConsole;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("Tehran", 100, 10000));

        MainConsole console0 = new MainConsole(cities.get(0));

        while (true) {
            console0.showMainMenu();
        }
    }
}
