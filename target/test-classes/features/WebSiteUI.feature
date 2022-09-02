Feature: Navigate to ParaBank Website and verify the menus are available
@Smoke
Scenario: Validate the ParaBank website is displaying
  Given The website is loaded
  When Navigate to the given URL
  Then Display ParaBank website
  Then verify the Caption is correct
  Then I will close the browsers

@Smoke
  Scenario: Validate sub-menus from the UI
    Given The website is loaded
    When Navigate to the given URL
    Then verify the Left Menus are displayed
    Then I check if the ATM services menus are available
    Then I check if the Online service menus are available
    Then I check if the footer panel menus are available
    Then I verify the Latest News menu's are displayed
    Then I will close the browsers




