package main.vehicles;

public class Boat extends SeaVehicle {
    private final boolean hasMotor;
    private final int motorPower;

    public Boat(int priceToBuy, int capacity, int id, String manufacturer, String fuelType, int minDepth, boolean hasMotor, int motorPower) {
        super(priceToBuy, capacity, id, manufacturer, fuelType, minDepth);
        this.hasMotor = hasMotor;
        this.motorPower = motorPower;
    }

    // Getters
    public boolean isHasMotor() {
        return hasMotor;
    }

    public int getMotorPower() {
        return motorPower;
    }
}
