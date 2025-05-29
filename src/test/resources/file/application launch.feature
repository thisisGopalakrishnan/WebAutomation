@tag1
Feature: ERP TOOL
Scenario: Login
Given open the browser and open the web page for the ERP 
When login with correct credentials "purchasehead@e-consystems.com" and "Purchasehead123"
Then close the application.
@tagpmgeneral
Scenario: Login into PM Genaeral tab
Given open the browser and open the web page for the ERP with right credential
When  handle the PM general
Then Close the browser.