package main.console;

import main.City;
import main.buildings.*;
import main.vehicles.*;

import java.util.ArrayList;
import java.util.Scanner;

public class CityConsole {
    private final City city;

    public CityConsole(City city) {
        this.city = city;
    }

    public City getCity() {
        return city;
    }

    public void showMainMenu() {
        System.out.println("[0] Build a terminal.");
        System.out.println("[1] Buy vehicles.");
        System.out.println("[2] Hire drivers");
        System.out.println("[3] Get terminal details");
        System.out.println("[4] Build a hotel");
        System.out.println("[5] Build rooms for an existing hotel");
        System.out.println("[6] Get hotels details ");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter menu code: ");
        String menuCode = input.nextLine();

        switch (menuCode) {
            case "0" -> showTerminalBuilding();
            case "1" -> showCarPurchasePage();
            case "2" -> showHireADriverPage();
            case "3" -> {
                for (Terminal terminal : city.getTerminals()) {
                    System.out.println(terminal);
                }
            }
            case "4" -> showHotelAdd();
            case "5" -> showHotelRoomAdd();
            case "6" -> {
                for (Hotel hotel : city.getHotels()) {
                    System.out.println(hotel);
                }
            }
            default -> System.out.println("Invalid menu code number!");
        }
    }

    public void showTerminalBuilding() {
        System.out.println("[0] Build an airport");
        System.out.println("[1] Build a railway station");
        System.out.println("[2] Build a bus terminal");
        System.out.println("[3] Build a shipping port");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter menu code: ");
        String menuCode = input.nextLine();

        switch (menuCode) {
            case "0" -> showAirportBuildPage();
            case "1" -> showRailwayStationBuildPage();
            case "2" -> showBusTerminalBuildPage();
            case "3" -> showShippingPortBuildPage();
            default -> System.out.println("Invalid menu code number!");
        }
    }

    public void showCarPurchasePage() {
        System.out.println("--- Air Vehicles ---");
        System.out.println("[0] Airliner");
        System.out.println("[1] Cargo Plane");

        System.out.println("--- Land Vehicles ---");
        System.out.println("[2] Train");
        System.out.println("[3] Inter-city Bus");

        System.out.println("--- Sea Vehicles ---");
        System.out.println("[4] Ship");
        System.out.println("[5] Boat");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter menu code: ");
        String menuCode = input.nextLine();

        switch (menuCode) {
            case "0" -> showAirlinerPurchase();
            case "1" -> showCargoPlanePurchase();
            case "2" -> showTrainPurchase();
            case "3" -> showBusPurchase();
            case "4" -> showShipPurchase();
            case "5" -> showBoatPurchase();
            default -> System.out.println("Invalid menu code number!");
        }
    }

    public void showHireADriverPage() {
        System.out.println();
//        cityTerminals.get(terminalID).getDrivers().add(newPerson);

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

        System.out.print("Staff count: ");
        staffCount = input.nextInt();
        input.nextLine();

        System.out.print("Max flight altitude: ");
        maxFlightAltitude = input.nextInt();
        input.nextLine();

        System.out.print("Bandwidth: ");
        bandwidth = input.nextInt();
        input.nextLine();

        System.out.print("Price to buy: ");
        priceToBuy = input.nextInt();
        input.nextLine();

        if (priceToBuy > city.getBudget()) {
            System.out.println("You can't purchase this.");
            return;
        } else {
            city.setBudget(city.getBudget() - priceToBuy);
        }

        System.out.print("Capacity: ");
        capacity = input.nextInt();
        input.nextLine();

        id = selectedAirport.getVehicleCount();

        System.out.print("Manufacturer: ");
        manufacturer = input.nextLine();

        Airliner newAirliner = new Airliner(priceToBuy, capacity, id, manufacturer, maxFlightAltitude, bandwidth, staffCount);
        selectedAirport.getVehicles().add(newAirliner);

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

        System.out.print("Max Acceptable Weight: ");
        maxAcceptableWeight = input.nextInt();
        input.nextLine();

        System.out.print("Max flight altitude: ");
        maxFlightAltitude = input.nextInt();
        input.nextLine();

        System.out.print("Bandwidth: ");
        bandwidth = input.nextInt();
        input.nextLine();

        System.out.print("Price to buy: ");
        priceToBuy = input.nextInt();
        input.nextLine();

        if (priceToBuy > city.getBudget()) {
            System.out.println("You can't purchase this.");
            return;
        } else {
            city.setBudget(city.getBudget() - priceToBuy);
        }

        System.out.print("Capacity: ");
        capacity = input.nextInt();
        input.nextLine();

        id = selectedAirport.getVehicleCount();

        System.out.print("Manufacturer: ");
        manufacturer = input.nextLine();

        CargoPlane newCargoPlane = new CargoPlane(priceToBuy, capacity, id, manufacturer, maxFlightAltitude, bandwidth, maxAcceptableWeight);
        selectedAirport.getVehicles().add(newCargoPlane);

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

        System.out.print("Price to buy: ");
        priceToBuy = input.nextInt();
        input.nextLine();

        if (priceToBuy > city.getBudget()) {
            System.out.println("You can't purchase this.");
            return;
        } else {
            city.setBudget(city.getBudget() - priceToBuy);
        }

        System.out.print("Capacity: ");
        capacity = input.nextInt();
        input.nextLine();

        id = selectedRailwayStation.getVehicleCount();

        System.out.print("Manufacturer: ");
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

        System.out.print("Age: ");
        age = input.nextInt();
        input.nextLine();

        System.out.print("Maximum Speed: ");
        maximumSpeed = input.nextInt();
        input.nextLine();

        System.out.print("Price to buy: ");
        priceToBuy = input.nextInt();
        input.nextLine();

        if (priceToBuy > city.getBudget()) {
            System.out.println("You can't purchase this.");
            return;
        } else {
            city.setBudget(city.getBudget() - priceToBuy);
        }

        System.out.print("Capacity: ");
        capacity = input.nextInt();
        input.nextLine();

        id = selectedBusTerminal.getVehicleCount();

        System.out.print("Manufacturer: ");
        manufacturer = input.nextLine();

        InterCityBus newInterCityBus = new InterCityBus(priceToBuy, capacity, id, manufacturer, age, maximumSpeed);
        selectedBusTerminal.getVehicles().add(newInterCityBus);

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


        System.out.print("Fuel Type: ");
        fuelType = input.nextLine();

        System.out.print("Min Depth: ");
        minDepth = input.nextInt();
        input.nextLine();

        System.out.print("Price to buy: ");
        priceToBuy = input.nextInt();
        input.nextLine();

        if (priceToBuy > city.getBudget()) {
            System.out.println("You can't purchase this.");
            return;
        } else {
            city.setBudget(city.getBudget() - priceToBuy);
        }

        System.out.print("Capacity: ");
        capacity = input.nextInt();
        input.nextLine();

        System.out.print("Type: ");
        type = input.nextLine();

        System.out.print("Length: ");
        length = input.nextInt();
        input.nextLine();

        id = selectedShippingPort.getVehicleCount();

        System.out.print("Manufacturer: ");
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


        System.out.print("Fuel Type: ");
        fuelType = input.nextLine();

        System.out.print("Min Depth: ");
        minDepth = input.nextInt();
        input.nextLine();

        System.out.print("Has motor (True/False): ");
        hasMotor = input.nextBoolean();
        input.nextLine();

        System.out.print("Motor Power: ");
        motorPower = input.nextInt();
        input.nextLine();

        System.out.print("Price to buy: ");
        priceToBuy = input.nextInt();
        input.nextLine();

        if (priceToBuy > city.getBudget()) {
            System.out.println("You can't purchase this.");
            return;
        } else {
            city.setBudget(city.getBudget() - priceToBuy);
        }

        System.out.print("Capacity: ");
        capacity = input.nextInt();
        input.nextLine();

        id = selectedShippingPort.getVehicleCount();

        System.out.print("Manufacturer: ");
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
        String name;
        String address;
        int area;
        //airport
        int runwayCount;
        boolean isInternational;

        String temp;

        System.out.print("Cost to build: ");
        costToBuild = input.nextInt();
        input.nextLine();

        if (costToBuild > city.getBudget()) {
            System.out.println("You can't purchase this.");
            return;
        } else {
            city.setBudget(city.getBudget() - costToBuild);
        }

        System.out.print("Terminal Name: ");
        name = input.nextLine();

        System.out.println("Address: ");
        address = input.nextLine();

        System.out.print("Area: ");
        area = input.nextInt();
        input.nextLine();

        System.out.print("Runway count");
        runwayCount = input.nextInt();
        input.nextLine();

        System.out.print("Is internation? (y/n) ");
        temp = input.nextLine();
        if (temp.equals("y")) isInternational = true;
        else if (temp.equals("n")) isInternational = false;
        else {
            System.out.println("Invalid input. Set to true by default.");
            isInternational = true;
        }


        Airport newAirport = new Airport(costToBuild, city.getName(), name, address, area, runwayCount, isInternational);
        city.getTerminals().add(newAirport);

        System.out.println("The airport has been built successfully");
    }

    public void showRailwayStationBuildPage() {
        Scanner input = new Scanner(System.in);

        //terminal
        int costToBuild;
        String name;
        String address;
        int area;
        //railway
        int inputRailCount;
        int outputRailCount;

        String temp;

        System.out.print("Cost to build: ");
        costToBuild = input.nextInt();
        input.nextLine();

        if (costToBuild > city.getBudget()) {
            System.out.println("You can't purchase this.");
            return;
        } else {
            city.setBudget(city.getBudget() - costToBuild);
        }

        System.out.print("Terminal Name: ");
        name = input.nextLine();

        System.out.print("Address: ");
        address = input.nextLine();

        System.out.println("Area: ");
        area = input.nextInt();
        input.nextLine();

        System.out.print("Input rail count: ");
        inputRailCount = input.nextInt();
        input.nextLine();

        System.out.print("Output rail count: ");
        outputRailCount = input.nextInt();
        input.nextLine();


        RailwayStation newRailwayStation = new RailwayStation(costToBuild, city.getName(), name, address, area, inputRailCount, outputRailCount);
        city.getTerminals().add(newRailwayStation);

        System.out.println("The railway station has been built successfully");
    }

    public void showBusTerminalBuildPage() {
        Scanner input = new Scanner(System.in);

        //terminal
        int costToBuild;
        String name;
        String address;
        int area;

        System.out.print("Cost to build: ");
        costToBuild = input.nextInt();
        input.nextLine();

        if (costToBuild > city.getBudget()) {
            System.out.println("You can't purchase this.");
            return;
        } else {
            city.setBudget(city.getBudget() - costToBuild);
        }

        System.out.print("Terminal Name: ");
        name = input.nextLine();

        System.out.println("Address: ");
        address = input.nextLine();

        System.out.print("Area: ");
        area = input.nextInt();
        input.nextLine();

        BusTerminal newBusTerminal = new BusTerminal(costToBuild, city.getName(), name, address, area);
        city.getTerminals().add(newBusTerminal);

        System.out.println("The bus terminal has been built successfully");
    }

    public void showShippingPortBuildPage() {
        Scanner input = new Scanner(System.in);

        //terminal
        int costToBuild;
        String name;
        String address;
        int area;
        //shipping port
        int wharfCount;

        System.out.print("Cost to build: ");
        costToBuild = input.nextInt();
        input.nextLine();

        if (costToBuild > city.getBudget()) {
            System.out.println("You can't purchase this.");
            return;
        } else {
            city.setBudget(city.getBudget() - costToBuild);
        }

        System.out.print("Terminal Name: ");
        name = input.nextLine();

        System.out.print("Address: ");
        address = input.nextLine();

        System.out.print("Area: ");
        area = input.nextInt();
        input.nextLine();

        System.out.print("Wharf count: ");
        wharfCount = input.nextInt();
        input.nextLine();

        ShippingPort newShippingPort = new ShippingPort(costToBuild, city.getName(), name, address, area, wharfCount);
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

        System.out.print("Name: ");
        name = input.nextLine();

        System.out.print("Cost To Build: ");
        costToBuild = input.nextInt();

        if (costToBuild > city.getBudget()) {
            System.out.println("You cannot build this.");
            return;
        }

        System.out.println("Address: ");
        address = input.nextLine();

        System.out.print("Star count: ");
        starCount = input.nextInt();


        System.out.print("Room count");
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
        System.out.print("Enter the hotel ID to add rooms to");
        int hotelID = input.nextInt();
        input.nextLine();
        Hotel selectedOne = city.getHotels().get(hotelID);

        String roomNum;
        int bedCount;
        int area;
        int accommodationPrice;

        System.out.print("Room Number: ");
        roomNum = input.nextLine();

        System.out.print("Bed count: ");
        bedCount = input.nextInt();

        System.out.print("Area: ");
        area = input.nextInt();

        System.out.print("Inhabitancy Price: ");
        accommodationPrice = input.nextInt();

        Room newRoom = new Room(roomNum, bedCount, area, accommodationPrice);
        selectedOne.getRooms().add(newRoom);
    }
}
