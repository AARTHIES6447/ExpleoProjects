Feature: i want to Register in a Parabank

Scenario: Register with. valids credential

   Given User logins to application using url
   When user gives firstname and lastname
   And user gives address and city
   And user gives zipcode and  phonenumber
   And user gives ssn and username
   And user gives password and confirmpassword
   Then user gives register Button