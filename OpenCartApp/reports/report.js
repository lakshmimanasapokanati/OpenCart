$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/feature/OpenCart.feature");
formatter.feature({
  "name": "OpenCartApplication",
  "description": "  In order to create a webpage\n  As a e-commerce vendor\n  I want to get access to the portal",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "SearchValidCredential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I search for the product with \u0027\u003cproduct\u003e\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "I should get all the search related products",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product"
      ]
    },
    {
      "cells": [
        "samsung"
      ]
    }
  ]
});
formatter.background({
  "name": "these are the steps common for every scenario to be followed",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with opencartpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_have_browser_with_opencartpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "SearchValidCredential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I search for the product with \u0027samsung\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_search_for_the_product_with(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get all the search related products",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_should_get_all_the_search_related_products()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "SearchInValidCredential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I search for the product as \u0027\u003cproduct name\u003e\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "I should get message as There is no product that matches the search criteria",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product name"
      ]
    },
    {
      "cells": [
        "ring"
      ]
    },
    {
      "cells": [
        "cars"
      ]
    }
  ]
});
formatter.background({
  "name": "these are the steps common for every scenario to be followed",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with opencartpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_have_browser_with_opencartpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "SearchInValidCredential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I search for the product as \u0027ring\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_search_for_the_product_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get message as There is no product that matches the search criteria",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_should_get_message_as_There_is_no_product_that_matches_the_search_criteria()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "these are the steps common for every scenario to be followed",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with opencartpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_have_browser_with_opencartpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "SearchInValidCredential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I search for the product as \u0027cars\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_search_for_the_product_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get message as There is no product that matches the search criteria",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_should_get_message_as_There_is_no_product_that_matches_the_search_criteria()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "these are the steps common for every scenario to be followed",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with opencartpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_have_browser_with_opencartpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "ClickOnAnyProduct",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I click on any product",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_click_on_any_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get all the details of the particular product",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_should_get_all_the_details_of_the_particular_product()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "these are the steps common for every scenario to be followed",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with opencartpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_have_browser_with_opencartpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "ComparingTheProducts",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I click on compare icon",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_click_on_compare_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get the comparision among the products",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_should_get_the_comparision_among_the_products()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "ClickOnCheckOut",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I enter \u0027\u003cusername\u003e\u0027 and \u0027\u003cpassword\u003e\u0027 click on CheckOut",
  "keyword": "When "
});
formatter.step({
  "name": "I should navigate to payment page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "anjanipriya456@gmail.com",
        "anju.555"
      ]
    }
  ]
});
formatter.background({
  "name": "these are the steps common for every scenario to be followed",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with opencartpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_have_browser_with_opencartpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "ClickOnCheckOut",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I enter \u0027anjanipriya456@gmail.com\u0027 and \u0027anju.555\u0027 click on CheckOut",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_enter_and_click_on_CheckOut(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should navigate to payment page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_should_navigate_to_payment_page()"
});
formatter.result({
  "status": "passed"
});
});