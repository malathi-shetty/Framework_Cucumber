Feature: Daily Time Table

  Scenario: Morning and Evening TimeTable
    Given I go to office in the morning
    Given I take morning calls with the clients
    Given I go to temple in the morning
    Given I go to market in the evening
    
  
   Scenario: Morning and Evening TimeTable Schedule
    Given I perform the following morning activities:
      | activity                   |
      | go to office              |
      | take morning calls with clients |
      | go to temple              |
    Given I go to walk in the evening