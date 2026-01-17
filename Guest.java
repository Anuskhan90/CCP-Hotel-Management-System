package com;

public class Guest {
    private String name;
    private String addressDetails; // UML Attribute

    public Guest(String name, String address) {
        // Defensive: Validation
        if (name == null || address == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Guest name and address are required.");
        }
        this.name = name;
        this.addressDetails = address;
    }

    public String getName() { return name; }
    public String getAddressDetails() { return addressDetails; }
}