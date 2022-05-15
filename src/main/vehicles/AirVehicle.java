package main.vehicles;

abstract public class AirVehicle extends Vehicle {
    private final int maxFlightAltitude;
    private final int bandwidth;

    public AirVehicle(int priceToBuy, int capacity, String id, String manufacturer, int maxFlightAltitude, int bandwidth) {
        super(priceToBuy, capacity, id, manufacturer);
        this.maxFlightAltitude = maxFlightAltitude;
        this.bandwidth = bandwidth;
    }

    // Getters
    public int getMaxFlightAltitude() {
        return maxFlightAltitude;
    }

    public int getBandwidth() {
        return bandwidth;
    }
}
