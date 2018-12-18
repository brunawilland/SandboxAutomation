Feature: Testing automation-sandbox


  Scenario Outline: Login in automation-sandbox with success
    Given I go to automation-sandbox page
     Then I enter the username "<username>" 
      And I enter the password "<password>"
      And I click in Login button
       Then I log in automation-sandbox with success
    

    Examples: 
      | username | password |
      | demouser | abc123   |


  Scenario Outline: Try login at sandbox page with wrong login information
    Given I go to automation-sandbox page
     Then I enter the username "<username>"
      And I enter the password "<password>" 
      And I click in Login button
     Then Wrong Username or Password message appears

    Examples: 
      | username | password |
      | Demouser | abc123   |
      | demouser_    |  xyz |
      | demouser | nananana   |
      | Demouser    |  abc123 |

@smoke
  Scenario Outline: Verify invoice information link
    Given I go to automation-sandbox page
      Then I enter the username "<username>"
      And I enter the password "<password>" 
      And I click in Login button
      Then I log in automation-sandbox with success
     Then I click in Invoice Details link
      And open a new tab with informations
     Then I confirm that HotelName value is equal "Rendezvous Hotel"
      And I confirm that InvoiceDate value is equal "14/01/2018"
      And I confirm that DueDate value is equal "15/01/2018"
      And I confirm that InvoiceNumber value is equal "110"
      And I confirm that BookingCode value is equal "0875"
      And I confirm that CustomerDetails value is equal "JOHNY SMITH R2, AVENUE DU MAROC 123456"
      And I confirm that Room value is equal "Superior Double"
      And I confirm that CheckIn value is equal "14/01/2018"
      And I confirm that CheckOut value is equal "15/01/2018"
      And I confirm that TotalStayCount value is equal "1"
      And I confirm that TotalStayAmount value is equal "$150"
      And I confirm that DepositNow value is equal "USD $20.90"
      And I confirm that Tax&VAT value is equal "USD $19.00"
      And I confirm that TotalAmount value is equal "USD $209.00"
      
      Examples: 
      | username | password |
      | demouser | abc123   |
