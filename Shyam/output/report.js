$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SearchProduct.feature");
formatter.feature({
  "line": 2,
  "name": "Search products in amazon and verify its presence",
  "description": "",
  "id": "search-products-in-amazon-and-verify-its-presence",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Search"
    }
  ]
});
formatter.before({
  "duration": 23777833357,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Search products",
  "description": "",
  "id": "search-products-in-amazon-and-verify-its-presence;search-products;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Search"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I search for laptop",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see the Laptops on the page",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "laptop",
      "offset": 13
    }
  ],
  "location": "SearchProduct.searchProduct(String)"
});
formatter.result({
  "duration": 847126379,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Laptops",
      "offset": 17
    }
  ],
  "location": "SearchProduct.verifyProduct(String)"
});
formatter.result({
  "duration": 113706,
  "status": "passed"
});
formatter.after({
  "duration": 406431169,
  "status": "passed"
});
formatter.before({
  "duration": 18342234317,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Search products",
  "description": "",
  "id": "search-products-in-amazon-and-verify-its-presence;search-products;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Search"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I search for mobile",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see the Cell Phones on the page",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "mobile",
      "offset": 13
    }
  ],
  "location": "SearchProduct.searchProduct(String)"
});
formatter.result({
  "duration": 963003437,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cell Phones",
      "offset": 17
    }
  ],
  "location": "SearchProduct.verifyProduct(String)"
});
formatter.result({
  "duration": 64640,
  "status": "passed"
});
formatter.after({
  "duration": 405331628,
  "status": "passed"
});
});