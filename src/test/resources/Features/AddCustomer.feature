@sanity
Feature: ADD CUSTOMER FLOW VALIDATION
  I want to use this template for my feature file
  
  Background:
    And user click on add customer button
  
@smoke @karthi
  Scenario: add customer flow
    When user enters all the feilds
    And user click on submit button
    Then user should be displayed customer id is generated

@sanity @karthi
  Scenario: add customer flow by 1D list
    When user enters all the feilds by OneD list
      | karthi | rajan | kr@gmail.com | madurai | 8778836736 |
    And user click on submit button
    Then user should be displayed customer id is generated

@regression
  Scenario: add customer flow by 1D map
    When user enters all the feilds by OneM list
      | fname   | karthi          |
      | lname   | rajan           |
      | email   | rajan@gmail.com |
      | address | trichy          |
      | phno    |      9887635332 |
    And user click on submit button
    Then user should be displayed customer id is generated
