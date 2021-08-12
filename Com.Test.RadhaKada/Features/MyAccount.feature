Feature: MyAccount Information

  Background: Below are common login steps for every scenario
    Given user launch the browser
    When user opens URL
    And navigate to signin page
    And user enter emailId and password
    And click on login
    Then page landed to My account on successful login

  @sanity
  Scenario: Update First Name from MyAccount
    When user click on account name
    And clicks on Personal Information
    Then user can view Account information page
    When user edit first name
    And user enter current password
    And clicks on Save
    Then Personal Information is updated successfully
