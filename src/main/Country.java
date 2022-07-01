package main;

import main.exceptions.CityDoesNotExistsException;

import java.util.ArrayList;

public class Country {
    private final ArrayList<City> cities;
    private int population;
    private int totalBudget;

    public Country(int population, int totalBudget) {
        this.cities = new ArrayList<>();
        this.population = population;
        this.totalBudget = totalBudget;
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

    public void addCity(City city){
      cities.add(city);
      population += city.getPopulation();
    }

    public static City getCityByName(String cityName) throws CityDoesNotExistsException {
        for (City city : cities)
            if (city.getName().equals(cityName))
                return city;

        throw new CityDoesNotExistsException("No city found with name: " + cityName);
    }
}
