
//รักษิตา รัตนาลังการ 6310450654

Feature: Deposit money
  Scenario: Deposit money into bank account
    Given I have a bank account
    When I deposit $1000 into my bank account
    Then the money should be added to my account balance