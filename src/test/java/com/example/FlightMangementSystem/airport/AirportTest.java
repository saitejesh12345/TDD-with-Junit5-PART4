package com.example.FlightMangementSystem.airport;

//we have two types of flights and two types of passengers
//having 8 scenarios
//8th test case To remove a usual passenger from a business flight we should
//not expect him to be there adding into business flight not allowed according to policy


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Removing a VIP passenger from an economy flight expecting to be not allowed.
public class AirportTest {
    @Test
    public void testAirport(){
        Flight economyFlight = new Flight("1", "Economy");
        Flight businessFlight = new Flight("2", "Business");

        Passenger john =new Passenger("John" , true);
        Passenger mike = new Passenger("Mike",false);

        assertEquals(true,economyFlight.addPassenger(john));
        assertEquals(false,economyFlight.removePassenger(john));
        assertEquals(true,businessFlight.addPassenger(john));
        assertEquals(false,businessFlight.removePassenger(john));

//2nd test case trying to remove VIP passenger from Economy flight is not company policy
        assertEquals(true,economyFlight.addPassenger(mike));
        assertEquals(true,economyFlight.removePassenger(mike));
        assertEquals(false,businessFlight.addPassenger(mike));
        assertEquals(false,businessFlight.removePassenger(mike));
    }

}
