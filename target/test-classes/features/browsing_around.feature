Feature: Browsing around

  @smokeTest
  Scenario: Login and Vets
    Given I have opened the browser
    And I am on the home page
    When I open veterinarians page
    Then I search for text "Veterinarians"

  @smokeTest
  Scenario: Login and check owner based on last name
    Given I have opened the browser
    And I am on the home page
    When I search owner "Franklin"
    Then I get owner "Franklin" Informations
