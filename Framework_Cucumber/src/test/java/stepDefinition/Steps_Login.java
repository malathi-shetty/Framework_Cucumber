package stepDefinition;

import org.testng.annotations.BeforeMethod;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Steps_Login {
	
	 @Before(value = "@FirstScenario", order = 1)
	public void prerequisite()
	{
		System.out.println("Execute before every test method");
	}

	@Given("User is on Payment Test")
	public void user_is_on_payment_test() {
	    System.out.println("User Landed on Payment Page");
	}

	@Given("Navigate to Home Page")
	public void navigate_to_home_page() {
		 System.out.println("Login Page Navigated is Successful");
	}
	@When("Enter Credentials")
	public void enter_credentials() {
		 System.out.println("Credential is entered Successful");
	}


	@Given("Navigate to Payment Page")
	public void navigate_to_payment_page() {
		 System.out.println("Payment Page Navigated is Successful");
	}
	@When("Enter amount")
	public void enter_amount() {
		 System.out.println("User need to enter Amount");
	}
}
