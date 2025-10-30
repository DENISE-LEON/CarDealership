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

    public  void addVehicle(Vehicle vehicle) {
        //adding car pseudo
        this.inventory.add(vehicle);

    }



    public void removeVehicle(Scanner scanner) {

        //run bool in case create loop
        boolean run = true;
        System.out.println("Enter the VIN number of the car you'd like to remove");
        String rVinNum = scanner.nextLine();
        //for fancies
        System.out.println("Are you sure you want to remove this vehicle?(Y/N)");
        String confirmRemove = scanner.nextLine();

        //perhaps add loop to using run bool
        System.out.println("Would you like to remove another vehicle?");


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

    public List<Vehicle> getAllVehicles() {
        return this.inventory;
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