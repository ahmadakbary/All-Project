Feature: end2end Testing for Rest Api using Karate Post Get Delete

Background:
		 * def dataGenerator = Java.type('hawks.API.DataGenerator')
		 * def emailValue = DataGenerator.getEmail()
		 * def titleValues = DataGenerator.getLastName()
		 * def firstNameVlaue = DataGenerator.getFirstName()  
		 * def lastNameValue = DataGenerator.getTitle()	
		 * def generValue = DataGenerator.getGender()
		 * def maritalStatusValue = DataGenerator.getMartialStatus()
		 * def employmentStatusValue = DataGenerator.getemploymentStatus()
		 * def dateOfBirthValue = DataGenerator.getdateOfBirth()
		 * def languagePrefValue = DataGenerator.getlanguagePref()
		 * def addressTypeValue = DataGenerator.getaddressType()
		 * def addressLine1Value = DataGenerator.getaddressLine1()
		 * def cityValue = DataGenerator.getcity()
		 * def stateValue = DataGenerator.getstate()
		 * def postalCodeValue = DataGenerator.getpostalCode()
		 * def countryCodeValue = DataGenerator.getcountryCode()
		 * def phoneNumberValue = DataGenerator.getphoneNUmber()
		 * def phoneExtensionValue = DataGenerator.getphoneExtension()
		 * def phoneTimeValue = DataGenerator.getphoneTime()
		 * def phoneTypeValue = DataGenerator.getphoneType()		 
	   * url apiUrl
	   * def result = callonce read('TokenGenerator.feature')
		 * def tokenValue = result.token
	
@End2End
Scenario Outline: E2E Testing
	Given headers {Authorization: '#("Bearer" + tokenValue)'}
	Given path '/user'
	When request
	"""
{ 
		"primaryPerson":{     
				"email":"email",  
				"title":"title",
				"firstName":"firstName",
				"lastName":"lastName",
				"gender":"gender",
				"maritalStatus":"maritalStatus",
				"employmentStatus":"employmentStatus",
				"dateOfBirth":"dataOfBirth", 
				"languagePref":"languagePref",
 },
   "primaryPersonMailingAddress": {
				"addressType":"addressType",
				"addressLine1":"addressLine1",
				"city":"city", 
				"state":"state",
				"postalCode":"postalCode",
				"countryCode":"countryCode",
 },
   "primaryPersonPhone": {
				"phoneNumber":"phoneNumber",
				"phoneExtension":"phoneExtension",
				"phoneTime":"phoneTime",
				"phoneType":"phoneType"
    }
    }
	"""
				 * method post
				 * status 200
		 		 * print response
		 		 * match response.meta.code ==200
		 		 * match response.meta.status == 'success'
		 		 * match response.data.primaryPerson.email == '<email>'
		 		 * def accountId = response.data.account.accountId
		 		 * print 'plz print the account accountId
		 		 
 		 
# Now I use the GET Method to get the accountId
			Given url 'https://www.test-insurance.com/api/v1'
			Given headers {Authorization: '#("Bearer" + tokenValue)'}
			Given path '/user/ + accountId'
				* method get
				* status 200
				* print response
		
 		
	# Now I use the DELET Method to DELETE the accountId
			Given url 'https://www.test-insurance.com/api/v1'
			Given headers {Authorization: '#("Bearer" + tokenValue)'}
			Given path '/user/ + accountId'
				* method DELETE
				* status 200
				* print response	
			
	# Now I want validate the acountId is DELETED successfully or NOT
				* match.response.data == 'Record Successfuly deleted'
		
	Examples: 
			|email			  	|title				 		|firstName         |lastName          |gender				   |martialStatus  				 |empoymentStatus           |datOfBirth  				 |languagePref           |addressType          |addressLine1|city			|state 				 |postalCode 		 |countryCode          |phoneNumber          |phoneExtension          |phoneTime				  |phoneType        |
			|#(emailValue)	|#(titleValues)	 |#(firstNameVlaue)  |#(lastNameValue)  |#(genderValue)  |#(maritalStatusValue)  |#(employmentStatusValue)  |#(dateOfBirthValue)  |#(languagePrefValue)  |#(addressTypeValue)  |#(addressLine1Value)  |#(cityValue)  |#(stateValue)  |#(countryCodeValue)  |#(phoneNumberValue)  |#(phoneExtensionValue)  |#(phoneTimeValue)  |#(phoneTypeValue)|
		  |#(emailValue)	|#(titleValues)	 |#(firstNameVlaue)  |#(lastNameValue)  |#(genderValue)  |#(maritalStatusValue)  |#(employmentStatusValue)  |#(dateOfBirthValue)  |#(languagePrefValue)  |#(addressTypeValue)  |#(addressLine1Value)  |#(cityValue)  |#(stateValue)  |#(countryCodeValue)  |#(phoneNumberValue)  |#(phoneExtensionValue)  |#(phoneTimeValue)  |#(phoneTypeValue)|		
			|#(emailValue)	|#(titleValues)	 |#(firstNameVlaue)  |#(lastNameValue)  |#(genderValue)  |#(maritalStatusValue)  |#(employmentStatusValue)  |#(dateOfBirthValue)  |#(languagePrefValue)  |#(addressTypeValue)  |#(addressLine1Value)  |#(cityValue)  |#(stateValue)  |#(countryCodeValue)  |#(phoneNumberValue)  |#(phoneExtensionValue)  |#(phoneTimeValue)  |#(phoneTypeValue)|
			|#(emailValue)	|#(titleValues)	 |#(firstNameVlaue)  |#(lastNameValue)  |#(genderValue)  |#(maritalStatusValue)  |#(employmentStatusValue)  |#(dateOfBirthValue)  |#(languagePrefValue)  |#(addressTypeValue)  |#(addressLine1Value)  |#(cityValue)  |#(stateValue)  |#(countryCodeValue)  |#(phoneNumberValue)  |#(phoneExtensionValue)  |#(phoneTimeValue)  |#(phoneTypeValue)|		
			|#(emailValue)	|#(titleValues)	 |#(firstNameVlaue)  |#(lastNameValue)  |#(genderValue)  |#(maritalStatusValue)  |#(employmentStatusValue)  |#(dateOfBirthValue)  |#(languagePrefValue)  |#(addressTypeValue)  |#(addressLine1Value)  |#(cityValue)  |#(stateValue)  |#(countryCodeValue)  |#(phoneNumberValue)  |#(phoneExtensionValue)  |#(phoneTimeValue)  |#(phoneTypeValue)|	
			|#(emailValue)	|#(titleValues)	 |#(firstNameVlaue)  |#(lastNameValue)  |#(genderValue)  |#(maritalStatusValue)  |#(employmentStatusValue)  |#(dateOfBirthValue)  |#(languagePrefValue)  |#(addressTypeValue)  |#(addressLine1Value)  |#(cityValue)  |#(stateValue)  |#(countryCodeValue)  |#(phoneNumberValue)  |#(phoneExtensionValue)  |#(phoneTimeValue)  |#(phoneTypeValue)|	
			|#(emailValue)	|#(titleValues)	 |#(firstNameVlaue)  |#(lastNameValue)  |#(genderValue)  |#(maritalStatusValue)  |#(employmentStatusValue)  |#(dateOfBirthValue)  |#(languagePrefValue)  |#(addressTypeValue)  |#(addressLine1Value)  |#(cityValue)  |#(stateValue)  |#(countryCodeValue)  |#(phoneNumberValue)  |#(phoneExtensionValue)  |#(phoneTimeValue)  |#(phoneTypeValue)|
			|#(emailValue)	|#(titleValues)	 |#(firstNameVlaue)  |#(lastNameValue)  |#(genderValue)  |#(maritalStatusValue)  |#(employmentStatusValue)  |#(dateOfBirthValue)  |#(languagePrefValue)  |#(addressTypeValue)  |#(addressLine1Value)  |#(cityValue)  |#(stateValue)  |#(countryCodeValue)  |#(phoneNumberValue)  |#(phoneExtensionValue)  |#(phoneTimeValue)  |#(phoneTypeValue)|
			|#(emailValue)	|#(titleValues)	 |#(firstNameVlaue)  |#(lastNameValue)  |#(genderValue)  |#(maritalStatusValue)  |#(employmentStatusValue)  |#(dateOfBirthValue)  |#(languagePrefValue)  |#(addressTypeValue)  |#(addressLine1Value)  |#(cityValue)  |#(stateValue)  |#(countryCodeValue)  |#(phoneNumberValue)  |#(phoneExtensionValue)  |#(phoneTimeValue)  |#(phoneTypeValue)|
			|#(emailValue)	|#(titleValues)	 |#(firstNameVlaue)  |#(lastNameValue)  |#(genderValue)  |#(maritalStatusValue)  |#(employmentStatusValue)  |#(dateOfBirthValue)  |#(languagePrefValue)  |#(addressTypeValue)  |#(addressLine1Value)  |#(cityValue)  |#(stateValue)  |#(countryCodeValue)  |#(phoneNumberValue)  |#(phoneExtensionValue)  |#(phoneTimeValue)  |#(phoneTypeValue)|
	
		
		
		
				
		
		
				
		
		
				
		
		
				
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		