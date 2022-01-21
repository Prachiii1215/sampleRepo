
Feature: validate multiple items are searched

Scenario Outline: Search multiple item search result
 
  Given user is on Login Page
	When validate user is logged in and on homepage
	Then user enters "<search item>" in searchbar and clicks search button
	Then validate search result related to "<search item>" is displayed 
	Then close the browser

    Examples:
    	|search item |  
      |iphone11   |   
      |trimmer    |
         
