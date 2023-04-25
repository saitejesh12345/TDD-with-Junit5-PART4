  **Ultimate aim is to Improve Code Coverage Report and To move from Non-TDD Application to TDD application.**

WHAT WE ARE GOING TO LEARN:-

1. In order to implement new feature in your application .First thing we need to do is read the document and write unit test cases for Old code.
2. Secondly then Start implementing new feature. Implement testing for new feature
3. We are Going to see Code Coverage Report using JACOCO TOOl .In order to write and pass the quality metric for our testing.

**What is JACOCO Tool?How it will be used?**
To measure the number of lines of our code are executed during the Automated tests. Suppose Assume i wrote a method with 50 lines and i write a test case for it.
So from 50 lines of code how many lines has been covered with my test case that is code Covergae.

**NOTE: Average code coverage percentage is 80% required for any IT-projects**

**...................................................................................................................................................................**
Project Title:-**Flight Management Application**
**Project Description:-**

1.**Flight class** containing field as id, list of passengers and type of flight ie flightType.
The Logic is embedded with addPassenger() and removePassenger() methods.

2.**Passenger class** containing as fields the name and indication. if he is VIP or NOT.

3.**Airport class** contains main methods and serves mainly for testing purposes.
->we assume we have two passengers john is Business one ,mike is usual one economy one.
->Firstly john added to business flight then someone tries to remove him.As **company policy says VIP passengers can not be removed**.
->Someone tries to add to mike both to the business flight andto economy one,According to company policy only second operation need to
be succeed.


**...................................................................................................................................................................**

**CODE COVERAGE REPORT GENERATED BELOW**
Airport - 0%
Flight Class - 64%
Passenger Class - 60%

![image](https://user-images.githubusercontent.com/108732167/234214792-8a471290-b6ec-4bae-b369-1479012aac49.png)


We need to increase it to  above **80 % **

**PART2** for this increased code coverage Report link given **https://github.com/saitejesh12345/TDD-with-Junit5-PART2**
