package com.pluralsight;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dealership {

    private  String name;
    private  String address;
    private  String phoneNum;
    private ArrayList<Vehicle> inventory;
    private Vehicle vehicle;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    //no setters since the properties are all final

    //constructor

    public Dealership(String name, String address, String phoneNum) {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.inventory = new ArrayList<Vehicle>();
    }


    //methods


    public List<Vehicle> getVehicleByPrice(double min, double max) {
        return null;
    }

    //add and remove vehicle methods go here!!!

    public ArrayList<Vehicle> getAllVehicles() {
        return this.inventory;
    }

    public  void addVehicle(Vehicle vehicle) {
        //adding car to arraylist
        this.inventory.add(vehicle);

    }


    //returns bool for comfirmation to the user
    public boolean removeVehicle(String rVinNum) {
        //false if input is empty
       if (rVinNum == null || rVinNum.trim().isEmpty()) {
           return false; }
       //removes vehicle using collections remove ig=f method
        return inventory.removeIf(v -> v.getVinNum().equalsIgnoreCase(rVinNum));
    }




    //pretty formatting
    @Override
public String toString() {
    return String.format(
        "%n════════════════════════════════════════%n" +
        "🏢  DEALERSHIP INFORMATION%n" +
        "────────────────────────────────────────%n" +
        "Name            : %s%n" +
        "Address         : %s%n" +
        "Phone           : %s%n" +
        "════════════════════════════════════════%n",
        name,
        address,
        phoneNum
    );
}
}

    //dealership is a blueprint whos only job is to add and remove inventory and hold vehicles