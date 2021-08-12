Feature: Order an Item

  Background: Below are common login steps for every scenario
    Given user launch the browser
    When user opens URL
    And navigate to signin page
    And user enter emailId and password
    And click on login
    Then page landed to My account on successful login

  @sanity
  Scenario: Order T-Shirt
    When user clicks on T-shirt menu
    And  click on T-shirt item
    When user clicks on Add to Cart
    Then user can view cart success message
    When user clicks on Proceed to Checkout
    Then user can view Shopping-Cart Summary page
    When user clicks on Proceed to Checkout from Shopping-Cart Summary page
    And  user clicks on Proceed to Checkout from Addresses page
    And  user clicks on Terms and Conditions checkbox from Shipping page
    And  user clicks on Proceed to Checkout from Shipping page
    And  user clicks on Pay by Check mode of payment from Payment page
    And  user clicks on Confirm order 
    Then user can view Order Confirmation page
    And  user can view Order completion message 
    When user get an order reference code from order confirmation page
    And  user click on back to orders
    Then user can view Order history page 
    And  order is displayed in order history table 
    
