package main.Console;

import main.City;
import main.Person;
import main.buildings.Terminal;

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
        if (input.nextLine().equals("male")) {
            gender = true;
        } else if (input.nextLine().equals("female")) {
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
}
