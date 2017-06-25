# Created by thivyalakshimi at 25/06/17

Feature: Update client details
  This test verifies user is able to search and edit client details

  @sanity
  Scenario: Verify user is able to search and edit client details
    Given I login to application
    When I search for a client
    Then I am able to view client details
    And I am able to update client details
    Then I logout of application