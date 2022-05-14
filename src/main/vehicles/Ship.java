package main.vehicles;

public class Ship extends SeaVehicle {
    String type;
    int length;
    enum SafetyEquipments {
        LIFEBOATS, SURVIVAL_SUITS,
    }

    public Ship(int priceToBuy, int capacity, String id, String manufacturer, String fuelType, int minDepth, String type, int length) {
        super(priceToBuy, capacity, id, manufacturer, fuelType, minDepth);
        this.type = type;
        this.length = length;
    }
}
