Feature: Calculate the insurance prime for a customer

Scenario: The customer is a young man
Given customer is a M and have 28 years old and is a not married
When do insurance balance
Then Show 400

Scenario Outline: The customer is "<description>"
Given customer is a <genre> and have <age> years old and is a <married>
When do insurance balance
Then Show <answer>

Examples:
| description | genre | age | married | answer |
| a young man | M | 28 | not married | 400 |
| a woman | F | 35 | married | 300 |
| not too old | M | 50 | not married | 400 |