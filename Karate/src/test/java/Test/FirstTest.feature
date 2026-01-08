Feature: Sample API Test




Scenario: Test a Sample Get API
	Given  url 'https://reqres.in/api/users?page=2'
	When method Get	
	Then status 200
	

