package Adactin.Runnerclass;

import Adactin.Base_class.base_class;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Adactin_feature.feature", glue = "Adactin/Stepdefinition",plugin = { "pretty", "html:target/cucumber-reports" })

public class runner_class extends base_class {


    @BeforeClass
    public static void start() {

        driver = Browser_Launch("chrome");

    }

    @AfterClass
    public static void end() {
        driver.quit();
    }


}
