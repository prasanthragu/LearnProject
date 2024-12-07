Feature: Login validation of the LeafsTab application

@functional
Scenario Outline: TC001_Login with correct data
Given Enter the Username as <username>
And Enter the Password as <password>
When Click on Login button
Then Homepage should be displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

@smoke @functional
Scenario: TC002_Login with incorrect data
Given Enter the Username as 'Demosalesmanager'
And Enter the Password as 'crmsfa123'
When Click on Login button
But Incorrect Username or Password error messgae should be displayed