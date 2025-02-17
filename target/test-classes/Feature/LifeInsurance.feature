Feature: LICLifeInsurance

Background: 
Given user launch the LIC Life Insurance Application "https://licindia.in"

Scenario: User to view in medical policy in LIC 
When  user enters the value in search box
And user click the search button
Then user check and view the medical policy for personal purpose


Scenario Outline: Verify if user able to submit without proper credendials in portal page
When  user scroll down in the Application
And user click SSA PA Portal 
And user pass the values in input box"<password>"
Then uaer click submit button

 Examples:
| password |
| Malar    |


Scenario: User to verify privacy policy in LIC
When user click Customer Services in the home page
And user click Claims settlement requirements option 
And user scroll down in the home page
Then user click Privacy Policy option 


Scenario: User to verify Childrens Money back plan in Childrens future planning page
When  user scroll down in the Life Insurance Application
And user click childrens future planning button in the home page
And user click Know more option in childrens money back plan 
Then user click Policy document in New childrens money back plan
And user scroll up in the viewall option
And user click Licjeevantharun option
And user click LicJeevan policy link
Then user click jeevanpolicydocumentlink


Scenario Outline: User to validate the table values in the branchcode page
When user click branchcode module
And user click the search button in the branchcode page
And user pass the value in search box"<search>"
When user click Distinctive Code of the Branch option in the table
And user scroll down in the branchcode page 
And user click next option in branch code page
And user get the values in the table in branchcode page
Then user scroll up and view the values in the branchcode page

Examples:
| search   |
| Chennai  |




