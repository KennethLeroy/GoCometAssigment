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


    @Given("The user is on the home page")
    public void theUserIsOnTheHomePage() {
        
    }

    @When("The user clicks on {string}")
    public void theUserClicksOn(String arg0) {
        
    }

    @Then("The user sees details of {string}")
    public void theUserSeesDetailsOf(String arg0) {

    }

    @Given("The user is on the product page")
    public void theUserIsOnTheProductPage() {

    }

    @When("The user clicks on the add to cart button")
    public void theUserClicksOnTheAddToCartButton() {
    }

    @Then("The product gets added to their cart")
    public void theProductGetsAddedToTheirCart() {
    }

    @Given("The user is on the cart page")
    public void theUserIsOnTheCartPage() {
    }

    @When("The user clicks on the delete button")
    public void theUserClicksOnTheDeleteButton() {
    }

    @Then("The product gets deleted from their cart")
    public void theProductGetsDeletedFromTheirCart() {
    }

    @When("The user clicks on the place order button")
    public void theUserClicksOnThePlaceOrderButton() {
    }

    @Then("The order form gets displayed")
    public void theOrderFormGetsDisplayed() {
    }

    @When("The user fills the form")
    public void theUserFillsTheForm() {
    }

    @Then("The purchase confirmation gets displayed")
    public void thePurchaseConfirmationGetsDisplayed() {
    }
}
