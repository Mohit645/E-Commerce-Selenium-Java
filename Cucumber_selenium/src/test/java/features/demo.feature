Feature: Validating currency price

Scenario: Verify the exchange across different currencies
Given Open google
When User will pass "euros to inr" to check currency exchange
Then Click Search button
And Validate the rate