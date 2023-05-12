package interview_assignment.step_definitions;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;


public class ApiStepDefinition{


    String baseURI="https://api.publicapis.org/entries";
    Response response;


    @Given("User should send GET request to the endPoint")
    public void user_should_send_GET_request_to_the_endPoint() {
        response = given().
                when().
                get(baseURI);
        response.prettyPrint();

    }

    @Then("User should verify that format of the response body is JSON")
    public void user_should_verify_that_format_of_the_response_body_is_JSON() {
        response.then().
                assertThat().contentType(ContentType.JSON);

    }

    @Then("User should filters the response as {string} and {string} format")
    public void user_should_filters_the_response_as_and_format(String key, String value) {
        response = given().
                queryParam(key, value).
                when().get(baseURI);

    }

    @Then("User should verify that the status code is {int}")
    public void user_should_verify_that_the_status_code_is(Integer code) {
        response.then()
                .statusCode(code);
    }

    @Then("User should verify that the object count is {int}")
    public void user_should_verify_that_the_object_count_is(int count) {
        int actualCount = response.jsonPath().getList("entries").size();
        Assert.assertEquals(count, actualCount);

  }

  @Then("User should verify that {string} contains in the response body and category {string}")
    public void userShouldVerifyThatContainsInTheResponseBodyAndCategory(String apiName, String value) {
      boolean isMatchFound = response.jsonPath().getList("entries")
              .stream()
              .anyMatch(entry -> entry.toString().contains(apiName) && entry.toString().contains(value));
      Assert.assertTrue(isMatchFound);
  }

}