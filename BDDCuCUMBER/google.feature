Feature: To search in google engine

#Scenario: validate in search box
#Given i enter in google homePage
#When i enter any text to search box
#And i click on button
#Then i will get search result
@Login
Scenario Outline: validate in search box
Given i enter in google homePage
When i enter any <text> to search box
And i click on button
Then i will get search result

Examples:
|text|
|shahidul|
|asad|