@SmokeTest
Feature: I test full path from product choosing to buying

  Scenario: Open 1a.lv web-store and search for product
    Given I enter customers data like 'name', 'surname', 'aaa@bbb.com' and '123456789'
    And I open browser and 1a web store
    When I search for product 'televizors'
    And I get search results I choose first category
    And I choose producer 'Sony' and sort by rating and go to the most valuated product page
    And In product page I read data like product name and price and add this product to cart
    Then I enter cart I press button Next
    And In second step I skip registration and choose option without registration
    And In third step I fill form with data from Models.Customer and choose delivery method
    And In fourth step I choose payment method by cash
    And In final step I run data validation and assert that product price and name from product card is the same as in cart, also validate customers data
    And I stop driver


