Feature: Validating Place APIs

Scenario: Verify the action items of the APIs
Given Add place payload
When User calls "AddPlaceAPI" with the Post request
Then the API call gets success with status code 200
And "status" in response code is "OK"
And "scope" in response code is "APP"