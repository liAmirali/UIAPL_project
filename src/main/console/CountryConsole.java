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

        System.out.print("Enter menu code: ");
        String menuCode = input.nextLine();

        switch (menuCode) {
            case "0" -> showCreateNewCityPage();
            case "1" -> showEnterCityPage();
            case "2" -> showCityDetailsPage();
        }
    }

    public void showCreateNewCityPage() {
        Scanner input = new Scanner(System.in);

        String cityName = "";
        while (true) {
            try {
                System.out.print("Enter city name: ");
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
                System.out.print("Enter city budget: ");
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
                System.out.print("Enter city max population: ");
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

    public void showEnterCityPage() {
        Scanner input = new Scanner(System.in);

        String cityName;
        City city;
        while (true) {
            try {
                System.out.print("Enter city name: ");
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

    public void showCityDetailsPage() {
        Scanner input = new Scanner(System.in);

        String cityName;
        City selectedCity = null;

        boolean shouldShowAll = false;

        while (true) {
            try {
                System.out.print("Enter city name (hint: enter nothing to show all): ");
                cityName = input.nextLine();

                if (cityName.isEmpty()) {
                    shouldShowAll = true;
                    break;
                }

                selectedCity = Country.getCityByName(cityName);

                break;
            } catch (CityDoesNotExistsException e) {
                System.out.println("This city does not exist.");
            }
        }

        if (shouldShowAll)
            for (City city : country.getCities())
                System.out.println(city);
        else
            System.out.println(selectedCity);
    }
}
