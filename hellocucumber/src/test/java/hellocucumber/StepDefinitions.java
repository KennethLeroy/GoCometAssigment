package hellocucumber;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class StepDefinitions {
//    static {WebDriverManager.chromedriver().setup();}

    private final WebDriver driver = WebDriverManager.firefoxdriver().create();
    @Given("an example scenario")
    public void anExampleScenario() {

    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }
    @Then("the scenario passes")
    public void theScenarioPasses() {
    }


    @Given("The user is on the home page")
    public void theUserIsOnTheHomePage() {
        driver.get("https://www.demoblaze.com/index.html");    }

    @When("The user clicks on {string}")
    public void theUserClicksOn(String arg0) {
        WebElement element = driver.findElement(By.className(arg0));
        element.click();
    }

    @Then("The user sees details of {string}")
    public void theUserSeesDetailsOf(String arg0) {

    }

    @Given("The user is on the product page")
    public void theUserIsOnTheProductPage() {
        driver.get("https://demoblaze.com/prod.html?idp_=10");
    }

    @When("The user clicks on the add to cart button")
    public void theUserClicksOnTheAddToCartButton() {
        WebElement element = driver.findElement(By.className("btn btn-success btn-lg"));
        element.click();
    }

    @Then("The product gets added to their cart")
    public void theProductGetsAddedToTheirCart() {
//        check if the product appears in the cart
    }

    @Given("The user is on the cart page")
    public void theUserIsOnTheCartPage() {
        driver.get("https://demoblaze.com/cart.html");

    }

    @When("The user clicks on the delete button")
    public void theUserClicksOnTheDeleteButton() {
        WebElement element = driver.findElement(By.tagName("Delete"));
        element.click();
    }

    @Then("The product gets deleted from their cart")
    public void theProductGetsDeletedFromTheirCart() {
//        check if product is not there
    }

    @When("The user clicks on the place order button")
    public void theUserClicksOnThePlaceOrderButton() {
        WebElement element = driver.findElement(By.className("btn btn-success"));
        element.click();
    }

    @Then("The order form gets displayed")
    public void theOrderFormGetsDisplayed() {
//        check if order form is displayed
    }

    @When("The user fills the form")
    public void theUserFillsTheForm() {
//        fill the form and submit form
    }

    @Then("The purchase confirmation gets displayed")
    public void thePurchaseConfirmationGetsDisplayed() {
//        check if confirmation message displayed
    }

    @When("The user navigates to the first panel")
    public void theUserNavigatesToTheFirstPanel() {
    }

    @Then("The user sees products on the first panel")
    public void theUserSeesProductsOnTheFirstPanel() {
    }

    @When("The user navigates to the second panel")
    public void theUserNavigatesToTheSecondPanel() {
    }

    @Then("The user sees products on the second panel")
    public void theUserSeesProductsOnTheSecondPanel() {
    }

    @When("User clicks on Phones button")
    public void userClicksOnPhonesButton() {
    }

    @Then("User sees all phones listed")
    public void userSeesAllPhonesListed() {
    }

    @When("User clicks on Laptop button")
    public void userClicksOnLaptopButton() {
    }

    @Then("User sees all laptops listed")
    public void userSeesAllLaptopsListed() {
    }

    @When("User clicks on Monitors button")
    public void userClicksOnMonitorsButton() {
    }

    @Then("User sees all monitors listed")
    public void userSeesAllMonitorsListed() {
    }
}
