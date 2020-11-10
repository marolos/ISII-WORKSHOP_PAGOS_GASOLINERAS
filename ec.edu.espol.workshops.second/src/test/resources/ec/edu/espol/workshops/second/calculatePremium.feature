Feature: Calculate the insurance prime for a customer

Scenario: The customer is a young man
Given is a male and	is a young and is a not married
When do insurance balance
Then Show 1

Scenario Outline: The customer is "<description>"
Given is a "<genre>" and is a "<age>" and is "<married>"
When do insurance balance
Then Show "<answer>"

Examples:
| description | genre | age | married | answer |
| a young man | male | 18 | not married | 1 |
| a woman | female | 35 | married | 1 |
| not too old | male | 50 | not married | 1 |