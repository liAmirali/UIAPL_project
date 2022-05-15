package main.vehicles;

public class InterCityBus extends LandVehicle {
    private final int age;
    private final int maximumSpeed;

    public InterCityBus(int priceToBuy, int capacity, String id, String manufacturer, int wheelCount, int wheelSize, int age, int maximumSpeed) {
        super(priceToBuy, capacity, id, manufacturer, wheelCount, wheelSize);
        this.age = age;
        this.maximumSpeed = maximumSpeed;
    }

    // Getters
    public int getAge() {
        return age;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }
}
