package com.example.ui.stepdefinitions;

import com.example.ui.helper.BaseWeb;
import com.example.ui.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class CommonSteps extends HomePage {
    private HomePage homePage;
    public static WebDriver driver = BaseWeb.getDriver();

    public CommonSteps() {
        super();
        homePage = HomePage.getInstance(driver);

    }

    @Given("^I am on MVC home Page$")
    public void I_am_on_MVC_home_Page() throws Throwable {
        homePage.verifyHomePage();
    }

    @When("^I am successfully added the Set Morning alarm at 6 Clock task to a List$")
    public void I_am_successfully_added_the_Set_Morning_alarm_at_6_Clock_task_to_a_List() throws Throwable {
        homePage.search();
    }

    @Then("^Verify Morning alarm task is added successfully$")
    public void Verify_Morning_alarm_task_is_added_successfully() throws Throwable {
        homePage.verifyList();
    }

    @Given("^After adding Morning alarm successfully$")
    public void After_adding_Morning_alarm_successfully() throws Throwable
    {
        homePage.verifyList();
    }
    @When("^Click on the Active tab$")
    public void Click_on_the_Active_tab() throws Throwable{
        homePage.actionTab("active");
    }
    @Then("^Verify TODO task is added in the Active list$")
    public void Verify_TODO_task_is_added_in_the_Active_list() throws Throwable
    {
        homePage.verifyList();
    }
    @Given("^I am on the all tab$")
    public void I_am_on_the_all_tab() throws Throwable
    {
        homePage.actionTab("all");
    }
    @When("^Go to the Active tab$")
    public void Go_to_the_Active_tab() throws Throwable{
        homePage.actionTab("active");
    }
    @Then("^Verify one item left showing correctly$")
    public void Verify_one_item_left_showing_correctly() throws Throwable
    {
        homePage.itemCount(1);
    }
    @Given("^Set_Morning_alarm_at_6_Clock_task_is_available_in_the_list$")
    public void Set_Morning_alarm_at_6_Clock_task_is_available_in_the_list() throws Throwable
    {
        homePage.verifyList();
    }
    @When("^Click_the_checkbox_to_make_it_complete$")
    public void Click_the_checkbox_to_make_it_complete() throws Throwable{
        homePage.checkbox();
    }
    @Then("^Verify item count is zero$")
    public void Verify_item_count_is_zero() throws Throwable
    {
        homePage.itemCount(0);
    }
    @Given("^Item count is zero$")
    public void Item_count_is_zero() throws Throwable
    {
        homePage.itemCount(0);
    }
    @When("^Checkbox is ticked$")
    public void Checkbox_is_ticked() throws Throwable{
        homePage.actionTab("completed");
        homePage.Compeletedchebox();
    }
    @Then("^Verify item is showing in the  completed tab$")
    public void Verify_item_is_showing_in_the_completed_tab() throws Throwable
    {
        homePage.actionTab("completed");
    }

}