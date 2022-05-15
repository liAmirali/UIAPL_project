package main.vehicles;

abstract public class Vehicle {
    private final int priceToBuy;
    private final int capacity;
    private final String id;
    private final String manufacturer;

    public Vehicle(int priceToBuy, int capacity, String id, String manufacturer) {
        this.priceToBuy = priceToBuy;
        this.capacity = capacity;
        this.id = id;
        this.manufacturer = manufacturer;
    }

    // Getters
    public int getPriceToBuy() {
        return priceToBuy;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getId() {
        return id;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
