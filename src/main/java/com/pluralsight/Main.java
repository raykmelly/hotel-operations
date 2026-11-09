package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // Create test rooms
        Room room1 = new Room(1,75.0,false,false);
        Room room2 = new Room(2,150.0,false,true);

        // Display room information
        System.out.printf(
                        "[Room #1]" +
                        "%n-> Availability status: %b",
                room1.isAvailable());

        System.out.printf(
                "[Room #2]" +
                        "%n-> Availability status: %b",
                room1.isAvailable());

        // Create new test reservations
        Reservation reservation1 = new Reservation("King",3,false);
        Reservation reservation2 = new Reservation("Double",2,true);

        // Display reservation information
        System.out.printf(
                        "[Reservation #1]" +
                        "%n-> Price: $%s per night" +
                        "%n-> Reservation Total: $%.2f%n",
                reservation1.getPrice(),reservation1.getReservationTotal());

        System.out.printf(
                "[Reservation #2]" +
                        "%n-> Price: $%s per night" +
                        "%n-> Reservation Total: $%.2f%n",
                reservation2.getPrice(),reservation2.getReservationTotal());


    }
}