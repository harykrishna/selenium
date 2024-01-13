Feature: Amazon app test
  @Test
  Scenario: This feature logs in to Amazon and add a random product to cart
    Given user login to Amazon website
    And user selects a product
    When  user add the product to cart
    Then product should be present in cart to check out