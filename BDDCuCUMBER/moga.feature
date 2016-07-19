Feature: this is a feauture

Background: 
Given: i open browser
Then: i quit Browser

Scenerio: login

When: enter userid
And enter password
Then: customer login successfully 
And 

Scenario Outline: eating
  Given there are <start> cucumbers
  When I eat <eat> cucumbers
  Then I should have <left> cucumbers

Examples:
   | start | eat | left |
   |  12   |  5  |  7   |
   |  20   |  5  |  15  |

Scenerio:

When: this is a when
Then: this is a then 


