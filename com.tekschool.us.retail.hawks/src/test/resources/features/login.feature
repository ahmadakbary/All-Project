Feature: Loging to Retail Website


Background:
Given user is on Retail website
When user click on Myaccount

@smokeTest	@Regression	 @EndtoEndTesting
Scenario: Retail website Login test 
	Given user is on Retail website
	When user click on Myaccount
	And user click on Login option
	And user enter userName 'eagles@tekschool.us' and password 'eagles'
	And user click on Login button
	Then user should be logged in to Myaccount dashboard

@EendtoEndTesting
Scenario Outline: Retail website Login test with multiple accounts 
	Given user is on Retail website
	When user click on Myaccount
	And user click on Login option
	And user enter userName '<userName>' and password '<password>'
	And user click on Login button
	Then user should be logged in to Myaccount dashboard

Examples:
		|userName|password|
		|eagles@tekschool.us|	eagles|
		|hawks@tekschool.us|hawks|
		|falcon@tekschool.us|falcon|







