package com;

public class HowMany {
    private int number; // UML Attribute

    public HowMany(int number) {
        // Defensive: Kam se kam 1 room hona chahiye
        if (number <= 0) throw new IllegalArgumentException("Number of rooms must be at least 1.");
        this.number = number;
    }

    public int getNumber() { return number; }
}