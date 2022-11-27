Feature: Navigate to ParaBank Website and verify the menus are available


  Background: Open the browser and navigate to the webpage
  Given The website is loaded
  Then Navigate to the given URL

  @Smoke1
 Scenario: Validate the ParaBank website is displaying
  Given Display ParaBank website
  When verify the Caption is correct
    Then I will close the browsers


@Smoke
  Scenario: Validate sub-menus from the UI
    Given verify the Left Menus are displayed
    Then I check if the ATM services menus are available
    Then I check if the Online service menus are available
    Then I check if the footer panel menus are available
#    Then I verify the Latest News menu's are displayed
    Then I will close the browsers




