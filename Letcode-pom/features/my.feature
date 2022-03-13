Feature: test letcode smoke scenario
  
Scenario: Test login with valid credentials
  Given open chrome and valid application
  When i enter  valid username and password
  Then user should able to login successfully
 
