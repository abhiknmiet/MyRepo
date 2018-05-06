Feature:
  As a user
  I want to be able to create a new task stylesheet
  So that i can use it with the data

  @tss
  Scenario: End to End Scenario
    Given the user launches Task Style Sheet
    When user provides login credentials 
    And user changes id as tjarddcs3
    And user relaunch the Task Style Sheet URL
    And user on Genral tab and select fleets
    And user Navigates to Stylesheet
    And user upload and select a new stylesheet 
    And user Navigates to Page Configuration
    And user add watermark as dummy page format and manifist details as test
    And user navigate to Logo
    And user navigate to header
    And user navigate to cover Header 
    And user navigate to repeated Header 
    And user navigate to footer
    And user navigate to cover Tables
    And user navigate to body Configuration
    And user selects feedback
    And user navigate to static statement 
    And user click on preview to generate a pdf preview
    Then pdf should be generated with user made changes
    
   