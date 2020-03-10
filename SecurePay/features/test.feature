Feature: Enter data to Contact us
Scenario:  Navigate to SecurePay and Enter Details to Contact Us
Given  User Launch Chrome browser
When User opens Url "http://www.google.com.au"
And User enter searach text "SecurePay"
And Click on Search
And Click on "SecurePay.com.au"
Then Page Titile should be "SecurePay online payment and eCommerce solutions for businesses"
When User click "Contact Us"
Then Verifies Contact Us loaded
And Enter details to Contact Us
And close the browser

