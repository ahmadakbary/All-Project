Feature: Register new user

@RegisterTest
Scenario: Create new user account in Test environment
			Given user is on Retail website
			When user click on Myaccount
			And user click on Register
			And user fill registration form with below information
			|firstName|email|telephone|password|passwordConfirm|Subscribe|
			|alex|conor|alex@gmail.com|2021011122|WrongPass|yes|
			And user agree to privacy and policy
			And user click on continue button
			Then user should see successful message 'Your Account has Been Created'