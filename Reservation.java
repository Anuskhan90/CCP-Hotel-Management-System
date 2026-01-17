package com;
import java.util.Date;

public class Reservation {
    private Date reservationDate; // UML Attribute
    private Date startDate;
    private Date endDate;
    private int number; // Reservation Number

    public Reservation(int number, Date start, Date end) {
        // Defensive: Dates validation
        if (start == null || end == null) throw new IllegalArgumentException("Start and End dates cannot be null.");
        if (end.before(start)) throw new IllegalArgumentException("End date cannot be before Start date."); // Illegal state prevention
        
        this.number = number;
        this.reservationDate = new Date(); // Current date
        this.startDate = start;
        this.endDate = end;
    }

    // UML Operation
    public void create() { 
        System.out.println("Reservation #" + number + " has been created successfully."); 
    }
}