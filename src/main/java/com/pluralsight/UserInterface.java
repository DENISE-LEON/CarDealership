package com.pluralsight;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.pluralsight.Dealership.*;
import com.pluralsight.Vehicle.*;

public class UserInterface {
    public static Scanner scanner = new Scanner(System.in);
    private DealershipFileManager manager;
    private Dealership dealership = manager.getDealershipInfo();
    private Vehicle vehicle;



    public void displayMenu() {
        boolean run = true;
        objectInstantiator();

        do {
            //menu display
            //create the options
            System.out.println("""
                    === Welcome to the car dealership, choose an option below ===
                    
                    1 - Find vehicles within a price range
                    2 - Find vehicles by make / model
                    3 - Find vehicles by year range
                    4 - Find vehicles by color
                    5 - Find vehicles by mileage range
                    6 - Find vehicles by type (car, truck, SUV, van)
                    7 - List ALL vehicles
                    8 - Add a vehicle
                    9 - Remove a vehicle
                    99 - Quit
                    
                    """);
            int menuChoice = 0;
            try {
                menuChoice = Math.abs(scanner.nextInt());
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number from the choices provided!");
                scanner.nextLine();
            }

            switch (menuChoice) {
                case 1:
                    this.displayByPriceProcess();
                    break;
                case 2:
                    this.displayByMakeModel();
                    break;
                case 3:
                    this.displayByYearProcess();
                    break;
                case 4:
                    this.displayByColorProcess();
                    break;
                case 5:
                    this.displayByMilageProcess();
                    break;
                case 6:
                    this.displayByTypeProcess();
                    break;
                case 7:
                    this.displayAllVehiclesProcess();
                    break;
                case 8:
                    this.addVehicleProcess();
                    break;
                case 9:
                    this.removeVehicleProcess();
                    break;
                case 99:
                    System.out.print("Exiting program ");

                    try {
                        Thread.sleep(1000);
                        System.out.print(".");
                        Thread.sleep(1000);
                        System.out.print(".");
                        Thread.sleep(1000);
                        System.out.print(".");
                        Thread.sleep(1000);
                        System.out.print(".");
                        Thread.sleep(1000);
                        System.out.print(".");
                    } catch (InterruptedException e) {
                        System.out.println("uh oh. Error");
                    }

                    run = false;
            }


        } while (run);

    }

    public void displayByPriceProcess() {

    }

    public void displayByMakeModel() {

    }

    public void displayByYearProcess() {

    }

    public void displayByColorProcess() {

    }


    public void displayByMilageProcess() {

    }

    public void displayByTypeProcess() {

    }

    public void displayAllVehiclesProcess() {
        dealership.getAllVehicles();
    }


    //methods
    //user input goes in user interfaace
    public void addVehicleProcess() {
        System.out.println("Enter vehicle details");
        System.out.println("Enter VIN number");
        String vinNum = scanner.nextLine();

        System.out.println("Enter year");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter make");
        String make = scanner.nextLine();
        scanner.nextLine();

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
        scanner.nextLine();

        //need to create the new object to pass into the add vehicle parameter
        Vehicle vehicle = new Vehicle(vinNum, year, make, model, type, color, odometer, price);
        //calling add vehicle method from dealership class
        dealership.addVehicle(vehicle);
        manager.vehicleRecorder(vehicle);
    }

    //returns for comfirmation to the user
    public void removeVehicleProcess() {
        //run bool in case create loop
        boolean run = true;
        do {
            System.out.println("Enter the VIN number of the car you'd like to remove");
            String rVinNum = scanner.nextLine().trim();

            //for fancies
            System.out.println("Are you sure you want to remove this vehicle?(Y/N)");
            String confirmRemove = scanner.nextLine();

            boolean removed = dealership.removeVehicle(rVinNum);

            if (confirmRemove.equalsIgnoreCase("Y")) {
                //using a terniary instead of if
                //since terniary's return or assign values must wrap the terniary in a sout
                System.out.printf(removed ? "Car has been successfully removed. Bye bye vroom vroom" : "Vehicle with %s VIN number not found", rVinNum);

//            if (removed) {
//                System.out.println("Car has successfully been removed. Bye bye vroom vroom ");
//            } else {
//                System.out.printf("Vehicle with %s VIN number not found", rVinNum);
//            }
            } else {
                System.out.println("Removal cancelled");

            }
            System.out.println("Would you like to remove another vehicle?(Y/N)");
            String removeAnother = scanner.nextLine().trim();
            run = removeAnother.equalsIgnoreCase("Y") ? true : false;
        } while (run);

    }


        private void objectInstantiator () {
            DealershipFileManager vroomManager = new DealershipFileManager("src/main/resources/VroomInventory.csv");
            vroomManager.getDealershipInfo();

            //DealershipFileManager kartManager = new DealershipFileManager("src/main/resources/VroomKartInventory.csv");
            //kartManager.getDealershipInfo();
        }
    }


