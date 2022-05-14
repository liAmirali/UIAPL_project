package main.vehicles;

public class Boat extends SeaVehicle {
    boolean hasMotor;
    int motorPower;

    public Boat(int priceToBuy, int capacity, String id, String manufacturer, String fuelType, int minDepth, boolean hasMotor, int motorPower) {
        super(priceToBuy, capacity, id, manufacturer, fuelType, minDepth);
        this.hasMotor = hasMotor;
        this.motorPower = motorPower;
    }


}
