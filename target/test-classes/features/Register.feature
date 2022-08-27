Feature: Validate SignUp Functionality to ParaBank
  @Regression
  Scenario: Validate SignUp Functionality to ParaBank with one row
    Given Click Register link from HomePage
    When Enter FirstName, LastName, Address, City, State, Zipcode, PhoneNum, SSN, UserName, Password, Confirm
      | Jewel | Mary | Kingston | NJ | NJ | 7890 | 485223 | 212 | 1Jewel2022 | 1Jewel2022 | 1Jewel2022 |
    And Click Register Button
    Then Message "Your account was created successfully. You are now logged in." should be displayed.


