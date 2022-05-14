package main.vehicles;

public class InterCityBus extends LandVehicle {
    int age;
    int maximumSpeed;

    public InterCityBus(int priceToBuy, int capacity, String id, String manufacturer, int wheelCount, int wheelSize, int age, int maximumSpeed) {
        super(priceToBuy, capacity, id, manufacturer, wheelCount, wheelSize);
        this.age = age;
        this.maximumSpeed = maximumSpeed;
    }
}
