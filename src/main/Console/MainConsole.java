package main.Console;

import main.City;
import main.Person;
import main.buildings.*;

import java.util.ArrayList;
import java.util.Scanner;

public class MainConsole {
    City city;

    public MainConsole(City city) {
        this.city = city;
    }

    public void showMainMenu() {
        System.out.println("[1] Build a terminal.");
        System.out.println("[2] Buy vehicles.");
        System.out.println("[3] Hire drivers");
        System.out.println("[4] Get terminal details");
        System.out.println("[5] Build a hotel");
        System.out.println("[6] Build rooms for an existing hotel");
        System.out.println("[7] Get hotels details ");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter menu code: ");
        String menuCode = input.nextLine();

        if (menuCode.equals("1")) {
            showTerminalBuilding();
        } else if (menuCode.equals("2")) {
            showCarPurchasePage();
        } else if (menuCode.equals("3")) {
            showHireADriverPage();
        } else if (menuCode.equals("4")) {
        } else if (menuCode.equals("5")) {
        } else if (menuCode.equals("6")) {
        } else if (menuCode.equals("7")) {
        } else {
            System.out.println("Invalid menu code number!");
        }
    }

    public void showTerminalBuilding() {
        System.out.println("[1] Build an airport");
        System.out.println("[2] Build a railway station");
        System.out.println("[3] Build a bus terminal");
        System.out.println("[4] Build a shipping port");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter menu code: ");
        String menuCode = input.nextLine();

        if (menuCode.equals("1")) {
            showAirportBuildPage();
        } else if (menuCode.equals("2")) {
            showRailwayStationBuildPage();
        } else if (menuCode.equals("3")) {
            showBusTerminalBuildPage();
        } else if (menuCode.equals("4")) {
            showShippingPortBuildPage();
        } else {
            System.out.println("Invalid menu code number!");
        }
    }

    public void showCarPurchasePage() {
        System.out.println("--- Air Vehicles ---");
        System.out.println("[1] Airliner");
        System.out.println("[2] Cargo Plane");

        System.out.println("--- Land Vehicles ---");
        System.out.println("[3] Train");
        System.out.println("[4] Inter-city Bus");

        System.out.println("--- Sea Vehicles ---");
        System.out.println("[5] Ship");
        System.out.println("[6] Boat");
    }

    public void showHireADriverPage() {
        Scanner input = new Scanner(System.in);
        ArrayList<Terminal> cityTerminals = city.getTerminals();

        int i = 0;
        for (Terminal terminal : cityTerminals) {
            System.out.print("ID:" + i + ", ");
            System.out.println(terminal);
        }

        System.out.print("Enter terminal ID: ");
        int terminalID = input.nextInt();

        System.out.println("## Person info ##");

        String name;
        String lastname;
        int birthdayYear;
        String city;
        String job;
        boolean gender;
        int salary;
        String temp;

        System.out.print("Name: ");
        name = input.nextLine();

        System.out.print("Lastname: ");
        lastname = input.nextLine();

        System.out.print("Birthday year: ");
        birthdayYear = input.nextInt();

        System.out.print("City name: ");
        city = input.nextLine();

        System.out.print("Job: ");
        job = input.nextLine();

        System.out.print("Gender (male/female): ");
        temp = input.nextLine();
        if (temp.equals("male")) {
            gender = true;
        } else if (temp.equals("female")) {
            gender = false;
        } else {
            System.out.println("Invalid input. Set to female by default.");
            gender = false;
        }

        System.out.println("Salary: ");
        salary = input.nextInt();

        Person newPerson = new Person(name, lastname, birthdayYear, city, job, gender, salary);
        cityTerminals.get(terminalID).getDrivers().add(newPerson);

        System.out.println("Successfully added!");
    }

    public void showAirportBuildPage() {
        Scanner input = new Scanner(System.in);

        //terminal
        int costToBuild;
        String cityName;
        String name;
        String address;
        int area;
        //airport
        int runwayCount;
        boolean isInternational;

        String temp;

        System.out.println("Cost to build: ");
        costToBuild = input.nextInt();

        System.out.println("city name: ");
        cityName = input.nextLine();

        System.out.println("Name: ");
        name = input.nextLine();

        System.out.println("Address: ");
        address = input.nextLine();

        System.out.println("Area: ");
        area = input.nextInt();

        System.out.println("Runway count");
        runwayCount = input.nextInt();

        System.out.println("Is internation? (y/n) ");
        temp = input.nextLine();
        if (temp.equals("y")) isInternational = true;
        else if (temp.equals("n")) isInternational = false;
        else {
            System.out.println("Invalid input. Set to true by default.");
            isInternational = true;
        }


        Airport newAirport = new Airport(costToBuild, cityName, name, address, area, runwayCount, isInternational);
        city.getTerminals().add(newAirport);

        System.out.println("The airport has been built successfully");
    }

    public void showRailwayStationBuildPage() {
        Scanner input = new Scanner(System.in);

        //terminal
        int costToBuild;
        String cityName;
        String name;
        String address;
        int area;
        //railway
        int inputRailCount;
        int outputRailCount;

        String temp;

        System.out.println("Cost to build: ");
        costToBuild = input.nextInt();

        System.out.println("city name: ");
        cityName = input.nextLine();

        System.out.println("Name: ");
        name = input.nextLine();

        System.out.println("Address: ");
        address = input.nextLine();

        System.out.println("Area: ");
        area = input.nextInt();

        System.out.println("Input rail count");
        inputRailCount = input.nextInt();

        System.out.println("Output rail count");
        outputRailCount = input.nextInt();


        RailwayStation newRailwayStation = new RailwayStation(costToBuild, cityName, name, address, area, inputRailCount, outputRailCount);
        city.getTerminals().add(newRailwayStation);

        System.out.println("The railway station has been built successfully");
    }

    public void showBusTerminalBuildPage() {
        Scanner input = new Scanner(System.in);

        //terminal
        int costToBuild;
        String cityName;
        String name;
        String address;
        int area;

        System.out.println("Cost to build: ");
        costToBuild = input.nextInt();

        System.out.println("city name: ");
        cityName = input.nextLine();

        System.out.println("Name: ");
        name = input.nextLine();

        System.out.println("Address: ");
        address = input.nextLine();

        System.out.println("Area: ");
        area = input.nextInt();

        BusTerminal newBusTerminal = new BusTerminal(costToBuild, cityName, name, address, area);
        city.getTerminals().add(newBusTerminal);

        System.out.println("The bus terminal has been built successfully");
    }

    public void showShippingPortBuildPage() {
        Scanner input = new Scanner(System.in);

        //terminal
        int costToBuild;
        String cityName;
        String name;
        String address;
        int area;
        //shipping port
        int wharfCount;

        System.out.println("Cost to build: ");
        costToBuild = input.nextInt();

        System.out.println("city name: ");
        cityName = input.nextLine();

        System.out.println("Name: ");
        name = input.nextLine();

        System.out.println("Address: ");
        address = input.nextLine();

        System.out.println("Area: ");
        area = input.nextInt();

        System.out.println("Wharf count: ");
        wharfCount = input.nextInt();

        ShippingPort newShippingPort = new ShippingPort(costToBuild, cityName, name, address, area, wharfCount);
        city.getTerminals().add(newShippingPort);

        System.out.println("The shipping port has been built successfully");
    }
}
