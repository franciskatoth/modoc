package com.modoc.step_definitions;

import com.github.javafaker.Faker;
import com.modoc.pages.RegisterUser;
import com.modoc.utilities.ConfigurationReader;
import com.modoc.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class RegisterUser_StepDefinition {

    RegisterUser registerUser = new RegisterUser();
    Faker faker = new Faker();

    @Given("Launch browser")
    public void launch_browser() {
        System.out.println("Browser launch");

    }
    @Given("Navigate to url http:\\/automationexercise.com")
    public void navigate_to_url_http_automationexercise_com() {
        Driver.getDriver().get("http://automationexercise.com");
    }
    @Given("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        Assert.assertTrue(registerUser.homePage.isDisplayed());

    }
    @Given("Click on Signup \\/ Login button")
    public void click_on_signup_login_button() {
        registerUser.signupLoginBtn.click();


    }
    @Given("Verify New User Signup! is visible")
    public void verify_new_user_signup_is_visible() {
        String newUserSignup = "New User Signup!";
        Assert.assertTrue(registerUser.newUserSignupIsVisible.isDisplayed());
        Assert.assertTrue(registerUser.newUserSignupIsVisible.getText().equals(newUserSignup));

    }
    @Given("Enter name and email address")
    public void enter_name_and_email_address() {

        registerUser.nameBox.sendKeys(faker.name().lastName());
        registerUser.emailBox.sendKeys(faker.internet().emailAddress());

    }
    @Given("Click Signup button")
    public void click_signup_button() {
        registerUser.singUpButton.click();

    }
    @Given("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verify_that_enter_account_information_is_visible() {
        String expectedAccountInformationVisible = "Enter Account Information";
        Assert.assertTrue(registerUser.enterAccountInformation.isDisplayed());


    }
    @Given("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {

    }
    @Given("Select checkbox Sign up for our newsletter!")
    public void select_checkbox_sign_up_for_our_newsletter() {

    }
    @Given("Select checkbox Receive special offers from our partners!")
    public void select_checkbox_receive_special_offers_from_our_partners() {

    }
    @Given("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {

    }
    @Given("Click Create Account button")
    public void click_create_account_button() {

    }
    @Given("Verify that ACCOUNT CREATED! is visible")
    public void verify_that_account_created_is_visible() {

    }
    @Given("Click Continue button")
    public void click_continue_button() {

    }
    @Given("Verify that Logged in as username is visible")
    public void verify_that_logged_in_as_username_is_visible() {

    }
    @Given("Click Delete Account button")
    public void click_delete_account_button() {

    }
    @Then("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verify_that_account_deleted_is_visible_and_click_continue_button() {

    }



}
