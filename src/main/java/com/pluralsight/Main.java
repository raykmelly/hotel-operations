package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // Create test rooms
        Room room1 = new Room(1,75.0,false,false);
        Room room2 = new Room(2,150.0,false,true);

        // Check out and clean certain rooms
        room1.checkIn();
        room1.checkOut();
        room2.cleanRoom();

        // Display room information
        System.out.printf(
                        "[Room #1]" +
                        "%n\t-> Availability status: %b%n",
                room1.isAvailable());

        System.out.printf(
                "[Room #2]" +
                        "%n\t-> Availability status: %b%n",
                room2.isAvailable());

        System.out.println();

        // Create new test reservations
        Reservation reservation1 = new Reservation("King",3,false);
        Reservation reservation2 = new Reservation("Double",2,true);

        // Display reservation information
        System.out.printf(
                        "[Reservation #1]" +
                        "%n\t-> Price: $%s per night" +
                        "%n\t-> Reservation Total: $%.2f%n",
                reservation1.getPrice(),reservation1.getReservationTotal());

        System.out.printf(
                "[Reservation #2]" +
                        "%n\t-> Price: $%s per night" +
                        "%n\t-> Reservation Total: $%.2f%n",
                reservation2.getPrice(),reservation2.getReservationTotal());

        System.out.println();

        // Create test employees
        Employee employee1 = new Employee(0,"John","IT",28.50,20);
        Employee employee2 = new Employee(0,"Joe","Finance",32,40);

        // Employees punching in an out
        employee1.punchIn(9);
        int shift1 = employee1.punchOut(17);

        employee2.punchIn(5);
        int shift2 = employee2.punchOut(16);

        // Display employee information
        System.out.printf(
                "[Employee #1]" +
                        "%n\t-> Total pay: %.2f" +
                        "%n\t-> Regular hours: %.2f" +
                        "%n\t-> Overtime hours: %.2f" +
                        "%n\t-> Worked %d hours today%n",
                employee1.getTotalPay(),employee1.getRegularHours(),employee1.getOvertimeHours(),shift1);

        System.out.printf(
                "[Employee #2]" +
                        "%n\t-> Total pay: %.2f" +
                        "%n\t-> Regular hours: %.2f" +
                        "%n\t-> Overtime hours: %.2f" +
                        "%n\t-> Worked %d hours today%n",
                employee2.getTotalPay(),employee2.getRegularHours(),employee2.getOvertimeHours(),shift2);
    }
}