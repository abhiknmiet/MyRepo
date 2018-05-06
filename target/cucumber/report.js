$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("mobile.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "As a user\r\nI want to be able to add 5 new records\r\nSo that i can delete it",
  "id": "",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10703833687,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Real device Scenario",
  "description": "",
  "id": ";real-device-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@mobile"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user launches the app",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user add records on real device",
  "keyword": "When "
});
formatter.match({
  "location": "StartingSteps.launchMobile()"
});
formatter.result({
  "duration": 94314148,
  "status": "passed"
});
formatter.match({
  "location": "MobileHomePageSteps.addrealrecord()"
});
formatter.result({
  "duration": 28273933404,
  "status": "passed"
});
formatter.after({
  "duration": 197519279,
  "status": "passed"
});
});