Feature: Login into the application

  Scenario: Sucessful login
    Given Sergey has an active account
    When he sends their valid credentials
    Then he should have access to manage his account