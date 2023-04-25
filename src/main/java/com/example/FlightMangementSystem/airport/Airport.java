package com.example.FlightMangementSystem.airport;

//Airport class contains main methods and serves mainly for testing purposes.
//we assume we have two passengers john is Business one ,mike
//is usual one economy one.
//Firstly john added to business flight then someone tries to remove him.
//As company policy says VIP passengers can not be removed.

//Someone tries to add to mike both to the business flight and
//to economy one,According to company policy only second operation need to
//be succeed.

import java.util.ArrayList;
import java.util.List;

public class Airport {
//    public static void main(String[] args) {
//
//        Flight economyFlight = new Flight("1","Economy");
//
//        Flight businessFlight = new Flight("2", "Business");
//
//        Passenger john= new Passenger("John",true);
//        Passenger mike = new Passenger("Mike", false);
//
//        businessFlight.addPassenger(john);
//        businessFlight.removePassenger(john);
//        economyFlight.addPassenger(mike);
//        businessFlight.addPassenger(mike);
//
//System.out.println("Business flight passenger List:");
//for(Passenger passenger:businessFlight.getPassengerList()){
//    System.out.println(passenger.getName());
//}
//
//        System.out.println("Economy flight passenger List:");
//        for(Passenger passenger:economyFlight.getPassengerList()){
//            System.out.println(passenger.getName());
//        }
//
//
//    }

    public static void main(String[] args) {



        Flight economyFlight = new Flight("1", "Economy");
        Flight businessFlight = new Flight("2", "Business");

        List<Passenger> passengers = getSamplePassengers();
        try {
            for (Passenger passenger : passengers) {
                if (businessFlight.addPassenger(passenger)) {
                    System.out.println("Added " + passenger.getName() + " to Business flight");
                } else if (economyFlight.addPassenger(passenger)) {
                    System.out.println("Added " + passenger.getName() + " to Economy flight");
                } else {
                    System.out.println("Could not add " + passenger.getName() + " to any flight");
                }
            }
   }
        catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Business flight passenger List:");
        for (Passenger passenger : businessFlight.getPassengerList()) {
            System.out.println(passenger.getName());
        }

        System.out.println("Economy flight passenger List:");
        for (Passenger passenger : economyFlight.getPassengerList()) {
            System.out.println(passenger.getName());
        }
    }

    private static List<Passenger> getSamplePassengers() {
        List<Passenger> passengers = new ArrayList<>();
        passengers.add(new Passenger("John", true));
        passengers.add(new Passenger("Mike", false));
        return passengers;
    }
}
