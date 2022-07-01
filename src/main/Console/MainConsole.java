package main.Console;

import main.City;
import main.Person;
import main.buildings.*;
import main.vehicles.*;

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

        switch (menuCode) {
            case "1" -> showTerminalBuilding();
            case "2" -> showCarPurchasePage();
            case "3" -> showHireADriverPage();
            case "4" -> {
                for (Terminal terminal : city.getTerminals()) {
                    System.out.println(terminal);
                }
            }
            case "5" -> showHotelAdd();
            case "6" -> showHotelRoomAdd();
            case "7" -> {
                for (Hotel hotel : city.getHotels()) {
                    System.out.println(hotel);
                }
            }
            default -> System.out.println("Invalid menu code number!");
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

        Scanner input = new Scanner(System.in);
        System.out.print("Enter menu code: ");
        String menuCode = input.nextLine();

        if (menuCode.equals("1")) {
            showAirlinerPurchase();
        } else if (menuCode.equals("2")) {
            showCargoPlanePurchase();
        } else if (menuCode.equals("3")) {
            showTrainPurchase();
        } else if (menuCode.equals("4")) {
            showBusPurchase();
        } else if (menuCode.equals("5")) {
            showShipPurchase();
        } else if (menuCode.equals("6")) {
            showBoatPurchase();
        } else {
            System.out.println("Invalid menu code number!");
        }
    }

    public void showHireADriverPage() {
        System.out.println();
        cityTerminals.get(terminalID).getDrivers().add(newPerson);

        System.out.println("Successfully added!");
    }

    // VEHICLE PURCHASE
    public void showAirlinerPurchase() {
        Scanner input = new Scanner(System.in);

        ArrayList<Terminal> cityTerminals = city.getTerminals();

        int i = 0;
        for (Terminal terminal : cityTerminals) {
            if (terminal instanceof Airport) {
                System.out.print("ID:" + i + ", ");
                System.out.println(terminal);
            }
            i++;
        }

        System.out.print("Enter terminal ID: ");
        int terminalID = input.nextInt();
        input.nextLine();

        Airport selectedAirport = (Airport) city.getTerminals().get(terminalID);

        int staffCount;
        int maxFlightAltitude;
        int bandwidth;
        int priceToBuy;
        int capacity;
        int id;
        String manufacturer;

        System.out.println("Staff count: ");
        staffCount = input.nextInt();
        input.nextLine();

        System.out.println("Max flight altitude: ");
        maxFlightAltitude = input.nextInt();
        input.nextLine();

        System.out.println("Bandwidth: ");
        bandwidth = input.nextInt();
        input.nextLine();

        System.out.println("Price to buy: ");
        priceToBuy = input.nextInt();
        input.nextLine();

        if (priceToBuy > city.getBudget()) {
            System.out.println("You can't purchase this.");
            return;
        } else {
            city.setBudget(city.getBudget() - priceToBuy);
        }

        System.out.println("Capacity: ");
        capacity = input.nextInt();
        input.nextLine();

        id = selectedAirport.getVehicleCount();

        System.out.println("Manufacturer: ");
        manufacturer = input.nextLine();

        Airliner newAirliner = new Airliner(priceToBuy, capacity, id, manufacturer, maxFlightAltitude, bandwidth, staffCount);
        selectedAirport.getAirVehicles().add(newAirliner);

        System.out.println("Successfully added!");
    }

    public void showCargoPlanePurchase() {
        Scanner input = new Scanner(System.in);

        ArrayList<Terminal> cityTerminals = city.getTerminals();

        int i = 0;
        for (Terminal terminal : cityTerminals) {
            if (terminal instanceof Airport) {
                System.out.print("ID:" + i + ", ");
                System.out.println(terminal);
            }
            i++;
        }

        System.out.print("Enter terminal ID: ");
        int terminalID = input.nextInt();
        input.nextLine();

        Airport selectedAirport = (Airport) city.getTerminals().get(terminalID);

        int maxAcceptableWeight;
        int maxFlightAltitude;
        int bandwidth;
        int priceToBuy;
        int capacity;
        int id;
        String manufacturer;

        System.out.println("Max Acceptable Weight: ");
        maxAcceptableWeight = input.nextInt();
        input.nextLine();

        System.out.println("Max flight altitude: ");
        maxFlightAltitude = input.nextInt();
        input.nextLine();

        System.out.println("Bandwidth: ");
        bandwidth = input.nextInt();
        input.nextLine();

        System.out.println("Price to buy: ");
        priceToBuy = input.nextInt();
        input.nextLine();

        if (priceToBuy > city.getBudget()) {
            System.out.println("You can't purchase this.");
            return;
        } else {
            city.setBudget(city.getBudget() - priceToBuy);
        }

        System.out.println("Capacity: ");
        capacity = input.nextInt();
        input.nextLine();

        id = selectedAirport.getVehicleCount();

        System.out.println("Manufacturer: ");
        manufacturer = input.nextLine();

        CargoPlane newCargoPlane = new CargoPlane(priceToBuy, capacity, id, manufacturer, maxFlightAltitude, bandwidth, maxAcceptableWeight);
        selectedAirport.getAirVehicles().add(newCargoPlane);

        System.out.println("Successfully added!");
    }

    public void showTrainPurchase() {
        Scanner input = new Scanner(System.in);

        ArrayList<Terminal> cityTerminals = city.getTerminals();

        int i = 0;
        for (Terminal terminal : cityTerminals) {
            if (terminal instanceof Airport) {
                System.out.print("ID:" + i + ", ");
                System.out.println(terminal);
            }
            i++;
        }

        System.out.print("Enter terminal ID: ");
        int terminalID = input.nextInt();
        input.nextLine();

        RailwayStation selectedRailwayStation = (RailwayStation) city.getTerminals().get(terminalID);

        int priceToBuy;
        int capacity;
        int id;
        String manufacturer;

        System.out.println("Price to buy: ");
        priceToBuy = input.nextInt();
        input.nextLine();

        if (priceToBuy > city.getBudget()) {
            System.out.println("You can't purchase this.");
            return;
        } else {
            city.setBudget(city.getBudget() - priceToBuy);
        }

        System.out.println("Capacity: ");
        capacity = input.nextInt();
        input.nextLine();

        id = selectedRailwayStation.getVehicleCount();

        System.out.println("Manufacturer: ");
        manufacturer = input.nextLine();

        Train newTrain = new Train(priceToBuy, capacity, id, manufacturer);
        selectedRailwayStation.getTrains().add(newTrain);

        System.out.println("Successfully added!");
    }

    public void showBusPurchase() {
        Scanner input = new Scanner(System.in);

        ArrayList<Terminal> cityTerminals = city.getTerminals();

        int i = 0;
        for (Terminal terminal : cityTerminals) {
            if (terminal instanceof Airport) {
                System.out.print("ID:" + i + ", ");
                System.out.println(terminal);
            }
            i++;
        }

        System.out.print("Enter terminal ID: ");
        int terminalID = input.nextInt();
        input.nextLine();

        BusTerminal selectedBusTerminal = (BusTerminal) city.getTerminals().get(terminalID);

        int age;
        int maximumSpeed;
        int priceToBuy;
        int capacity;
        int id;
        String manufacturer;

        System.out.println("Age: ");
        age = input.nextInt();
        input.nextLine();

        System.out.println("Maximum Speed: ");
        maximumSpeed = input.nextInt();
        input.nextLine();

        System.out.println("Price to buy: ");
        priceToBuy = input.nextInt();
        input.nextLine();

        if (priceToBuy > city.getBudget()) {
            System.out.println("You can't purchase this.");
            return;
        } else {
            city.setBudget(city.getBudget() - priceToBuy);
        }

        System.out.println("Capacity: ");
        capacity = input.nextInt();
        input.nextLine();

        id = selectedBusTerminal.getVehicleCount();

        System.out.println("Manufacturer: ");
        manufacturer = input.nextLine();

        InterCityBus newInterCityBus = new InterCityBus(priceToBuy, capacity, id, manufacturer, age, maximumSpeed);
        selectedBusTerminal.getBuses().add(newInterCityBus);

        System.out.println("Successfully added!");
    }

    public void showShipPurchase() {
        Scanner input = new Scanner(System.in);

        ArrayList<Terminal> cityTerminals = city.getTerminals();

        int i = 0;
        for (Terminal terminal : cityTerminals) {
            if (terminal instanceof Airport) {
                System.out.print("ID:" + i + ", ");
                System.out.println(terminal);
            }
            i++;
        }

        System.out.print("Enter terminal ID: ");
        int terminalID = input.nextInt();
        input.nextLine();

        ShippingPort selectedShippingPort = (ShippingPort) city.getTerminals().get(terminalID);

        String fuelType;
        int minDepth;
        String type;
        int length;
        int priceToBuy;
        int capacity;
        int id;
        String manufacturer;


        System.out.println("Fuel Type: ");
        fuelType = input.nextLine();

        System.out.println("Min Depth: ");
        minDepth = input.nextInt();
        input.nextLine();

        System.out.println("Price to buy: ");
        priceToBuy = input.nextInt();
        input.nextLine();

        if (priceToBuy > city.getBudget()) {
            System.out.println("You can't purchase this.");
            return;
        } else {
            city.setBudget(city.getBudget() - priceToBuy);
        }

        System.out.println("Capacity: ");
        capacity = input.nextInt();
        input.nextLine();

        System.out.println("Type: ");
        type = input.nextLine();

        System.out.println("Length: ");
        length = input.nextInt();
        input.nextLine();

        id = selectedShippingPort.getVehicleCount();

        System.out.println("Manufacturer: ");
        manufacturer = input.nextLine();

        Ship newShip = new Ship(priceToBuy, capacity, id, manufacturer, fuelType, minDepth, type, length);
        selectedShippingPort.getSeaVehicles().add(newShip);

        System.out.println("Successfully added!");
    }

    public void showBoatPurchase() {
        Scanner input = new Scanner(System.in);

        ArrayList<Terminal> cityTerminals = city.getTerminals();

        int i = 0;
        for (Terminal terminal : cityTerminals) {
            if (terminal instanceof Airport) {
                System.out.print("ID:" + i + ", ");
                System.out.println(terminal);
            }
            i++;
        }

        System.out.print("Enter terminal ID: ");
        int terminalID = input.nextInt();
        input.nextLine();

        ShippingPort selectedShippingPort = (ShippingPort) city.getTerminals().get(terminalID);

        String fuelType;
        int minDepth;
        boolean hasMotor;
        int motorPower;
        int priceToBuy;
        int capacity;
        int id;
        String manufacturer;


        System.out.println("Fuel Type: ");
        fuelType = input.nextLine();

        System.out.println("Min Depth: ");
        minDepth = input.nextInt();
        input.nextLine();

        System.out.println("Has motor (True/False): ");
        hasMotor = input.nextBoolean();
        input.nextLine();

        System.out.println("Motor Power: ");
        motorPower = input.nextInt();
        input.nextLine();

        System.out.println("Price to buy: ");
        priceToBuy = input.nextInt();
        input.nextLine();

        if (priceToBuy > city.getBudget()) {
            System.out.println("You can't purchase this.");
            return;
        } else {
            city.setBudget(city.getBudget() - priceToBuy);
        }

        System.out.println("Capacity: ");
        capacity = input.nextInt();
        input.nextLine();

        id = selectedShippingPort.getVehicleCount();

        System.out.println("Manufacturer: ");
        manufacturer = input.nextLine();

        Boat newBoat = new Boat(priceToBuy, capacity, id, manufacturer, fuelType, minDepth, hasMotor, motorPower);
        selectedShippingPort.getSeaVehicles().add(newBoat);

        System.out.println("Successfully added!");
    }

    // TERMINAL BUILD
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
        input.nextLine();

        if (costToBuild > city.getBudget()) {
            System.out.println("You can't purchase this.");
            return;
        } else {
            city.setBudget(city.getBudget() - costToBuild);
        }

        System.out.println("city name: ");
        cityName = input.nextLine();

        System.out.println("Name: ");
        name = input.nextLine();

        System.out.println("Address: ");
        address = input.nextLine();

        System.out.println("Area: ");
        area = input.nextInt();
        input.nextLine();

        System.out.println("Runway count");
        runwayCount = input.nextInt();
        input.nextLine();

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
        input.nextLine();

        if (costToBuild > city.getBudget()) {
            System.out.println("You can't purchase this.");
            return;
        } else {
            city.setBudget(city.getBudget() - costToBuild);
        }

        System.out.println("city name: ");
        cityName = input.nextLine();

        System.out.println("Name: ");
        name = input.nextLine();

        System.out.println("Address: ");
        address = input.nextLine();

        System.out.println("Area: ");
        area = input.nextInt();
        input.nextLine();

        System.out.println("Input rail count");
        inputRailCount = input.nextInt();
        input.nextLine();

        System.out.println("Output rail count");
        outputRailCount = input.nextInt();
        input.nextLine();


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
        input.nextLine();

        if (costToBuild > city.getBudget()) {
            System.out.println("You can't purchase this.");
            return;
        } else {
            city.setBudget(city.getBudget() - costToBuild);
        }

        System.out.println("city name: ");
        cityName = input.nextLine();

        System.out.println("Name: ");
        name = input.nextLine();

        System.out.println("Address: ");
        address = input.nextLine();

        System.out.println("Area: ");
        area = input.nextInt();
        input.nextLine();

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
        input.nextLine();

        if (costToBuild > city.getBudget()) {
            System.out.println("You can't purchase this.");
            return;
        } else {
            city.setBudget(city.getBudget() - costToBuild);
        }

        System.out.println("city name: ");
        cityName = input.nextLine();

        System.out.println("Name: ");
        name = input.nextLine();

        System.out.println("Address: ");
        address = input.nextLine();

        System.out.println("Area: ");
        area = input.nextInt();
        input.nextLine();

        System.out.println("Wharf count: ");
        wharfCount = input.nextInt();
        input.nextLine();

        ShippingPort newShippingPort = new ShippingPort(costToBuild, cityName, name, address, area, wharfCount);
        city.getTerminals().add(newShippingPort);

        System.out.println("The shipping port has been built successfully");
    }

    // HOTEL
    public void showHotelAdd() {
        String name;
        int costToBuild;
        String address;
        int starCount;
        int roomCount;

        Scanner input = new Scanner(System.in);

        System.out.println("Name: ");
        name = input.nextLine();

        System.out.println("Cost To Build: ");
        costToBuild = input.nextInt();

        if (costToBuild > city.getBudget()) {
            System.out.println("You cannot build this.");
            return;
        }

        System.out.println("Address: ");
        address = input.nextLine();

        System.out.println("Star count: ");
        starCount = input.nextInt();


        System.out.println("Room count");
        roomCount = input.nextInt();

        Hotel newHotel = new Hotel(name, costToBuild, address, starCount, roomCount);
        city.getHotels().add(newHotel);

        System.out.println("Hotel was created successfully!");
    }

    public void showHotelRoomAdd() {
        int i = 0;
        for (Hotel hotel : city.getHotels()) {
            System.out.print("ID: " + i + ", ");
            System.out.println(hotel);
            i++;
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the hotel to add rooms to");
        int hotelID = input.nextInt();
        input.nextLine();
        Hotel selectedOne = city.getHotels().get(hotelID);

        String roomNum;
        int bedCount;
        int area;
        int accommodationPrice;

        System.out.println("Room count: ");
        roomNum = input.nextLine();

        System.out.println("Bed count: ");
        bedCount = input.nextInt();

        System.out.println("Area: ");
        area = input.nextInt();

        System.out.println("accommodation price: ");
        accommodationPrice = input.nextInt();

        Room newRoom = new Room(roomNum, bedCount, area, accommodationPrice);
        selectedOne.getRooms().add(newRoom);

    }
}
