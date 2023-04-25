package com.example.FlightMangementSystem.airport;

//Passenger class containing as fields the name and indication. if he is VIP or NOT

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passenger {
    private  String name;
    private  boolean vip;
}
