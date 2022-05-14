package main.vehicles;

public class Airliner extends AirVehicle {
    int staffCount;
    enum SeatClasses {
        FIRST_CLASS,
        ECONOMY,
        BUSINESS
    }

    public Airliner(int priceToBuy, int capacity, String id, String manufacturer, int maxFlightAltitude, int bandwidth, int staffCount) {
        super(priceToBuy, capacity, id, manufacturer, maxFlightAltitude, bandwidth);
        this.staffCount = staffCount;
    }
}