Feature: Generate Token

Scenario: This scenario will generate Token
    * def dataGenerator = Java.type('hawks.API.DataGenerator')
    * def email = dataGenerator.getEmail()
    * def password = dataGenerator.getPassword()       
		* url apiUrl
		* path '/adminRegistered'
		* request {"email":#(email),"password":#(password)}
		* method post
		* status 200
		* print response
		* def token = response.data.token.token
		* print token
		
			
			
