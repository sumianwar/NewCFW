Feature:Sign Up

  Scenario:Signup with valid info
    Given I'm in hotels.com signup page
    When I fill out the email field
    And I fill out the Password field
    And I input First name and Last name
    And I click on the create my account button
    Then I will verify my account is created successfully