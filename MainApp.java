package com;
import java.util.Date;

public class MainApp {
    public static void main(String[] args) {
        try {
            System.out.println("--- Hotel Management System Demonstration ---");

            // 1. Objects Creation (UML Use Case)
            HotelChain chain = new HotelChain("Star Group");
            Hotel pc = new Hotel("PC Karachi");
            chain.addHotel(pc);

            RoomType lux = new RoomType("Luxury Suite", 25000);
            Room r1 = new Room(501, lux);
            pc.addRoom(r1);

            // 2. Interaction (UML Use Case)
            chain.makeReservation();
            r1.createGuest("Anus Khan", "Karachi, Pakistan");
            chain.checkInGuest();

            System.out.println("System Execution: Successful ✅");

        } catch (Exception e) {
            System.out.println("Defensive Error caught: " + e.getMessage());
        }
    }
}