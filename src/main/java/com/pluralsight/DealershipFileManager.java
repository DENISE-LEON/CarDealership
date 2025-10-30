package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public  class DealershipFileManager {
    private String filePath;

    Dealership vroomVrooms;

    public Dealership getDealership(){

        try(BufferedReader breader = new BufferedReader(new FileReader(filePath))) {

            String dealershipInfo = breader.readLine();

            String[] infoSplitter = dealershipInfo.split("\\|");

            vroomVrooms = new Dealership(infoSplitter[0], infoSplitter[1], infoSplitter[2]);

        } catch (FileNotFoundException e) {
            System.out.println("File not found ");

        } catch (IOException e) {
            System.out.println("ERROR");
        }
        return vroomVrooms;
    }
    public void saveDealership(Dealership dealership) {

    }
}
