package main.vehicles;

abstract public class Vehicle {
    private final int priceToBuy;
    private final int capacity;
    private final int id;
    private final String manufacturer;

    public Vehicle(int priceToBuy, int capacity, int id, String manufacturer) {
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

    public int getId() {
        return id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "priceToBuy=" + priceToBuy +
                ", capacity=" + capacity +
                ", id=" + id +
                ", manufacturer='" + manufacturer + '\'';
    }
}
