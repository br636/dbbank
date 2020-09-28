Feature: Demo Bank

Background: 
    Given Launch the demo bank application 'http://demo.rapidtestpro.com/login.php' in browser

@Background
 Scenario Outline: verify account details with valid credetials   
    When user enters "<username>", "<password>" and "<PIN number>"
    And user click the account details button
    Then account details page is displayed
    And User logs out of the application
Examples:    
 |username  |password   |PIN number|
 |1234556666|MavDemo@01 |12345|
 
@Statement
Scenario Outline: verify account statement
    When user enters "<username>", "<password>" and "<PIN number>"
		And use click the account statement button
		Then transaction statement is displayed
		And User logs out of the application
		
Examples:    
 |username  |password   |PIN number|
 |1234556666|MavDemo@01 |12345|
 
@Transfer
Scenario Outline: To verify application is able to do fund transfer
    When user enters "<username>", "<password>" and "<PIN number>"
		And user click the fund transfer button
		And User inputs the "<RecieverBankName>", "<RecieverName>", "<RecieverAccountNumber>","<RoutingNumber>", "<Amount>", "<Date>" and "<Description>"  to complete  the fund transfer
		And click the transfer button
		Then the OTP page is displayed
		When user enter the OTP and Clicking validate VAT
		Then successful transfer page with transaction details is displayed	
		And User logs out of the application
		
Examples:    
 |username  |password   |PIN number|RecieverBankName  |RecieverName   |RecieverAccountNumber|RoutingNumber|Amount|Date      |Description|
 |1234556666|MavDemo@01 |12345     |xads              |hwdhsv         |12345                |2145         |102145|12/02/2020|Done |
		
