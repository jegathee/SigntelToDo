@MVCTest
Feature: Verify all the scenarios related for Manage Todo list as a MVC user


  Scenario: Todo task is added successfully
    Given I am on MVC home Page
    When I am successfully added the Set Morning alarm at 6 Clock task to a List
    Then Verify Morning alarm task is added successfully

  Scenario:Verify added Todo task in the active list
    Given After adding Morning alarm successfully
    When Click on the Active tab
    Then Verify TODO task is added in the Active list

  Scenario:Verify Number of items left showing Correctly
    Given I am on the all tab
    When Go to the Active tab
    Then Verify one item left showing correctly

  Scenario:Verify item count is reduced when checkbox is marked as complete
    Given Set_Morning_alarm_at_6_Clock_task_is_available_in_the_list
    When Click_the_checkbox_to_make_it_complete
    Then Verify item count is zero

  Scenario:Verify Completed task are showing in the completed tab
    Given Item count is zero
    When Checkbox is ticked
    Then Verify item is showing in the  completed tab

  Scenario:Verify another task is added in the List
    Given Enter Do morning yoga in the search
    When Enter the key
    Then Verify second item is added successfully in the List

  Scenario:Verify user is able to delete the todo task
    Given Todo task checkbox is ticked
    When Mouse hover to the task and click delete symbol
    Then Verify todo task is deleted successfully

  Scenario:Verify user is able to clear the selected task using Clear completed
    Given Checkbox is selected
    When Click Clear completed
    Then Verify selected todo task is cleared

  Scenario:Verify item count is reduced when todo task is deleted
    Given Two todo task in the List
    When Click Clear completed
    Then Verify item count is reduced to one

  Scenario:Verify item count is increased when Completed task is uncheck
    Given One completed task
    When Uncheck the checkbox for completed task
    Then Verify item count is increased