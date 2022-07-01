package main.vehicles;

abstract public class SeaVehicle extends Vehicle {
    private final String fuelType;
    private final int minDepth;

    public SeaVehicle(int priceToBuy, int capacity, int id, String manufacturer, String fuelType, int minDepth) {
        super(priceToBuy, capacity, id, manufacturer);
        this.fuelType = fuelType;
        this.minDepth = minDepth;
    }

    // Getters
    public String getFuelType() {
        return fuelType;
    }

    public int getMinDepth() {
        return minDepth;
    }
}
