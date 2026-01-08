Feature: First Karate Feature

Background: 
	Given url  'https://jsonplaceholder.typicode.com'	
	
Scenario: Create a post
		Given path '/posts'
 	 And request
	
"""
	{
	"userId": 10,
	"id": 101,
	"title":"this is first post",
	"body":"We are almost done with class"
	}
"""
	When method post
  Then status 201
 	  * def userID = response.userId
		* match userID == 10
		* def ID = response.id
		* match ID == 101
		* def title = response.title
		* match title contains 'first'
		* def body = response.body
	  *	match body contains 'We are almost done with class'
	  
	  


Scenario Outline:  Create a post
	Given path '/posts'
	And request
	
"""
	{
	"userId": <userID>,
	"id": <id>,
	"title":"<title>",
	"body":"<body>"
	}
"""
	When method post
	Then status 201
			* def userID = response.userId
			* match userID == <userID>
			* def id = response.id
			* match id == <id>
			* def title = response.title
			* match title contains 'title'
			* def body = response.body
			*	match body contains 'body'
Examples: 
|userID|id|titl|boyd|
|10|101|this is karate1|thi is DD1|
|10|101|this is karate2|thi is DD2|
|10|101|this is karate3|thi is DD3|
|10|101|this is karate4|thi is DD4|
|10|101|this is karate5|thi is DD5|

	
	
	