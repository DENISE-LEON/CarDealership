package com.pluralsight;

import java.util.Scanner;

public class Program {
    public Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        DealershipFileManager vroomManager = new DealershipFileManager("src/main/resources/VroomInventory.csv");
        //Dealership vroomDealership = new Dealership("Lots of Vroom Vroom's", "Vroom city", "1-800-Vroom");
        System.out.println(vroomManager.getDealership());

        //testing if multiple filemanagers/ dealerships work with getDealership meth
        DealershipFileManager kartManager = new DealershipFileManager("src/main/resources/VroomKartInventory.csv");
        System.out.println(kartManager.getDealership());

    }
}
