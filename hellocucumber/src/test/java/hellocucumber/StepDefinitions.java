package hellocucumber;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class StepDefinitions {
//    static {WebDriverManager.chromedriver().setup();}

    private final WebDriver driver = WebDriverManager.firefoxdriver().create();
    @Given("an example scenario")
    public void anExampleScenario() {
        driver.get("https://www.demoblaze.com/");
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }
    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

//    @Given("The user is on the home page")
//    public void the_user_is_on_the_home_page() {
//        // Write code here that turns the phrase above into concrete actions
////        throw new io.cucumber.java.PendingException();
//        driver.get("https://www.demoblaze.com/");
//    }
//    @When("The user navigates to the first panel")
//    public void the_user_navigates_to_the_first_panel() {
//        // Write code here that turns the phrase above into concrete actions
////        throw new io.cucumber.java.PendingException();
//    }
//    @Then("The user sees products on the first panel")
//    public void the_user_sees_products_on_the_first_panel() {
//        // Write code here that turns the phrase above into concrete actions
////        throw new io.cucumber.java.PendingException();
//    }
//    @When("The user navigates to the second panel")
//    public void the_user_navigates_to_the_second_panel() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @Then("The user sees products on the second panel")
//    public void the_user_sees_products_on_the_second_panel() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @After()
//    public void closeBrowser(){
//        driver.quit();
//    }


}
