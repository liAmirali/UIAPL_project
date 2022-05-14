package main.vehicles;

public class Train extends LandVehicle {
    enum WelfareServices {
        RESTAURANT,
        WC,
        SMOKING_ROOM,
        VENDING_MACHINE,
    }

    public Train(int priceToBuy, int capacity, String id, String manufacturer, int wheelCount, int wheelSize) {
        super(priceToBuy, capacity, id, manufacturer, wheelCount, wheelSize);
    }
}
