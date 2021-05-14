@tag
Feature: Elearning
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Elearning signup and Compose Email
    Given I want to navigate to Elearning site
    And I enter the "<Fname>" , "<Lastname>","<username>", "<Email>" and "<Password>" details for Signup
    Then Register
    And Compose Email
  
Examples:
    | Fname   | Lastname | username| Email |Password|
    | Test | User |Test003| abcd203@gmail.com|Ldap@123|
    

