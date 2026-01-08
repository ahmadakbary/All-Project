Feature: Login to Retail Website




@smokeTest
Scenario: Retail website Login test
Given user is on Retail website
When user click on Myaccount
And user click on Login option
And user enter userName 'hwaks@yahoo.com' and password 'asdf'
And user click on Login button
Then user should be logged in to Myaccount dashboard

Scenario: Retail website Login test
Given user is on Retail website
When user click on Myaccount
And user click on Login option
And user enter userName '<userName>' and password'<password>'
And user click on Login button
Then user should be logged in to Myaccount dashboard

Examples: 
|userName				     |password|
|as@yahoo.com        |asdf    |
|hawks@yahoo.com     |asdf		|
|eagles@tekschool.us |eagles  |
|falcons@tekschool.us|falcons |





