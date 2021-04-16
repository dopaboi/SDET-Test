# SDET-Test

## Technology
- Selenide 
- Maven
- Allure
- TestNG
___
#### Test 1
1. Navigate to https://jqueryui.com/demos
2. Verify left menu bar contains the following sections
- Interactions
- Widgets
- Effects
- Utilities

#### Test 2
1. Navigate to https://jqueryui.com/demos
2. Click "Spinner" link in "Widgets" left menu section
3. Enter any digital value In "Select a value" textbox
4. Click "Get value" button
5. Verify that appeared popup contains entered value

#### Test 3
1. Navigate to https://jqueryui.com/demos
2. Click "Autocomplete" link in "Widgets" left menu section
3. Type “a” in Tags field
4. From the appeared autocomplete list select 3rd option (Asp) using keyboard actions (“arrow down” and “enter”)
5. Verify Tags field value is Asp
___
## How to start?
Run `mvn test` to build and run the test application.
