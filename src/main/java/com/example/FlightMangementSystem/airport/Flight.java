package com.example.FlightMangementSystem.airport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

//Flight class containing field as id, list of passengers and type of flight ie flightType.
//The Logic is embedded with addPassenger() and removePassenger() methods.

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flight {

    private String id;
    private List<Passenger> passengerList = new ArrayList<Passenger>();
    private  String flightType;

    public Flight(String id, String flightType) {
        this.id = id;
        this.flightType = flightType;
        this.passengerList = new ArrayList<>();
    }
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

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public boolean addPassenger(Passenger passenger) {
        if (this.flightType.equals("Business")) {
            if (!passenger.isVip()) {
                return false;
            }
        }

        switch (flightType){
            case "Economy":
                return passengerList.add(passenger);

            case "Business":
                if(passenger.isVip()) {
                    return passengerList.add(passenger);
                }
                return false;
            default:
                throw new RuntimeException("Unknown type:" + flightType);
        }

    }

    public boolean removePassenger(Passenger passenger) {
        if (passenger == null) {
            return false;
        }
        switch (flightType){
            case "Economy":
                if(!passenger.isVip()){
                    return passengerList.remove(passenger);
                }
                return  false;
            case "Business":
                return  false;
            default:
                throw  new RuntimeException("Unknown type:" + flightType);
        }
    }
}
