package main.buildings;

public class Room {
    private final String roomNum;
    private final int bedCount;
    private final int area;
    private final int accommodationPrice;

    public Room(String roomNum, int bedCount, int area, int accommodationPrice) {
        this.roomNum = roomNum;
        this.bedCount = bedCount;
        this.area = area;
        this.accommodationPrice = accommodationPrice;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public int getBedCount() {
        return bedCount;
    }

    public int getArea() {
        return area;
    }

    public int getAccommodationPrice() {
        return accommodationPrice;
    }
}
