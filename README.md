# "Selenium + Java + TestNG" Coding Automation Challenge by Pablo M.Calvano
The following is a Java + Selenium + TestNG test execution which has been developed with simplicity in mind. Its purpose is to follow the guidelines from the code challenge:


## Code Challenge Requirements:
# You can use any approach that you consider to solve the following problem. Language must be Java or C#:

	- A person wants to go to buy a car on www.mercadolibre.com.
	- He is not sure about what model to buy and, for this reason, he wants to search All cars that have a price below $2.000.000.  
	- But he has some considerations to take into account: 
		- The car must be located in Cordoba,
		- The product list must be shown from lowest to highest price. 
	- In addition, he wants to know the number of results available.


## Steps to Reproduce
- Navigate to "https://www.mercadolibre.com" .
- Click on the "Argentina" location.
- Search for the word "Autos".
- Filter the search by clicking on the Range of the cars with the price < $2.000.000.
- Filter the searcg by clicking on the Province with the value "Cordoba".
- Re order the results list by clicking on the "Ordenar por: Menor precio" value.
- Validate and show the number of results obtained by the search.

## Compatibility
- Latest google chrome version Version 101.0.4951.64 (chromedriver)


## Maven Dependencies
- [selenium-java] - https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.1.3) - (Selenium automates browsers.)
- [junit] - https://mvnrepository.com/artifact/junit/junit/4.13 - (JUnit is a unit testing framework for Java)
- [webdrivermanager] - https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.1.0 -  (Automated driver management and Docker builder for Selenium WebDriver)
- [testng] -  https://mvnrepository.com/artifact/org.testng/testng/7.6.0 - (Testing framework for Java)
- [slf4j-api] - (https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36) -  (The slf4j API)
- [slf4j-simple] - https://mvnrepository.com/artifact/org.slf4j/slf4j-simple/1.7.35 - (SLF4J Simple binding)
 


# Additional Notes
- I'm aware there is some room for improvement, but I created the test framework on the amount of time I had on the weekend.
- I think theres a change to add more validations on each step of the steps like:
    - explicit waits (with conditions) to handle issues like the dom being slow to load and some locators may not be ready to be clickable yet.
    - When searching for the Province if the value isn't by default on the list you can navigate to "Show more" and look it up by hand with a SendKeys("Province"); instead of an instant click to the desired province
    - I can first validate if the province exists, the price range exists,(isDislayed), etc.
- I wanted to show a Testing framework with a POM pattern so it can escalate to more pages, more tests to the same pages by adding more @Test annotations,
- or if there's a case that an attribute changes on any of the locators, it can be modified on the page itself and the methods involving that locator will consume
- the correct value all together with one fix. 
