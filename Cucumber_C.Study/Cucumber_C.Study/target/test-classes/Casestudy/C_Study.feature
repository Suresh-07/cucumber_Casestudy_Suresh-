Feature:Test Guru99
1)Valid Data
2)Invalid Data
Background:
@PostiveTesting
Scenario:To Test login functionality
Scenario:To Test login functionality
Given I should go to the login page
And Enter the username "user"
And Enter the password "user"
And Click on the login button
@NegativeTesting
Scenario:To Test login functionality with invalid data
Given I should go to the login page
And Enter the username "user123"
And Enter the password "user"
And Click on the login button
