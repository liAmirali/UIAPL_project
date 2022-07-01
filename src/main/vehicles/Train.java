package main.vehicles;

public class Train extends LandVehicle {
    enum WelfareServices {
        RESTAURANT,
        WC,
        SMOKING_ROOM,
        VENDING_MACHINE,
    }

    public Train(int priceToBuy, int capacity, int id, String manufacturer) {
        super(priceToBuy, capacity, id, manufacturer);
    }
}
