$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/Feature/CheckStop.feature");
formatter.feature({
  "line": 1,
  "name": "API Testing",
  "description": "",
  "id": "api-testing",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "A stop providing multiple transport options can be located",
  "description": "",
  "id": "api-testing;a-stop-providing-multiple-transport-options-can-be-located",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Phileas is looking for a stop",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "he searches for \"\u003cStation\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "a stop named \"\u003cStop Found\u003e\" is found",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "the stop provides more than one mode of transport",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "api-testing;a-stop-providing-multiple-transport-options-can-be-located;",
  "rows": [
    {
      "cells": [
        "Station",
        "Stop Found"
      ],
      "line": 13,
      "id": "api-testing;a-stop-providing-multiple-transport-options-can-be-located;;1"
    },
    {
      "cells": [
        "Wynyard Station",
        "Wynyard Station, Sydney"
      ],
      "line": 14,
      "id": "api-testing;a-stop-providing-multiple-transport-options-can-be-located;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "A stop providing multiple transport options can be located",
  "description": "",
  "id": "api-testing;a-stop-providing-multiple-transport-options-can-be-located;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Phileas is looking for a stop",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "he searches for \"Wynyard Station\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "a stop named \"Wynyard Station, Sydney\" is found",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "the stop provides more than one mode of transport",
  "keyword": "And "
});
formatter.match({
  "location": "TripPlanDefintionAPI.phileas_is_looking_for_a_stop()"
});
formatter.result({
  "duration": 165132116,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Wynyard Station",
      "offset": 17
    }
  ],
  "location": "TripPlanDefintionAPI.he_searches_for(String)"
});
formatter.result({
  "duration": 907756320,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Wynyard Station, Sydney",
      "offset": 14
    }
  ],
  "location": "TripPlanDefintionAPI.a_stop_named_is_found(String)"
});
formatter.result({
  "duration": 2479405,
  "status": "passed"
});
formatter.match({
  "location": "TripPlanDefintionAPI.the_stop_provides_more_than_one_mode_of_transport()"
});
formatter.result({
  "duration": 128395,
  "status": "passed"
});
});