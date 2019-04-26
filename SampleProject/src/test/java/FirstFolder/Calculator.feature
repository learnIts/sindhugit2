@Demo
Feature: Multiplication

  @sampleTestCase @Demo
  Scenario: Multiply a and b

    Given I have variable a
    And  I have variable b
    When I multiply a and b
    Then The result will be displayed