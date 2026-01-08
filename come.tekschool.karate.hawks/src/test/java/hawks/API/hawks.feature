Feature: Hawks API testing with Json body

Background: 
		 	* def requestJsonBody = ready('body.json')
		 	* def dataGenerator = Java.type('hawks.API.DataGenerator')
		 	
	# primarPerson from body.json file parameterized both keys & values
		 	* set requestJsonBody.primaryPerson.email = dataGenerator.getValues().email
			* set requestJsonBody.primaryPerson.title = dataGenerator.getValues().title
			* set requestJsonBody.primaryPerson.firstName = dataGenerator.getValues().firstName
			* set requestJsonBody.primaryPerson.lastName = dataGenerator.getValues().lastName
			* set requestJsonBody.primaryPerson.gender = dataGenerator.getValues().gender
			* set requestJsonBody.primaryPerson.maritalStatus = dataGenerator.getValues().maritalStatus
			* set requestJsonBody.primaryPerson.employmentStatus = dataGenerator.getValues().employmentStatus
			* set requestJsonBody.primaryPerson.dateOfBirht = dataGenerator.getValues().dateOfBirth
			* set requestJsonBody.primaryPerson.languagePref = dataGenerator.getValues().languagePref
			
			
	# primaryPersonMailingAddress from body.json file parameterized both keys & values
		  * set requestJsonBody.primaryPersonMailingAddress.addressType = dataGenerator.getValues().addressType
		  * set requestJsonBody.primaryPersonMailingAddress.addressLine1 = dataGenerator.getValues().addressLine1
		  * set requestJsonBody.primaryPersonMailingAddress.city = dataGenerator.getValues().city
		  * set requestJsonBody.primaryPersonMailingAddress.state = dataGenerator.getValues().state
		  * set requestJsonBody.primaryPersonMailingAddress.postalCode = dataGenerator.getValues().postalCode
		  * set requestJsonBody.primaryPersonMailingAddress.countryCode = dataGenerator.getValues().countryCode
		  
		  		  
	# primaryPersonPhone from body.json file parameterized both keys & values	  
		  * set requestJsonBody.primaryPersonPhone.phoneNumber = dataGenerator.getValues().phoneNumber
		  * set requestJsonBody.primaryPersonPhone.phoneExtension = dataGenerator.getValues().phoneExtension
		  * set requestJsonBody.primaryPersonPhone.phoneTime = dataGenerator.getValues().phoneTime
		  * set requestJsonBody.primaryPersonPhone.phoneType = dataGenerator.getValues().phoneType	  	  
      * url apiUrl
			* def result = call read('TokenGenerator.feature')
			* def tokenValue = result.token
@json			
Scenario: payload request scenario
		  * headers {Authorization: '#("Bearer " + tokenValue)'}
			*	path '/user'
			* request requestJsonBody
		  * mothod post
			* status 200
			* print response
			* match response.meta.code ==200
		  * match response.meta.status == 'success'
		  * match response.data.primaryPerson.email == requestJsonBody.primaryPerson.email
	
	#schema validations
		  * match response.data.account.accountId == '#number'
		  * match response.data.primaryPerson.email == '#string'
		  * match response.data.primaryPerson.email ! = '#number'
		  

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			