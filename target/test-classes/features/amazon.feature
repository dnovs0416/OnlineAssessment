Feature: This feature is going to navigate to amazon and sort and select the second highest television

  Scenario: Navigating through amazon
    When user opens browser and navigates to amazon and user clicks on All menu and clicks TV, Appliances, Electronics
    Then user clicks on Television under Tv, Audio, & Cameras
    And user filters the results by Brand Samsung and sorts results with price High to Low
    Then user clicks on second highest priced item
    And user switches to the new window
    Then user will verify About this item is present