package Adactin.Stepdefinition;

import Adactin.Base_class.base_class;
import Adactin.Pom_class.pom_class;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;


public class step_definition extends base_class {

    pom_class Adactin = new pom_class();


    //LoginPage
    @Given("User Launch the Adactin page URL")
    public void user_launch_the_adactin_page_url() {
        driver.get("https://adactinhotelapp.com/");
        driver.manage().deleteAllCookies();
        maximize();
    }


    @When("User enter the username in the username field")
    public void user_enter_the_username_in_the_username_field() {
        driver.findElement(Adactin.username).sendKeys("Mohamedharis");
    }

    @And("User enter the Password in the password field")
    public void user_enter_the_password_in_the_password_field() {
        driver.findElement(Adactin.password).sendKeys("1234567890");
    }

    @Then("User click the Login Button")
    public void user_click_the_login_button() {
        driver.findElement(Adactin.Login_btn).click();
    }

    //Search The Hotel

    @Given("Book the Hotel")
    public void book_the_hotel() {

    }
    @When("User select the location")
    public void user_select_the_location() {
        driver.findElement(Adactin.location).click();
        selectByIndex_dropdown(driver.findElement(Adactin.location),4 );

    }
    @When("User select the Hotel")
    public void user_select_the_hotel() {
        driver.findElement(Adactin.hotels).click();
        selectByIndex_dropdown(driver.findElement(Adactin.hotels),3 );

    }
    @When("User selec the Room Type")
    public void user_selec_the_room_type() {
        driver.findElement(Adactin.Room_Type).click();
        selectByIndex_dropdown(driver.findElement(Adactin.Room_Type),4);

    }
    @When("User select the Number of Rooms")
    public void user_select_the_number_of_rooms() {
        driver.findElement(Adactin.Room_nos).click();
        selectByIndex_dropdown(driver.findElement(Adactin.Room_nos),4);

    }
    @When("User enter the CheckIn Date")
    public void user_enter_the_check_in_date() {
        driver.findElement(Adactin.CheckIn_Date).clear();
        driver.findElement(Adactin.CheckIn_Date).sendKeys("26/01/2024");

    }
    @When("User enter the CheckOut Date")
    public void user_enter_the_check_out_date() {
        driver.findElement(Adactin.CheckOut_Date).clear();
        driver.findElement(Adactin.CheckOut_Date).sendKeys("29/01/2024");

    }
    @When("User enter the Adults Per Rooms")
    public void user_enter_the_adults_per_rooms() {
        driver.findElement(Adactin.Adultsper_room).click();
        selectByIndex_dropdown(driver.findElement(Adactin.Adultsper_room),3 );

    }
    @When("User enter the Child per Rooms")
    public void user_enter_the_child_per_rooms() {
        driver.findElement(Adactin.Childper_room).click();
        selectByIndex_dropdown(driver.findElement(Adactin.Childper_room),1 );

    }
    @Then("User click the Search Button")
    public void user_click_the_search_button() {
        driver.findElement(Adactin.Search).click();

    }

    //Verify the Hotel


    @Given("Verify the Hotel")
    public void verify_the_hotel() {

    }
    @When("User click the Button To choose")
    public void user_click_the_button_to_choose() {
        driver.findElement(Adactin.Radio_btn).click();

    }
    @Then("User click the Continue Button")
    public void user_click_the_continue_button() {
        driver.findElement(Adactin.Continue).click();

    }


    //Booking The Hotel


    @Given("Billing Page")
    public void billing_page() {

    }
    @When("User enter the first name")
    public void user_enter_the_first_name() {
        driver.findElement(Adactin.first_name).sendKeys("Mohamed");

    }
    @When("User enter the last name")
    public void user_enter_the_last_name() {
        driver.findElement(Adactin.last_name).sendKeys("Haris");

    }
    @When("User enter the Billing address")
    public void user_enter_the_billing_address() {
        driver.findElement(Adactin.address).sendKeys("Tirunelveli");

    }
    @When("User enter the card number")
    public void user_enter_the_card_number() {
        driver.findElement(Adactin.credit_card_no).sendKeys("2325 6482 1321 6846");

    }
    @When("User choose the card type")
    public void user_choose_the_card_type() {
        driver.findElement(Adactin.credit_card_type).click();
        selectByIndex_dropdown(driver.findElement(Adactin.credit_card_type),2 );

    }
    @When("User choose the card expiry month and year")
    public void user_choose_the_card_expiry_month_and_year() {
        driver.findElement(Adactin.card_expirydate_month).click();
        selectByIndex_dropdown(driver.findElement(Adactin.card_expirydate_month), 7);

        driver.findElement(Adactin.card_expirydate_year).click();
        selectByIndex_dropdown(driver.findElement(Adactin.card_expirydate_year),8 );

    }
    @When("User enter the card cvv number")
    public void user_enter_the_card_cvv_number() {
        driver.findElement(Adactin.card_cvv).sendKeys("6150");
    }
    @Then("User click the ok Button")
    public void user_click_the_ok_button() {
        driver.findElement(Adactin.book_btn).click();

    }

    //My Itinerary
    @Given("Scroll the page down")
    public void scroll_the_page_down(){

    }
    @When("User click the itinerary Button")
    public void user_click_the_itinerary_button() {
        driver.findElement(Adactin.Click_itinerary).click();


    }



}
