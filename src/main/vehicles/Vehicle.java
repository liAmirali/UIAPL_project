package main.vehicles;

abstract public class Vehicle {
    int priceToBuy;
    int capacity;
    String id;
    String manufacturer;

    public Vehicle(int priceToBuy, int capacity, String id, String manufacturer) {
        this.priceToBuy = priceToBuy;
        this.capacity = capacity;
        this.id = id;
        this.manufacturer = manufacturer;
    }
}
