Feature: Expand testing Login

Scenario: Expand testing Login Scenario

 Given Navigate to site "https://practice.expandtesting.com/login"
 
 Scenario Outline: Login Test
 
Given User is on Login Page

When title of login is Test Login page for Automation Testing Practice

Then Users enters "<username>" and "<password>" 

Examples:
 	| username | password | 
 	| test     | t123 | 
	| qaclick  | test#123 | 
	| practice | SuperSecretPassword! |