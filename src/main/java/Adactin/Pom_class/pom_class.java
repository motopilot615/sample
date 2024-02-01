package Adactin.Pom_class;

import org.openqa.selenium.By;

//locators
public class pom_class {

    //LoginPage
    public By username = By.id("username");

    public By password = By.id("password");

    public By Login_btn = By.name("login");

    //Search The Hotel
    public  By location = By.name("location");

    public  By hotels = By.id("hotels");

    public  By Room_Type = By.name("room_type");

    public  By Room_nos = By.name("room_nos");

    public  By CheckIn_Date = By.id("datepick_in");

    public  By CheckOut_Date = By.id("datepick_out");

    public  By Adultsper_room = By.id("adult_room");

    public  By Childper_room = By.id("child_room");

    public  By Search = By.name("Submit");

    //Verify the Hotel
    public By Radio_btn = By.id("radiobutton_0");

    public By Continue = By.name("continue");

    //Booking the Hotel
    public By first_name = By.name("first_name");

    public By last_name = By.name("last_name");

    public By address = By.id("address");

    public By credit_card_no = By.id("cc_num");

    public By credit_card_type = By.className("select_combobox");

    public By card_expirydate_month = By.xpath("//select[@name='cc_exp_month']");

    public By card_expirydate_year = By.name("cc_exp_year");

    public By card_cvv = By.xpath("//input[@id='cc_cvv']");

    public By book_btn = By.id("book_now");

    //My Itinerary
    public By Click_itinerary = By.className("reg_button");











}
