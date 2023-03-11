Feature: User is able to register
@smoke
  Scenario: User is able to create account
    Given Launch browser
    And Navigate to url http:/automationexercise.com
    Then Verify that home page is visible successfully
    And Click on Signup / Login button
    Then Verify New User Signup! is visible
    And Enter name and email address
    Then Click Signup button
    And Verify that ENTER ACCOUNT INFORMATION is visible
    Then Fill details: Title, Name, Email, Password, Date of birth
    And Select checkbox Sign up for our newsletter!
    Then Select checkbox Receive special offers from our partners!
    And Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    Then Click Create Account button
    And Verify that ACCOUNT CREATED! is visible
    Then Click Continue button
    And Verify that Logged in as username is visible
    When Click Delete Account button
    Then Verify that ACCOUNT DELETED! is visible and click Continue button