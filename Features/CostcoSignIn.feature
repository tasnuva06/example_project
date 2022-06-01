

Feature: Costco sign in 


  @costcosignin 
  
  Scenario Outline: 
Given user visit Costco homepage 
When user click on Sign In 
When user types invalid "<email>",valid"<password>"
Then user click on sign in




    Examples: 
      |email||password|
      |tasnuva.gmail.com|| Tropa123|