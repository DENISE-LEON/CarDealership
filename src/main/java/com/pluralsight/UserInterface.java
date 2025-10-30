package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;
import com.pluralsight.Dealership.*;
import com.pluralsight.Vehicle.*;

public class UserInterface {




    //methods
    public void addVehicleProcess(Scanner scanner ) {
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


    }
}
