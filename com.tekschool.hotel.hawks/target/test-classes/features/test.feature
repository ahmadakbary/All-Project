Feature: Test Hotel domain


@Test
Scenario: login to Hotel
	Given user is on hotel website
	When user click on singIn button
	Then user should see signIn page
	

	
	