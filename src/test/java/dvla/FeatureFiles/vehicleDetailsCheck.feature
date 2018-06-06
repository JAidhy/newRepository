Feature: Compare vehicle details

  @vehicleDetailInf
  Scenario: Verify vehicle make and colour
    Given I am on vehicle information page
    When I search for a registration number 'LN13CMV'
    Then Vehicle details are displayed for 'LN13CMV'
