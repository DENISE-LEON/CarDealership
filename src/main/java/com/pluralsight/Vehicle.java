package com.pluralsight;

public class Vehicle {
    private String vinNum;
    private int year;
    private String model;
    private String type;
    private String color;
    private int odometer;
    private double price;


    //getters

    public String getVinNum() {
        return vinNum;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getOdometer() {
        return odometer;
    }

    public double getPrice() {
        return price;
    }

    //setter


    public void setVinNum(String vinNum) {
        this.vinNum = vinNum;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //constructors

    public Vehicle(String vinNum, int year, String model, String type, String color, int odometer, double price) {
        this.vinNum = vinNum;
        this.year = year;
        this.model = model;
        this.type = type;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }

    //tostring so when display vehicles it no display gibberish
    @Override
    public String toString() {
        //nums adjust output either to the left(-) or right
        return String.format(
                "%-10s | %-4d | %-10s | %-10s | %-8s | %8d mi | $%,10.2f",
        vinNum, year, model, type, color, odometer, price
        );
    }
}
