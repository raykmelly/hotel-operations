package com.pluralsight;

public class Hotel {
    // Parameters
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    // Constructors
    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    // Methods
    public boolean bookRoom(int roomCount, boolean suite) {
        if (suite) {
            // Booking suite rooms
            return (this.bookedSuites + roomCount) <= this.numberOfSuites;
        } else {
            // Booking basic room
            return (this.bookedBasicRooms + roomCount) <= this.numberOfRooms;
        }
    }

    // Derived getters
    public int getAvailableSuites() {
        return this.numberOfSuites - this.bookedSuites;
    }

    public int getAvailableRooms() {
        return this.numberOfRooms - this.bookedBasicRooms;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }
}
