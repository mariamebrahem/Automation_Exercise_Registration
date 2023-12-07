Feature: user can be able to create a new account
  Scenario: user signup
    Given Launch browser and Navigate to url

    Then Verify that home page is visible successfully

    When Click on Signup button

    Then Verify 'New User Signup!' is visible

    When Enter name and email address
    And Click 'Signup' button

    Then Verify that 'ENTER ACCOUNT INFORMATION' is visible

    When Fill details and select checkboxes
    And Click 'Create Account button'

    Then Verify that 'ACCOUNT CREATED!' is visible

    When Click 'Continue' button

    Then Verify that 'Logged in as username' is visible

    When Click 'Delete Account' button

    Then Verify that 'ACCOUNT DELETED!' is visible
    And Click on 'Continue' button




