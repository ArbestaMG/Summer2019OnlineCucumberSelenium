Feature: Login
  As user, I want to be able to login into vytrack under different roles with username and password

  Scenario: Login as store manager
    Given user is on the landing page
    Then user logs in as store manager
    And user veirifes that "Dashboard" page subtitle is displayed

