$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:features/test.feature");
formatter.feature({
  "name": "Enter data to Contact us",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Navigate to SecurePay and Enter Details to Contact Us",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.steps.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens Url \"http://www.google.com.au\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.steps.user_opens_Url(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter searach text \"SecurePay\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.steps.user_enter_serach_text(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Search",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.steps.click_on_Search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \"SecurePay.com.au\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.steps.click_on(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Titile should be \"SecurePay online payment and eCommerce solutions for businesses\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.steps.page_Titile_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click \"Contact Us\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.steps.user_click(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verifies Contact Us loaded",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.steps.verifies_Contact_Us_loaded()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter details to Contact Us",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.steps.enter_details_to_Contact_Us()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.steps.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});