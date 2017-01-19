@Search
Feature: Search products in amazon and verify its presence

Scenario Outline: Search products

When I search for <productName>
Then I should see the <productFound> on the page

Examples:
|productName|productFound|
|laptop     |Laptops     |
|mobile     |Cell Phones |