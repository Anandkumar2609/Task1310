Feature: Register the user in demoWebShop

@Reg
  Scenario: Register the user in demoWebShop and save
    Given Enter into demoWebShop
    When Click register icon
    And Enter personal details
		Then Click register button and continue
@AddToCart
 Scenario: Login and add mobile into cart
  	Given Enter into demoWebShop
  	When Click login button
  	And Enter the credentials and login



     