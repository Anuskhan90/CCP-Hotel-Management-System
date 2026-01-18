package com;
import java.util.Date;

public class HotelTest {
    public static void main(String[] args) {
        System.out.println("--- Starting AAA Unit Tests ---");
        testInvalidDateReservation();
        testValidRoomCreation();
        System.out.println("--- All Tests Completed ---");
    }

    public static void testInvalidDateReservation() {
        // 1. ARRANGE (Setup data)
        Date start = new Date();
        Date invalidEnd = new Date(start.getTime() - 1000000); // Past date

        // 2. ACT & 3. ASSERT (Run and Verify)
        try {
            new Reservation(101, start, invalidEnd);
            System.out.println("Test Date Validation: FAILED ❌");
        } catch (IllegalArgumentException e) {
            System.out.println("Test Date Validation: PASSED ✅ (Caught: " + e.getMessage() + ")");
        }
    }

    public static void testValidRoomCreation() {
        // ARRANGE
        RoomType type = new RoomType("Standard", 5000);
        // ACT
        Room room = new Room(101, type);
        // ASSERT
        if (room.getNumber() == 101) {
            System.out.println("Test Room Creation: PASSED ✅");
        }
    }
}