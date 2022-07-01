package main.vehicles;

public class Ship extends SeaVehicle {
    final private String type;
    final private int length;
    enum SafetyEquipments {
        LIFEBOATS, SURVIVAL_SUITS,
    }

    public Ship(int priceToBuy, int capacity, int id, String manufacturer, String fuelType, int minDepth, String type, int length) {
        super(priceToBuy, capacity, id, manufacturer, fuelType, minDepth);
        this.type = type;
        this.length = length;
    }

    // Getters
    public String getType() {
        return type;
    }

    public int getLength() {
        return length;
    }
}
