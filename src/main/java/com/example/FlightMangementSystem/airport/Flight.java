package com.example.FlightMangementSystem.airport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

//Flight class containing field as id, list of passengers and type of flight ie flightType.
//The Logic is embedded with addPassenger() and removePassenger() methods.

@Data
//@NoArgsConstructor
//@AllArgsConstructor
public abstract class Flight {

    private String id;
    public List<Passenger> passengerList = new ArrayList<Passenger>();

    public Flight(String id) {

    }
    //private  String flightType;

//    public Flight(String id ) {
//        this.id = id;
//        //this.flightType = flightType;
//
//    }
//    public String getId(){
//        return  id;
//    }
//
//    public boolean addPassenger(Passenger passenger) {
//        if (this.flightType.equals("Business")) {
//            if (!passenger.isVip()) {
//                return false;
//            }
//        }
//        passengerList.add(passenger);
//        return true;
//    }

//    public List<Passenger> getPassengerList() {
//        return passengerList;
//    }

//    public boolean addPassenger(Passenger passenger) {
//        if (this.flightType.equals("Business")) {
//            if (!passenger.isVip()) {
//                return false;
//            }
//        }

    public abstract boolean addPassenger(Passenger passenger);
//        switch (flightType){
//            case "Economy":
//                return passengerList.add(passenger);
//
//            case "Business":
//                if(passenger.isVip()) {
//                    return passengerList.add(passenger);
//                }
//                return false;
//            default:
//                throw new RuntimeException("Unknown type:" + flightType);
//        }
//
//    }

    public  abstract  boolean removePassenger(Passenger passenger);
//    {
//        if (passenger == null) {
//            return false;
//        }
//        switch (flightType){
//            case "Economy":
//                if(!passenger.isVip()){
//                    return passengerList.remove(passenger);
//                }
//                return  false;
//            case "Business":
//                return  false;
//            default:
//                throw  new RuntimeException("Unknown type:" + flightType);
//        }
//    }
}
