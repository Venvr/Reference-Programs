Feature: User Registration process for Jobsaworld
Scenario: Successfull Registration

Given The User is on Register homepage page
When User clicks on Registerlink
And Enters the Userid
And Enters the Password
And Enters the Name
And Enters the Address
And Enters the Country
And Enters the Zipcode
And Enters the Email
And Enters Sex-Female
And Enters the Language-English
And Enters About
And Click Submit button 
Then User is successfully registered
And Browser is closed