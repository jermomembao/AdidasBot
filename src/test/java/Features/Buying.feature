Feature:Buying
  File containing steps used to interact with web pages


  Scenario: Purchase shoes on adidas
    Given I have navigated to the adidas homepage
    And I select items to put in the basket
    When I click purchase
    Then I am provised with a successful message