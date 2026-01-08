Feature: Post API Demo



Background:
 * url 'https://reqres.in/api'
 * header Accept = 'application/json'

# Simple Post request
Scenario: Post Demo 1
	Given url 'https://reqres.in/api/users'
	And request { "name": "Ahmad", "job": "QA Specialist"}
	When method POST
  Then status 201
  And print response

	
# Post with Background
Scenario: Post Demo 2
	Given path '/users'
	And request { "name":"Ahmad", "job":"QA Specialist"}
	When method POST
	Then status 201
	And  print response
	
	
	# Post with Assertion
Scenario: Post Demo 3
	Given path '/users'
	And request { "name":"Ahmad", "job":"QA Specialist"}
	When method POST
	Then status 201
	And  match response == {"createdAt": "@ignore", "name": "Ahmad", "id": "#string","job": "QA Specialist"}
	And  print response
	
	
	
	
	
	
	
	
	
	
	
	
