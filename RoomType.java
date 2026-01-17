package com;

public class RoomType {
    private String kind; // UML: RoomKind
    private double cost; // UML: Money

    public RoomType(String kind, double cost) {
        // Defensive: Price validation
        if (cost <= 0) throw new IllegalArgumentException("Cost must be a positive value.");
        if (kind == null || kind.trim().isEmpty()) throw new IllegalArgumentException("Room kind is required.");
        
        this.kind = kind;
        this.cost = cost;
    }

    public String getKind() { return kind; }
    public double getCost() { return cost; }
}