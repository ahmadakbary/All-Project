Feature: First Karate Feature

Background: 
	Given url  'https://jsonplaceholder.typeicode.com'	
	
Scenario: get all posts
	Given path '/posts'
	And 	method get
		* 	status 200
		*	  def firstID = response[0].id
		* 	print 'ID for first payload array', firstID 
		*		match firstID == 1   
		*	  def title = response[0].title
		*		match title contains 'sun'