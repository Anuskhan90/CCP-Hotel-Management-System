package com.hotel;
public class Rooms {
    private int number;
    private RoomType type;
    public Rooms(int number, RoomType type) {
        if (number <= 0) throw new IllegalArgumentException("Room number 0 se bara hona chahiye");
        this.number = number; this.type = type;
    }
    public int getNumber() { return number; }
    public RoomType getType() { return type; }
}