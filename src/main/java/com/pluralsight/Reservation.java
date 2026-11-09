package com.pluralsight;

public class Reservation {
    // Properties
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    // Getters
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    // Derived from the properties "dirty" and "occupied"
    public boolean isAvailable() {
        return !dirty && !occupied;
    }
}
