Feature: This feature is for smoke tests

  @smoke
  Scenario: Smoke Test
    Given I print hello world
    Then everybody is happy

    @regression
    Scenario: This is for cucumber test
      Given I run Cucumber test
      Then verify this is Cucumber