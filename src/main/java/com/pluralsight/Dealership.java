package com.pluralsight;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Scanner;

public class Dealership {
    ArrayList<Vehicle> vroomVroom = new ArrayList<>();

    private final String name = "We Sell Vroom Vroom's";
    private final String address = "99-58 PPAP street, NY 18920";
    private final String phoneNum = "999-555-1222";

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

    public Dealership() {


    }

    //methods

    //add and remove vehicle methods go here!!!
    public void addVehicle(Scanner scanner) {
        //adding car pseudo
        System.out.println("Enter vehicle details");
        System.out.println("Enter VIN number");
        String vinNum = scanner.nextLine();

        System.out.println("Enter year");
        int year = scanner.nextInt();

        System.out.println("Enter car model");
        String model = scanner.nextLine();

        System.out.println("Enter car type");
        String type = scanner.nextLine();

        System.out.println("Enter car color");
        String color = scanner.nextLine();

        System.out.println("Enter odometer");
        int odometer = scanner.nextInt();

        System.out.println("Enter price");
        double price = scanner.nextDouble();

        Vehicle newVroomVroom = new Vehicle(vinNum, year, model, type, color, odometer, price);
        vroomVroom.add(newVroomVroom);

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
            boolean removed = vroomVroom.removeIf(v -> v.getVinNum().equalsIgnoreCase(rVinNum));

            if (removed) {
                System.out.println("Car has successfully been removed. Bye bye vroom vroom ");
            } else {
                System.out.printf("Vehicle with %s VIN number not found", rVinNum);
            }

        } else {
            System.out.println("Removal cancelled");
        }

    }


}

