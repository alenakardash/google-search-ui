# google-search-ui :octocat:
A simple project for automating search user scenario on Google search page (https://www.google.com/) with WebDriver and ChromeDriver using PageObject model.

#### Description of files used in the project:
[PageObject:](./src/test/java/PageObject.java) An parent PageObject that all classes should inherit to be able to perform WebDriver tests.

[TestPlan:](./src/test/java/TestPlan.java) A class that wires all test methods together.

[Utils:](./src/test/java/Utils.java) A configuration class that shows the location of chromedriver and constants related to general project configuration. Might also include helper methods in the futures.

[SearchPage](./src/test/java/SearchPage.java) and [SearchResultPage:](./src/test/java/SearchResultPage.java) A form classes which include the locators, variables and methods to perform search user scenario.

#### Tools:
ChromeDriver version 91.0.4472.101

Java 1.8

TestNg 7.1.0

Selenium 3.141.59

Maven 3.0.0

#### Installation and test run
Before the main steps please make sure you have all the listed tools installed.

1. Clone the project.
2. Navigate to google-search-ui directory and run:
`mvn test`

