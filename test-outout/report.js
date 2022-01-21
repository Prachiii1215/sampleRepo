$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("M:/Java Selenium/Selenium_Workspace/AmazonBDDFrameworkWithPOM/src/main/java/com/qa/features/search.feature");
formatter.feature({
  "line": 2,
  "name": "validate multiple items are searched",
  "description": "",
  "id": "validate-multiple-items-are-searched",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Search multiple item search result",
  "description": "",
  "id": "validate-multiple-items-are-searched;search-multiple-item-search-result",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "validate user is logged in and on homepage",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters \"\u003csearch item\u003e\" in searchbar and clicks search button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "validate search result related to \"\u003csearch item\u003e\" is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "validate-multiple-items-are-searched;search-multiple-item-search-result;",
  "rows": [
    {
      "cells": [
        "search item"
      ],
      "line": 13,
      "id": "validate-multiple-items-are-searched;search-multiple-item-search-result;;1"
    },
    {
      "cells": [
        "iphone11"
      ],
      "line": 14,
      "id": "validate-multiple-items-are-searched;search-multiple-item-search-result;;2"
    },
    {
      "cells": [
        "trimmer"
      ],
      "line": 15,
      "id": "validate-multiple-items-are-searched;search-multiple-item-search-result;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Search multiple item search result",
  "description": "",
  "id": "validate-multiple-items-are-searched;search-multiple-item-search-result;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "validate user is logged in and on homepage",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters \"iphone11\" in searchbar and clicks search button",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "validate search result related to \"iphone11\" is displayed",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_is_on_Login_Page()"
});
formatter.result({
  "duration": 14186990000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.validate_user_is_logged_in_and_on_homepage()"
});
formatter.result({
  "duration": 9833263300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "iphone11",
      "offset": 13
    }
  ],
  "location": "HomePageSteps.user_enters_in_searchbar_and_clicks_search_button(String)"
});
formatter.result({
  "duration": 17782600000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "iphone11",
      "offset": 35
    }
  ],
  "location": "HomePageSteps.validate_search_result_related_to_is_displayed(String)"
});
formatter.result({
  "duration": 14838900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.close_the_browser()"
});
formatter.result({
  "duration": 1272798200,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Search multiple item search result",
  "description": "",
  "id": "validate-multiple-items-are-searched;search-multiple-item-search-result;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "validate user is logged in and on homepage",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters \"trimmer\" in searchbar and clicks search button",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "validate search result related to \"trimmer\" is displayed",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_is_on_Login_Page()"
});
formatter.result({
  "duration": 7921883400,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.validate_user_is_logged_in_and_on_homepage()"
});
formatter.result({
  "duration": 13714939300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "trimmer",
      "offset": 13
    }
  ],
  "location": "HomePageSteps.user_enters_in_searchbar_and_clicks_search_button(String)"
});
formatter.result({
  "duration": 5790466600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "trimmer",
      "offset": 35
    }
  ],
  "location": "HomePageSteps.validate_search_result_related_to_is_displayed(String)"
});
formatter.result({
  "duration": 5779400,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.close_the_browser()"
});
formatter.result({
  "duration": 1100584300,
  "status": "passed"
});
});