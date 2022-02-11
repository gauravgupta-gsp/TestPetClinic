Feature: Vets can add a new pet owner
 @AddOwnerTest
  Scenario: Add new owner
    Given I have opened the browser
    And I am on Find owners page
    And I Click on Add Owner HyperLink
    When I enter New Owner details "first_name" "last_name" "address" "city" "telephone"
    And I click on Add Owner Button
    Then I should see newly added Pet owner

    #Scenario:
		#Given I have opened the browser
		#When I open Find Owners Page
		#And I enter pet owners information 
		#Then I can see new owners information 