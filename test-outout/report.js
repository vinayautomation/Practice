$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "PHP Travels Login feature",
  "description": "",
  "id": "php-travels-login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 20670270313,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Login with valid credentials",
  "description": "",
  "id": "php-travels-login-feature;login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on valid login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters valid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user logged in application successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_is_on_valid_login_page()"
});
formatter.result({
  "duration": 456881057,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_enters_valid_username_and_password()"
});
formatter.result({
  "duration": 581758816,
  "status": "passed"
});
formatter.match({
  "location": "Login.click_on_login_button()"
});
formatter.result({
  "duration": 2835942497,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_logged_in_application_successfully()"
});
formatter.result({
  "duration": 48855,
  "status": "passed"
});
});