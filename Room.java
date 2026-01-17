package com;

public class Room {
    private int number; // UML Attribute
    private RoomType type;
    private Guest occupied; // UML Association 0..1

    public Room(int number, RoomType type) {
        if (number <= 0) throw new IllegalArgumentException("Invalid room number.");
        if (type == null) throw new IllegalArgumentException("Room type cannot be null.");
        this.number = number;
        this.type = type;
    }

    // UML Operation: createGuest()
    public void createGuest(String name, String address) {
        this.occupied = new Guest(name, address);
    }

    public int getNumber() { return number; }
    public RoomType getType() { return type; }
    public Guest getOccupied() { return occupied; }
}