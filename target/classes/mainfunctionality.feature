Feature: Main Functionality
  As a User
  I want to test main functionality
  So that I can be sure that site works correctly

  Scenario Outline: Check Requests In Customer Service
    Given User opens '<homePage>' page
    When User clicks Contact button
    And User checks that current url contains '<searchUrl>'
    And User makes search by keyword '<keyword>'
    And User clicks on first request item
    Then User checks that current url contains '<keyword>'

    Examples:
      | homePage              | searchUrl | keyword |
      | https://www.ebay.com/ | help      | apple   |
      | https://www.ebay.com/ | help      | top     |
      | https://www.ebay.com/ | help      | call    |


  Scenario Outline: Check adding to cart
    Given User opens '<homePage>' page
    And User clicks on Menu button
    And User clicks on Women button menu
    When User clicks on Sort button
    And User clicks on sort of lowest first
    And User clicks on first cheapest products of women clothing
    And User changes quantity of products on <quantityOfProducts>
    And User checks that Add to cart button is visibility
    Then User clicks on Add to cart button
    And User checks that quantity of products in cart is '<quantityOfProducts>'

    Examples:
      | homePage              | quantityOfProducts |quantityOfProducts|
      | https://www.ebay.com/ | 2                  |2                 |

  Scenario Outline: Check changing Site
    Given User opens '<homePage>' page
    And User clicks on Change Site Button
    When User clicks on Russian Site Button
    Then User checks that current url contains '<keyword>'

    Examples:
      | homePage              | keyword |
      | https://www.ebay.com/ | ru      |

    Scenario Outline: Check searching
      Given User opens '<homePage>' page
      And User enter search by keyword '<keyword>'
      When User clicks on Search Button
      Then User checks that text about found nothing is visible '<expectedText>'

    Examples:
      | homePage              | keyword        | expectedText           |
      | https://www.ebay.com/ | yryyryryyryry  | No exact matches found |

      Scenario Outline: Check buying product now button
        Given User opens '<homePage>' page
        And User clicks on Shop by category button
        And User clicks on See all categories button
        When User clicks on Women's Clothing button
        And User clicks on Dresses Category
        And User clicks on S size
        And User clicks on Pink color button
        And User clicks on product description
        Then User checks buying product now button

        Examples:
          | homePage              |
          | https://www.ebay.com/ |

      Scenario Outline: Check errors on Buy product now button
        Given User opens '<homePage>' page
        And User clicks on Popular Category Button
        And User opens Product page
        And User clicks on Buy it now button
        When User clicks on check out as guest button
        And User clicks on Done button
        Then User checks errors

        Examples:
          | homePage              |
          | https://www.ebay.com/ |

  Scenario Outline: Check error when limit product per buyer is exceeded
    Given User opens '<homePage>' page
    And User clicks on Menu button
    And User clicks on Women button menu
    When User clicks on Sort button
    And User clicks on sort of lowest first
    And User clicks on first cheapest products of women clothing
    And User changes quantity of products on <quantityOfProducts>
    Then User checks Limit Product Per Buyer Error
    And User checks that Error icon is displayed

    Examples:
      | homePage              | quantityOfProducts |
      | https://www.ebay.com/ | 10                 |

  Scenario Outline: Check that product has Seller Information
    Given User opens '<homePage>' page
    And User hovers mouse on Sport tab
    And User clicks on Fishing menu button
    And User opens Product item
    Then User checks that product has Seller Information

    Examples:
      | homePage              |
      | https://www.ebay.com/ |

    Scenario Outline: Check category in search input
      Given User opens '<homePage>' page
      And User clicks on Categories button in Search input
      And User chooses Music category
      When User clicks on Search Button
      Then User checks whether current url contains '<expectedUrl>'

      Examples:
        | homePage              |expectedUrl|
        | https://www.ebay.com/ |Music      |

    Scenario Outline: Check Recently Viewed Items List
      Given User opens '<homePage>' page
      And User clicks on Daily Deals Product
      When User clicks on Logo
      Then User checks that opened product is in Recently Viewed Items list

      Examples:
        | homePage              |
        | https://www.ebay.com/ |