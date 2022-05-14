package main.buildings;

import java.util.ArrayList;

public class Hotel {
    private final String name;
    private final int costToBuild;
    private final String address;
    private int starCount;
    private final int roomCount;

    private final ArrayList<Room> rooms;

    enum Facilities {
        KITCHEN, LOBBY, JANITOR, HAS_COSMETICS
    }

    // Constructors
    public Hotel(String name, int costToBuild, String address, int starCount, int roomCount) {
        this.name = name;
        this.costToBuild = costToBuild;
        this.address = address;
        this.starCount = starCount;
        this.roomCount = roomCount;
        this.rooms = new ArrayList<Room>();
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getCostToBuild() {
        return costToBuild;
    }

    public String getAddress() {
        return address;
    }

    public int getStarCount() {
        return starCount;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    // Setters
    public void setStarCount(int starCount) {
        this.starCount = starCount;
    }
}
