package com;

public class ReserverPayer {
    private String creditCardDetails; // UML Attribute
    private String id; // UML Attribute

    public ReserverPayer(String id, String card) {
        // Defensive: Identity aur card details null nahi honi chahiye
        if (id == null || card == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("Reserver ID and Credit Card details are required.");
        }
        this.id = id;
        this.creditCardDetails = card;
    }

    public String getId() { return id; }
}