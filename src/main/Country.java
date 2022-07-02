package main;

import main.exceptions.CityDoesNotExistsException;

import java.util.ArrayList;

public class Country {
    private static Country instance = null;
    private static final ArrayList<City> cities = new ArrayList<>();


    private Country() {
    }

    public static Country getInstance() {
        if (instance == null)
            instance = new Country();
        return instance;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public int getPopulation() {
        int population = 0;
        for (City city : cities) population += city.getPopulation();
        return population;
    }

    public int getTotalBudget() {
        int budget = 0;
        for (City city : cities) budget += city.getBudget();
        return budget;
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public static City getCityByName(String cityName) throws CityDoesNotExistsException {
        for (City city : cities)
            if (city.getName().equals(cityName))
                return city;

        throw new CityDoesNotExistsException("No city found with name: " + cityName);
    }
}
