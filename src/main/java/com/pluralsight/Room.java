package com.pluralsight;

public class Room {
    // Properties
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    // Constructor
    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    // Derived from the properties "dirty" and "occupied"
    public boolean isAvailable() {
        return !dirty && !occupied;
    }

    // Methods
    public void checkIn() {
        if (isAvailable()) {
            this.occupied = true;
            this.dirty = true;
        } else {
            System.out.println("Error: the room cannot be checked into");
        }
    }

    public void checkOut() {
        this.occupied = false;
    }

    public void cleanRoom() {
        this.dirty = false;
    }

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
}
