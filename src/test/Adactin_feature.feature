Feature:Testing the Adactin Hotel application through website


  Scenario: Login Functionality
    Given User Launch the Adactin page URL
    When User enter the username in the username field
    And User enter the Password in the password field
    Then User click the Login Button


  Scenario: Search for the Hotel
    Given Book the Hotel
    When User select the location
    And User select the Hotel
    And User selec the Room Type
    And User select the Number of Rooms
    And User enter the CheckIn Date
    And User enter the CheckOut Date
    And User enter the Adults Per Rooms
    And User enter the Child per Rooms
    Then User click the Search Button


  Scenario: Verify the Hotel details
    Given Verify the Hotel
    When User click the Button To choose
    Then User click the Continue Button


  Scenario: Book a Hotel
    Given Billing Page
    When User enter the first name
    And User enter the last name
    And User enter the Billing address
    And User enter the card number
    And User choose the card type
    And User choose the card expiry month and year
    And User enter the card cvv number
    Then User click the ok Button


  Scenario: My Itinerary
    Given Scroll the page down
    When User click the itinerary Button


