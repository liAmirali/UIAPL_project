package main.vehicles;

public class InterCityBus extends LandVehicle {
    private final int age;
    private final int maximumSpeed;

    public InterCityBus(int priceToBuy, int capacity, int id, String manufacturer, int age, int maximumSpeed) {
        super(priceToBuy, capacity, id, manufacturer);
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
