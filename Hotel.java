package com.hotel;
import java.util.ArrayList;
import java.util.List;
public class Hotel {
    private String name;
    private List<Rooms> rooms = new ArrayList<>();
    public Hotel(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("Name khali nahi ho sakta");
        this.name = name;
    }
    public void addRoom(Rooms room) { rooms.add(room); }
    public String getName() { return name; }
    public List<Rooms> getRooms() { return rooms; }
}