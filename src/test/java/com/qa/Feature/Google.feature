Feature: Verifying the acme-test account details

Scenario: To get the details of Work Items

Given User logins into acme_test site
When User navigates to Work Items tab
Then User collects the details of following workItems
| 570571 |
| 413055 |
| 666221 |
| 478262 |
| 902554 |
Then compare the workItems results with expected one