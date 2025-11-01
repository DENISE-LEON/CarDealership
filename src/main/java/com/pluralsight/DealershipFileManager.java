package com.pluralsight;

import java.io.*;

public  class DealershipFileManager {
    private String filePath;
    private Dealership newDealership;
    private Vehicle newVehicle;

    public DealershipFileManager(String filePath) {
        this.filePath = filePath;
       // this.newDealership = newDealership;
    }
    //create splitter method
    //public String[] lineSplitter()

    public Dealership getDealershipInfo(){

        try(BufferedReader breader = new BufferedReader(new FileReader(filePath))) {

            String dealershipInfo = breader.readLine();

            String[] infoSplitter = dealershipInfo.split("\\|");

            newDealership = new Dealership(infoSplitter[0], infoSplitter[1], infoSplitter[2]);


            String vehicleLine;
            while( (vehicleLine = breader.readLine()) != null){

            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found ");

        } catch (IOException e) {
            System.out.println("ERROR");
        }
        return newDealership;

    }




    //writer: writes the info to the csv
    public void vehicleRecorder(Vehicle vehicle) {
        try(PrintWriter pwriter = new PrintWriter(new BufferedWriter(new FileWriter(filePath, true)))) {
            pwriter.println(vehicle.getVinNum() + "|" +
            vehicle.getYear() + "|" +
            vehicle.getMake() + "|" +
            vehicle.getModel() + "|" +
            vehicle.getType() + "|" +
            vehicle.getColor() + "|" +
            vehicle.getOdometer() + "|" +
            vehicle.getPrice());
        }  catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    //method that saves info from csv to arraylist
    //



}
