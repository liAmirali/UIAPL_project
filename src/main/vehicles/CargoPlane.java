package main.vehicles;

public class CargoPlane extends AirVehicle {
    private final int maxAcceptableWeight;

    public CargoPlane(int priceToBuy, int capacity, int id, String manufacturer, int maxFlightAltitude, int bandwidth, int maxAcceptableWeight) {
        super(priceToBuy, capacity, id, manufacturer, maxFlightAltitude, bandwidth);
        this.maxAcceptableWeight = maxAcceptableWeight;
    }

    // Getters
    public int getMaxAcceptableWeight() {
        return maxAcceptableWeight;
    }
}
