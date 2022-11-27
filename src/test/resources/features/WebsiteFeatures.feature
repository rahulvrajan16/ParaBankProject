Feature: Website UI functionalities
  @Smoke
Scenario: Testing About Us features
  Given The website is loaded
    When Navigate to the given URL
    Then I select About Us
    Then I select Services
    Then I select Products
    Then I will close the browsers