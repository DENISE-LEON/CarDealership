package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public  class DealershipFileManager {
    private String filePath;
    private Dealership newDealership;

    public DealershipFileManager(String filePath) {
        this.filePath = filePath;
       // this.newDealership = newDealership;
    }

    public Dealership getDealership(){

        try(BufferedReader breader = new BufferedReader(new FileReader(filePath))) {

            String dealershipInfo = breader.readLine();

            String[] infoSplitter = dealershipInfo.split("\\|");

            newDealership = new Dealership(infoSplitter[0], infoSplitter[1], infoSplitter[2]);

        } catch (FileNotFoundException e) {
            System.out.println("File not found ");

        } catch (IOException e) {
            System.out.println("ERROR");
        }
        return newDealership;
    }
    public void saveDealership(Dealership dealership) {

    }


}
