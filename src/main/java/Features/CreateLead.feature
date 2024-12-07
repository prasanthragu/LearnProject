Feature: Create Lead Verification in LeafTab application

@regression
Scenario: Create Lead Scenario
Given Enter the Username as 'Demosalesmanager'
And Enter the Password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed
When Click on 'CRM/SFA' Link
Then My Home page should be displayed
When Click on 'Leads' Link
Then MyLeads page should be displayed
When Click on 'Create Lead' Link
Then Create Lead page should be displayed
Given Enter the Company Name as 'TestLeaf'
And Enter the FirstName as 'Prasanth'
And Enter the LastName as 'Raguraman'
When Click on Create Lead button
Then New Lead should be created
