package main.console;

import main.City;
import main.Country;
import main.Main;
import main.exceptions.CityDoesNotExistsException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CountryConsole {
    Country country;

    public CountryConsole(Country country) {
        this.country = country;
    }

    public void showMainMenu() {
        Scanner input = new Scanner(System.in);

        System.out.println("[0] Create New City");
        System.out.println("[1] Enter a City");
        System.out.println("[2] Show City Details");

        String menuCode = input.nextLine();

        switch (menuCode) {
            case "0" -> showCreateNewCityMenu();
            case "1" -> showEnterCityMenu();
        }
    }

    public void showCreateNewCityMenu() {
        Scanner input = new Scanner(System.in);

        String cityName = "";
        while (true) {
            try {
                System.out.println("Enter city name: ");
                cityName = input.nextLine();

                // It raises a city does not exist if it's a unique name
                Country.getCityByName(cityName);

                System.out.println("This name already exists. Try a new name.");
            } catch (CityDoesNotExistsException e) {
                break;
            }
        }

        int initialBudget;
        while (true) {
            try {
                System.out.println("Enter city budget: ");
                initialBudget = input.nextInt();
                input.nextLine();

                if (initialBudget <= 0) {
                    System.out.println("Budget must be greater than 0.");
                    continue;
                }

                break;
            } catch (InputMismatchException e) {
                System.out.println("Error in budget input: " + e.getMessage());
            }
        }

        int maxPopulation;
        while (true) {
            try {
                System.out.println("Enter city max population: ");
                maxPopulation = input.nextInt();
                input.nextLine();

                if (maxPopulation <= 0) {
                    System.out.println("Population must be greater than 0.");
                    continue;
                }

                break;
            } catch (InputMismatchException e) {
                System.out.println("Error in max population input: " + e.getMessage());
            }
        }

        Country.getInstance().addCity(new City(cityName, maxPopulation, initialBudget));

        System.out.println("City successfully created.");
    }

    public void showEnterCityMenu() {
        Scanner input = new Scanner(System.in);

        String cityName;
        City city;
        while (true) {
            try {
                System.out.println("Enter city name: ");
                cityName = input.nextLine();

                city = Country.getCityByName(cityName);

                break;
            } catch (CityDoesNotExistsException e) {
                System.out.println("This city does not exist.");
            }
        }

        Main.setSelectedCity(city);

        System.out.println("City selected successfully.");
    }
}
