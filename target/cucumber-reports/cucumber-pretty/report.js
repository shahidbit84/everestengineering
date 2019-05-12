$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 22,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 21,
      "name": "@tag"
    }
  ]
});
formatter.before({
  "duration": 1460168881,
  "status": "passed"
});
formatter.background({
  "line": 25,
  "name": "User navigates to application URL",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 26,
  "name": "I am on the Login page url \"http://swiggy.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "I should see the landing page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://swiggy.com",
      "offset": 28
    }
  ],
  "location": "loginStepDefinition.i_am_on_the_Login_page_url(String)"
});
formatter.result({
  "duration": 4180370895,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition.i_should_see_the_landing_page()"
});
formatter.result({
  "duration": 30029812,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Title of your scenario",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "I want to enter my delivery location as \"Indiranagar\"",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "I should click on the search result whose text is \"Indiranagar, Bengaluru, Karnataka, India\"",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "I should go to the restuarants page and verify the user navigated to \"https://www.swiggy.com/bangalore/restaurants\"",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "click on the Search",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "Search for Restaurant called \"Bite Me\" and Click on it",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Add a item to the cart \"Red Velvet Cupcake\" and quantity is \"2\"",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "I like to add \"Tiramisu Cupcake\" with quantity is \"2\"",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "include a item to the cart \"Choco Cake Cupcake\" having quantity as \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "I  add \"Irish Coffee Cupcake\" with quantity is \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "click on the checkout",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "Verify Items added in checkout page \"https://www.swiggy.com/checkout\"",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "Click on \"New to Swiggy? SIGN UP\"",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "Add details Name As \"abc abc\"",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "Phone no as \"0000000000\"",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "Email as \"abc@def.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "Click \"Have a referral code?\"",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "Enter password as \"123456\"",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "Click on CONTINUE",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "verify Error message at Email field \"Invalid email address\"",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "change the \"Red Velvet Cupcake\" to \"1\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Indiranagar",
      "offset": 41
    }
  ],
  "location": "loginStepDefinition.i_want_to_enter_my_delivery_location_as(String)"
});
formatter.result({
  "duration": 5168029873,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Indiranagar, Bengaluru, Karnataka, India",
      "offset": 51
    }
  ],
  "location": "loginStepDefinition.i_should_click_on_the_search_result_whose_text_is(String)"
});
formatter.result({
  "duration": 2063304810,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.swiggy.com/bangalore/restaurants",
      "offset": 70
    }
  ],
  "location": "loginStepDefinition.i_should_go_to_the_restuarants_page_and_verify_the_user_navigated_to(String)"
});
formatter.result({
  "duration": 2058462721,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition.click_on_the_Search()"
});
formatter.result({
  "duration": 10130613348,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bite Me",
      "offset": 30
    }
  ],
  "location": "loginStepDefinition.search_for_Restaurant_called_and_Click_on_it(String)"
});
formatter.result({
  "duration": 9271949433,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Red Velvet Cupcake",
      "offset": 24
    },
    {
      "val": "2",
      "offset": 61
    }
  ],
  "location": "loginStepDefinition.add_a_item_to_the_cart_and_quantity_is(String,int)"
});
formatter.result({
  "duration": 14214898962,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tiramisu Cupcake",
      "offset": 15
    },
    {
      "val": "2",
      "offset": 51
    }
  ],
  "location": "loginStepDefinition.i_like_to_add_with_quantity_is(String,int)"
});
formatter.result({
  "duration": 11263405965,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Choco Cake Cupcake",
      "offset": 28
    },
    {
      "val": "1",
      "offset": 68
    }
  ],
  "location": "loginStepDefinition.include_a_item_to_the_cart_having_quantity_as(String,int)"
});
formatter.result({
  "duration": 10277845940,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Irish Coffee Cupcake",
      "offset": 8
    },
    {
      "val": "1",
      "offset": 48
    }
  ],
  "location": "loginStepDefinition.i_add_with_quantity_is(String,int)"
});
formatter.result({
  "duration": 10269057266,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition.click_on_the_checkout()"
});
formatter.result({
  "duration": 4146213018,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.swiggy.com/checkout",
      "offset": 37
    }
  ],
  "location": "loginStepDefinition.verify_Items_added_in_checkout_page(String)"
});
formatter.result({
  "duration": 3074041547,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New to Swiggy? SIGN UP",
      "offset": 10
    }
  ],
  "location": "loginStepDefinition.click_on(String)"
});
formatter.result({
  "duration": 3076596425,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc abc",
      "offset": 21
    }
  ],
  "location": "loginStepDefinition.add_details_Name_As(String)"
});
formatter.result({
  "duration": 3088675912,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0000000000",
      "offset": 13
    }
  ],
  "location": "loginStepDefinition.phone_no_as(String)"
});
formatter.result({
  "duration": 3088453565,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc@def.com",
      "offset": 10
    }
  ],
  "location": "loginStepDefinition.email_as(String)"
});
formatter.result({
  "duration": 3102082819,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Have a referral code?",
      "offset": 7
    }
  ],
  "location": "loginStepDefinition.click(String)"
});
formatter.result({
  "duration": 3062905873,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 19
    }
  ],
  "location": "loginStepDefinition.enter_password_as(String)"
});
formatter.result({
  "duration": 77062695,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition.click_on_CONTINUE()"
});
formatter.result({
  "duration": 3062453212,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Invalid email address",
      "offset": 37
    }
  ],
  "location": "loginStepDefinition.verify_Error_message_at_Email_field(String)"
});
formatter.result({
  "duration": 3029591345,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Red Velvet Cupcake",
      "offset": 12
    },
    {
      "val": "1",
      "offset": 36
    }
  ],
  "location": "loginStepDefinition.change_the_to(String,int)"
});
formatter.result({
  "duration": 99682875,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 990947271,
  "status": "passed"
});
});