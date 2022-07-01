package main;

import main.exceptions.CityDoesNotExistsException;

import java.util.ArrayList;

public class Country {
    private static Country instance = null;
    private static final ArrayList<City> cities = new ArrayList<>();

    private int population = 0;
    private int totalBudget = 0;

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
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getTotalBudget() {
        return totalBudget;
    }

    public void setTotalBudget(int totalBudget) {
        this.totalBudget = totalBudget;
    }

    public void addCity(City city) {
        cities.add(city);
        population += city.getPopulation();
        totalBudget += city.getBudget();
    }

    public static City getCityByName(String cityName) throws CityDoesNotExistsException {
        for (City city : cities)
            if (city.getName().equals(cityName))
                return city;

        throw new CityDoesNotExistsException("No city found with name: " + cityName);
    }
}
