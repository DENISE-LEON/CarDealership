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

    public void getAllVehicles(ArrayList<Vehicle> vehicles) {

        //diplay using for loop
        for(Vehicle currentVehicle: vehicles) {
            System.out.println(currentVehicle);
        }
    }

    public  void addVehicle(Vehicle vehicle) {
        //adding car to arraylist
        this.inventory.add(vehicle);

    }



    public void removeVehicle(String rVinNum, String confirmRemove) {
        if (confirmRemove.equalsIgnoreCase("Y")) {
            //process returns a boolean which is later used to confirm if the process was succesful
            boolean removed = inventory.removeIf(v -> v.getVinNum().equalsIgnoreCase(rVinNum));

            if (removed) {
                System.out.println("Car has successfully been removed. Bye bye vroom vroom ");
            } else {
                System.out.printf("Vehicle with %s VIN number not found", rVinNum);
            }
        } else {
            System.out.println("Removal cancelled");
        }

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