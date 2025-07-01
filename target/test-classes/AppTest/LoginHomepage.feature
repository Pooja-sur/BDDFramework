Feature: Homepage Functionality
Scenario: verify title 
Given the user is at Homepage
Then page title should contain "Your Store"

Scenario: Verify shopping cart icon
Given the user is at Homepage
Then Shopping cart icon should displayed

Scenario: Checkout featured section
Given the user is at Homepage
When user clicks on iphone
Then user should able to see brand name "Apple"

Scenario Outline: Login to app
Given the user is at Homepage
When user click on My accout dropndown
And user click on login option
And user enters "<EmailID>" and "<Password>"
And user click on login button 
Then user should redirected to "My Account" page
Examples:
|EmailID|Password|
|poojasurkutlawar@gmail.com|Pooja@09|