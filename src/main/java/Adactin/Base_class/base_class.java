package Adactin.Base_class;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class base_class {
    public static WebDriver driver;


    public static WebDriver Browser_Launch(String url) {

        driver = new ChromeDriver();
        return driver;
    }

    public static void maximize() {
        driver.manage().window().maximize();
    }

    public static void selectByIndex_dropdown(WebElement element, int index) {
        Select search = new Select(element);
        search.selectByIndex(index);
    }

    public static void selectByValue_dropdown(WebElement element, String s) {
        Select value = new Select(element);
        value.selectByValue(s);
    }

    public static void action_selecthotel() {
        Actions selecthotel = new Actions(driver);
        selecthotel.click().perform();
    }


}
