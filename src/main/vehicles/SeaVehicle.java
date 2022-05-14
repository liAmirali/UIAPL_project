package main.vehicles;

abstract public class SeaVehicle extends Vehicle {
    String fuelType;
    int minDepth;

    public SeaVehicle(int priceToBuy, int capacity, String id, String manufacturer, String fuelType, int minDepth) {
        super(priceToBuy, capacity, id, manufacturer);
        this.fuelType = fuelType;
        this.minDepth = minDepth;
    }
}
