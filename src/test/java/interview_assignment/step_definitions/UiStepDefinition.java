package interview_assignment.step_definitions;

import interview_assignment.pages.GooglePage;
import interview_assignment.utilities.ConfigurationReader;
import interview_assignment.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UiStepDefinition {

    GooglePage googlePage = new GooglePage();

    @Given("User should navigate to the {string}")
    public void user_should_navigate_to_the_homePage(String homePage) {
        homePage = ConfigurationReader.getProperty("urlGoogle");
        Driver.getDriver().get(homePage);


    }

    @When("User should search for {string} using the search input")
    public void user_should_search_for_using_the_search_input(String term) {
        googlePage.searchField.sendKeys(term, Keys.ENTER);
        Driver.getDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

    }

    @Then("User should verify that the first result contains the {string}")
    public void user_should_verify_that_the_first_result_contains_the(String expectedResult) {
        String actualResult = googlePage.resultFirst.getText();
        Driver.getDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        assertTrue(actualResult.contains(expectedResult),"expected result was not found");
          Driver.getDriver().close();

    }
}
