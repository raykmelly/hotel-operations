package com.pluralsight;

public class Reservation {
    // Properties
    private String roomType;
    private int numberOfNights;
    private boolean weekend;

    // Constructor
    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    // Derived getters + setters
    public double getPrice() {
        // Get the price of the room the customer is renting per night
        if (this.roomType.equalsIgnoreCase("King")) {
            return 139.00;
        } else if (this.roomType.equalsIgnoreCase("Double")) {
            return 124.00;
        } else {
            // Error, specific room type is wrong
            System.out.println("Error: invalid room type detected, default to 0");
            return 0;
        }
    }

    public double getReservationTotal() {
        // Calculate the total price of the hotel say
        double discount = 1;
        if (isWeekend()) {
            // Price per night decrease by 10%
            discount = 10.0/100.0;
        }
        // Number of nights * daily hotel price
        return this.numberOfNights * (getPrice() * discount);
    }

    // Getters + setters
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }
}
