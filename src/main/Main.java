package main;

import main.console.CityConsole;
import main.console.CountryConsole;

public class Main {
    private static City selectedCity = null;

    public static void main(String[] args) {
        CountryConsole countryConsole = new CountryConsole(Country.getInstance());
        CityConsole cityConsole;

        while (true) {
            if (selectedCity != null) {
                cityConsole = new CityConsole(selectedCity);
                cityConsole.showMainMenu();
            } else
                countryConsole.showMainMenu();
        }
    }

    public static City getSelectedCity() {
        return selectedCity;
    }

    public static void setSelectedCity(City newSelectedCity) {
        selectedCity = newSelectedCity;
    }
}
