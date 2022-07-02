package main.buildings;

public class Room {
    private final String roomNum;
    private final int bedCount;
    private final int area;
    private final int inhabitancyPrice;

    public Room(String roomNum, int bedCount, int area, int inhabitancyPrice) {
        this.roomNum = roomNum;
        this.bedCount = bedCount;
        this.area = area;
        this.inhabitancyPrice = inhabitancyPrice;
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

    public int getInhabitancyPrice() {
        return inhabitancyPrice;
    }
}
