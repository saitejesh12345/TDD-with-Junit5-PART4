package com.example.FlightMangementSystem.airport;

//we have two types of flights and two types of passengers
//having 8 scenarios
//8th test case To remove a usual passenger from a business flight we should
//not expect him to be there adding into business flight not allowed according to policy


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Removing a VIP passenger from an economy flight expecting to be not allowed.

//for below test cases the code coverage is 70 percentage now we are
// In test also we are making changes that we are segregating the intial tests into four different ones

//public class AirportTest {
//    @Test
//    public void testAirport(){
//        Flight economyFlight = new EconomyFlight("1");
//        Flight businessFlight = new BusinessFlight("2");
//
//        Passenger john =new Passenger("John" , true);
//        Passenger mike = new Passenger("Mike",false);
//
//        assertEquals(true,economyFlight.addPassenger(john));
//        assertEquals(false,economyFlight.removePassenger(john));
//        assertEquals(true,businessFlight.addPassenger(john));
//        assertEquals(false,businessFlight.removePassenger(john));
//
////2nd test case trying to remove VIP passenger from Economy flight is not company policy
//        assertEquals(true,economyFlight.addPassenger(mike));
//        assertEquals(true,economyFlight.removePassenger(mike));
//        assertEquals(false,businessFlight.addPassenger(mike));
//        assertEquals(false,businessFlight.removePassenger(mike));
//    }
//
//}
//..........................................................................................................................
public class AirportTest {

    @Test
    public void testEconomyFlightUsualPassenger(){
        Flight economyFlight = new EconomyFlight("1");
        Passenger mike = new Passenger("Mike",false);


        assertEquals(true,economyFlight.addPassenger(mike));
       // assertEquals("1", economyFlight.getId());
        assertEquals(1,economyFlight.getPassengerList().size());
        assertEquals("Mike",economyFlight.getPassengerList().get(0).getName());

        assertEquals(true,economyFlight.removePassenger(mike));
        assertEquals(0,economyFlight.getPassengerList().size());

    }

    @Test
    public void testEconomyFlightVipPassenger(){
        Flight economyFlight = new EconomyFlight("1");
        Passenger john = new Passenger("John",true);

        //assertEquals("1", economyFlight.getId());
        assertEquals(true,economyFlight.addPassenger(john));
        assertEquals(1,economyFlight.getPassengerList().size());
        assertEquals("John",economyFlight.getPassengerList().get(0).getName());

        assertEquals(false,economyFlight.removePassenger(john));
        assertEquals(1,economyFlight.getPassengerList().size());

    }

    @Test
    public void testBusinessFlightUsualPassenger(){
        Flight businessFlight = new BusinessFlight("2");
        Passenger mike= new Passenger("Mike",false);


        assertEquals(false,businessFlight.addPassenger(mike));
        assertEquals(0,businessFlight.getPassengerList().size());

        assertEquals(false,businessFlight.removePassenger(mike));
        assertEquals(0,businessFlight.getPassengerList().size());

    }

    @Test
    public void testBusinessFlightVipPassenger(){
        Flight businessFlight = new BusinessFlight("2");
        Passenger john= new Passenger("John",true);


        assertEquals(true,businessFlight.addPassenger(john));
        assertEquals(1,businessFlight.getPassengerList().size());

        assertEquals(false,businessFlight.removePassenger(john));
        assertEquals(1,businessFlight.getPassengerList().size());

    }
}