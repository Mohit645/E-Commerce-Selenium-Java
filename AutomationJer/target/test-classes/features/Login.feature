Feature: Application login

Scenario: Home page login
Given User is on netbanking landing page
When User logsin using valid credentials
Then Home page is populated
And Cards are displayed