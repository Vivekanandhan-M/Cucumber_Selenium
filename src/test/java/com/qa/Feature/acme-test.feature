Feature: Verifying the acme-test account details

@First
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




Scenario Outline: To download the monthly report

Given User navigates to home page
When user navigates to monthly reports screen
Then user download the monthly reposts based on "<Vendor>" and "<Month>" and "<Year>"
Examples:
| Vendor   | Month   | Year |
| DE763212 | January | 2018 |
| IT754893 | March   | 2018 |
| RO123456 | February | 2018 |

@Last
Scenario: Quite the browser
Then Quit the browser completely