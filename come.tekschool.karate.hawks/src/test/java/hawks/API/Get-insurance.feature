Feature: Retrieve user

Background: 
	* url apiUrl
	* def result = call read('TokenGenerator.feature')
	* def tokenValue = result.token
	
@GetID
Scenario: get User by Id
	Given headers {Authorization: '#("Bearer " + tokenValue)'}
		*		path '/user/3373'
		*		method get
		*		status 200
		*		print response

