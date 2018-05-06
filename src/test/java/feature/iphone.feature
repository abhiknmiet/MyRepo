Feature:
  As a user
  I want to be able to remove 5 records and then click on the Done  button

  @11mobile
  Scenario: End to End Scenario
    Given user launches the app
    When user add records
    And user removes records
    Then user can click on Done button 