Feature: Search functionality

  Scenario Outline: verify job search result using different dataset
    Given I am on homepage
    And I enter Job Title "<Title>"
    And I enter Location "<Location>"
    And I select Distance "<Distance>"
    And I click on more search option link
    And I enter Min Salary "<Min Salary>"
    And I enter Max Salary "<Max Salary>"
    And I enter Salary Type "<Salary Type>"
    And I select Job Type "<Job Type>"
    And I Click on find JOb Button
    Then Verify the "Result Displayed"

    Examples:
      | Title                 | Location   | Distance | Min Salary | Max Salary | Salary Type | Job Type  |
      | Automation Engineer   | London     | 15 miles | 38000      | 48000      | Per annum   | Contract  |
      | Manual Tester         | Watford    | 25 miles | 30000      | 45000      | Per annum   | Permanent |
      | Retail Assistant      | Manchester | 35 miles | 1500       | 2000       | Per month   | Permanent |
      | Warehouse Operative   | London     | 10 miles | 1000       | 1200       | Per hour    | Contract  |
      | Supervisor            | London     | 25 miles | 20000      | 30000      | Per annum   | Contract  |
      | Automotive Technician | Essex      | 15 miles | 35000      | 45000      | Per annum   | Permanent |