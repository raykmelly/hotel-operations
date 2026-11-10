package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private int startTime;

    // Constructor
    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.startTime = 0;
    }

    // Methods
    public void punchIn(int time) {
        this.startTime = time;
    }

    public int punchOut(int time) {
        this.hoursWorked += time - this.startTime;
        return time - this.startTime;
    }

    // Derived getters
    public double getTotalPay() {
        return this.payRate * this.hoursWorked;
    }

    public double getRegularHours() {
        // Return the hours you worked up to 40 hours
        return Math.min(this.hoursWorked,40);
    }

    public double getOvertimeHours() {
        if (this.hoursWorked > 40) {
            // Return overtime hours
            return this.hoursWorked - 40;
        } else {
            // No overtime found, under 40 hours
            return 0;
        }
    }

    // Getters + setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
