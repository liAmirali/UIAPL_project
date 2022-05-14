package main.vehicles;

abstract public class AirVehicle extends Vehicle {
    int maxFlightAltitude;
    int bandwidth;

    public AirVehicle(int priceToBuy, int capacity, String id, String manufacturer, int maxFlightAltitude, int bandwidth) {
        super(priceToBuy, capacity, id, manufacturer);
        this.maxFlightAltitude = maxFlightAltitude;
        this.bandwidth = bandwidth;
    }
}
