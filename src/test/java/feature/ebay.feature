Feature: Purchase Product

  @FeatureId-E-0000
  @mobile
  Scenario: Purchase a product as  logged in Customer
    Given User is on eBay landing page
    When User tap on Sign In button
    And User enters user name as "admin" and password as "admin12"
    And user selects Sign In button to navigate on home page
    And user search product to purchase from search text box as "Redmi 5a"
    And user select searched product
    And user tap on Buy it now button
    And user tap on Review option
    And user tap on proceed to pay option
    Then user should get payment option page
