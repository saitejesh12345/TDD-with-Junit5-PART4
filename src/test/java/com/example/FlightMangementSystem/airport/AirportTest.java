package com.example.FlightMangementSystem.airport;

//we have two types of flights and two types of passengers
//having 8 scenarios
//8th test case To remove a usual passenger from a business flight we should
//not expect him to be there adding into business flight not allowed according to policy


import com.example.FlightMangementSystem.PremiumFlight;
import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

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


    @DisplayName("Given there is EconomyFlight")
    @Nested
    class EconomyFlightTest {
        private Flight economyFlight;
        private Passenger mike;
        private Passenger john;


        @BeforeEach
        void setup() {
            economyFlight = new EconomyFlight("1");
            mike = new Passenger("Mike", false);
            john = new Passenger("John", true);
        }


        @DisplayName("when we have a usual passanger")
        @Nested
        class UsualPassenger {
            @Test
            @DisplayName("Then you can add and remove him from economyFlight")
            public void testEconomyFlightUsualPassenger() {
                //Flight economyFlight = new EconomyFlight("1");
               //  Verify all conditions for a usual Passenger and economy flight",
                        // Passenger mike = new Passenger("Mike", false);


                     //   assertEquals(true, economyFlight.addPassenger(mike));
                        // assertEquals("1", economyFlight.getId());
                           assertEquals(true, economyFlight.addPassenger(mike));
                          assertEquals(1, economyFlight.getPassengersSet().size());
                         assertTrue(economyFlight.getPassengersSet().contains(mike));
                         assertEquals(true, economyFlight.removePassenger(mike));
                         assertEquals(0, economyFlight.getPassengersSet().size());

            }

            @DisplayName("Then you cannot add him to an economy flight more than once")
            @RepeatedTest(5)
            public void testEconomyFlightUsualPassengerAddedOnlyOnce(RepetitionInfo repetitionInfo){
                for(int i =0;i<repetitionInfo.getCurrentRepetition();i++){
                    economyFlight.addPassenger(mike);
                }
                //verify usual passenger can be added to an economy flight only once"
                 assertEquals(1,economyFlight.getPassengersSet().size());
                assertTrue(economyFlight.getPassengersSet().contains(mike));
                assertTrue(new ArrayList<>(economyFlight.getPassengersSet()).get(0).getName().equals("Mike"));
            }
        }


        @Nested
        @DisplayName("When we hav a VIP passenger")
        class VipPassenger {

            @Test
            @DisplayName("Then you can add him and remove him from an VIP flight")
            public void testEconomyFlightVipPassenger() {
//        Flight economyFlight = new EconomyFlight("1");
                //  Passenger john = new Passenger("John", true);
                // Verify all conditions for a VIP Passenger and economy flight",

                       // assertEquals("1", economyFlight.getId());
                          assertEquals(true, economyFlight.addPassenger(john));
                         assertEquals(1, economyFlight.getPassengersSet().size());
                      //  assertEquals("John", economyFlight.getPassengersSet().get(0).getName());
                          assertTrue(economyFlight.getPassengersSet().contains(john));
                         assertEquals(false, economyFlight.removePassenger(john));
                         assertEquals(1, economyFlight.getPassengersSet().size());

            }
        }
    }

    @DisplayName("Given there is BusinessFlight")
    @Nested
    class BusinessFlightTest {
        private Flight businessFlight;
        private Passenger mike;
        private Passenger john;

        @BeforeEach
        void setup() {
            businessFlight = new BusinessFlight("2");
            mike = new Passenger("Mike", false);
            john = new Passenger("John", true);

        }

        @DisplayName("when we have a usual passanger")
        @Nested
        class UsualPassenger {

            @DisplayName("Then you can not add or remove him from BusinessFlight")
            @Test
            public void testBusinessFlightUsualPassenger() {
                //   Flight businessFlight = new BusinessFlight("2");
                //      Passenger mike = new Passenger("Mike", false);

                // "Verify all conditions for a  Usual Passenger and Business flight",

                assertEquals(false, businessFlight.addPassenger(mike));
                assertEquals(0, businessFlight.getPassengersSet().size());

                assertEquals(false, businessFlight.removePassenger(mike));
                assertEquals(0, businessFlight.getPassengersSet().size());

                //   );
            }
        }

        @Nested
        @DisplayName("When we hav a VIP passenger")
        class VipPassenger {

            @DisplayName("Then you can add him and remove him from an business flight")
            @Test
            public void testBusinessFlightVipPassenger() {
                //    Flight businessFlight = new BusinessFlight("2");
                //    Passenger john = new Passenger("John", true);
                // Verify all conditions for a VIP Passenger and economy flight",

                assertEquals(true, businessFlight.addPassenger(john));
                assertEquals(1, businessFlight.getPassengersSet().size());

                assertEquals(false, businessFlight.removePassenger(john));
                assertEquals(1, businessFlight.getPassengersSet().size());

                //  );
            }
        }

            @DisplayName("Then you  cannot add him to an business flight more than once")
            @RepeatedTest(5)
            public void testBusinessFlightVipPassengerAddedOnlyOnce(RepetitionInfo repetitionInfo) {
                for (int i = 0; i < repetitionInfo.getCurrentRepetition(); i++) {
                    businessFlight.addPassenger(john);
                }
                //verify usual passenger can be added to an business flight only once"
                assertEquals(1, businessFlight.getPassengersSet().size());
                assertTrue(businessFlight.getPassengersSet().contains(john));
                assertTrue(new ArrayList<>(businessFlight.getPassengersSet()).get(0).getName().equals("John"));
            }

    }
    @DisplayName("Given there is premium flight")
    @Nested
    class PremiumFlightTest {
        private Flight premiumFlight;
        private Passenger mike;
        private Passenger john;

        @BeforeEach
        void setUp() {
            premiumFlight = new PremiumFlight("3");
            mike = new Passenger("Mike", false);
            john = new Passenger("John", true);
        }

        @Nested
        @DisplayName("when we have a usual passenger")
        class UsualPassenger {
            @Test
            @DisplayName("Then you cannot add or remove him from a preimum flight")
            public void testPremiumFLightUsualPassenger() {
                //verify all conditions for usual passenger and  a premium flight
                assertEquals(false, premiumFlight.addPassenger(mike));
                assertEquals(0, premiumFlight.getPassengersSet().size());
                assertEquals(false, premiumFlight.removePassenger(mike));
                assertEquals(0, premiumFlight.getPassengersSet().size());
            }
        }


        @Nested
        @DisplayName("when we have VIP passenger")
        class VipPassenger {

            //@Disabled
            // we add disabled only on VIP passenger of inner class to avoid failed test case the one is failing
            @Test
            @DisplayName("Then you  add or remove him from a premium flight")
            public void testPremiumFLightVipPassenger() {
                //verify all conditions for usual passenger and  a premium flight
                assertEquals(true, premiumFlight.addPassenger(john));
                assertEquals(1, premiumFlight.getPassengersSet().size());
                assertEquals(true, premiumFlight.removePassenger(john));
                assertEquals(0, premiumFlight.getPassengersSet().size());
            }


        }

        @DisplayName("Then you cannot add him to an premium flight more than once")
        @RepeatedTest(5)
        public void testPremiumFlightVipPassengerAddedOnlyOnce(RepetitionInfo repetitionInfo) {
            for (int i = 0; i < repetitionInfo.getCurrentRepetition(); i++) {
                premiumFlight.addPassenger(john);
            }
           // assertAll("Verify a VIP passenger can be added to premium flight only once",
                  assertEquals(1, premiumFlight.getPassengersSet().size());
                    assertTrue(premiumFlight.getPassengersSet().contains(john));
                      assertTrue(new ArrayList<>(premiumFlight.getPassengersSet()).get(0).getName().equals("John"));

        }

    }
}