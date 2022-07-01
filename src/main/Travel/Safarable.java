package main.Travel;

import main.Person;
import main.buildings.Terminal;
import main.vehicles.Vehicle;

import java.time.LocalDateTime;
import java.util.ArrayList;

public interface Safarable {
    Travel createNewTravel(Terminal originTerminal, Terminal sourceTerminal, Person driver, Vehicle vehicle, LocalDateTime dateTime, int cost);

    ArrayList<Travel> sortTravels();

    int calculateTravelCost(ArrayList<Person> travelers, Vehicle vehicle);

    ArrayList<Travel> getTravelHistory(String travelType);
}
