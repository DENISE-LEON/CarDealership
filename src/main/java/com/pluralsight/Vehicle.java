package com.pluralsight;

public class Vehicle {
    private String vinNum;
    private int year;
    private String make;
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

    public String getMake() {
        return make;
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

    public void setMake(String make) {
        this.make = make;
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

    public Vehicle(String vinNum, int year, String make, String model, String type, String color, int odometer, double price) {
        this.vinNum = vinNum;
        this.year = year;
        this.make = make;
        this.model = model;
        this.type = type;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }

    //toString so when display vehicles it no display gibberish
   @Override
public String toString() {
    return String.format(
        "%-6s  %-4d  %-12s  %-12s  %-8s  %-7s  %,8d  $%,8.2f",
        vinNum,
        year,
        make,
        model,
        type,
        color,
        odometer,
        price
    );
}

}
