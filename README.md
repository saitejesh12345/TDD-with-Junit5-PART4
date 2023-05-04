# TDD-with-Junit5-PART4
In part3 we have implemented test cases effectively,but we didnt implemented New feature called Premium Flight and all in this PART4 we are going to implement check it out READ ME file and in readme i have mentioned all details point wise.

# To write Nested Preimum flight test Class:-

1.According to Business logic that we shown earlier the Test case for Premium is written  created a PremiumFlight Tes and having usual passenger and VIp passenger ,and
that we setup BeforeEach test. **Create a PremiumFlight class** and extend Flight Class**

3.After writing all test cases we can give @Disable annotation in inner class to avoid the failed test case for a while certain period.

4.Finaly check code coverage as well

5.There will be another case also such that same passenger may added into flight more than once.this kind of situtaions must be avoided.we have to make sure that whenver
we are trying to add a passenger to a flight,if he added previously to the flight then request should be rejected.This is our new business logic and this will
be our new Challenge to implement in TDD-STYLE. Below is condition diagram

![image](https://user-images.githubusercontent.com/108732167/236161310-d7e51c90-3a6a-4684-8e05-8876d7aa53a2.png)

6.we call it testEconomyFlightUsualPassengerAddedOnlyOnce() method we try repeatedly to add the same passenger to the flight we marked the test as repeated test 5 times and we will try each time to add the passenger the number of times that is specified by repetition info.

NOTE:- Disable failing test while we are working on feature.

# Checked Test-Coverage it is more than 80% this kind of writing test cases is Worth writing j-unit


