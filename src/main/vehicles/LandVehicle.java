package main.vehicles;

abstract public class LandVehicle extends Vehicle{
    private final int wheelCount;
    private final int wheelSize;

    public LandVehicle(int priceToBuy, int capacity, String id, String manufacturer, int wheelCount, int wheelSize) {
        super(priceToBuy, capacity, id, manufacturer);
        this.wheelCount = wheelCount;
        this.wheelSize = wheelSize;
    }

    // Getters
    public int getWheelCount() {
        return wheelCount;
    }

    public int getWheelSize() {
        return wheelSize;
    }
}
