$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/apiTask.features");
formatter.feature({
  "name": "API endpoint",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verification of API endpoint",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TaskApi"
    }
  ]
});
formatter.step({
  "name": "User should send GET request to the endPoint",
  "keyword": "Given "
});
formatter.step({
  "name": "User should verify that format of the response body is JSON",
  "keyword": "Then "
});
formatter.step({
  "name": "User should filters the response as \"\u003ckey\u003e\" and \"\u003cvalue\u003e\" format",
  "keyword": "And "
});
formatter.step({
  "name": "User should verify that the status code is \u003ccode\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "User should verify that the object count is \u003ccount\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User should verify that \"\u003cAPI name\u003e\" contains in the response body and category \"\u003cvalue\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "key",
        "value",
        "code",
        "count",
        "API name"
      ]
    },
    {
      "cells": [
        "Category",
        "Science \u0026 Math",
        "200",
        "33",
        "NASA"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verification of API endpoint",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TaskApi"
    }
  ]
});
formatter.step({
  "name": "User should send GET request to the endPoint",
  "keyword": "Given "
});
formatter.match({
  "location": "ApiStepDefinition.user_should_send_GET_request_to_the_endPoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should verify that format of the response body is JSON",
  "keyword": "Then "
});
formatter.match({
  "location": "ApiStepDefinition.user_should_verify_that_format_of_the_response_body_is_JSON()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should filters the response as \"Category\" and \"Science \u0026 Math\" format",
  "keyword": "And "
});
formatter.match({
  "location": "ApiStepDefinition.user_should_filters_the_response_as_and_format(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should verify that the status code is 200",
  "keyword": "Then "
});
formatter.match({
  "location": "ApiStepDefinition.user_should_verify_that_the_status_code_is(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should verify that the object count is 33",
  "keyword": "And "
});
formatter.match({
  "location": "ApiStepDefinition.user_should_verify_that_the_object_count_is(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should verify that \"NASA\" contains in the response body and category \"Science \u0026 Math\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ApiStepDefinition.userShouldVerifyThatContainsInTheResponseBodyAndCategory(String,String)"
});
formatter.result({
  "status": "passed"
});
});