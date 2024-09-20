package stepDefinition;

import java.util.List;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class Steps_DailyTimeTable extends BaseClass {
	
	@Before
	public void preRequisite()
	{
		System.out.println("Execute before every method");
	}
	
	@After
	public void postCondition()
	{
		System.out.println("Execute after every method");
	}

	@Given("I go to office in the morning")
	public void i_go_to_office_in_the_morning() {
		System.out.println("I go to office in the morning");
	}

	@Given("I go to temple in the morning")
	public void i_go_to_temple_in_the_morning() {
		System.out.println("I go to temple in the morning");
	}

	@Given("I take morning calls with the clients")
	public void morningCalls() {
		System.out.println("I take morning calls with the clients");
	}

	@Given("I go to market in the evening")
	public void go_to_market() {
		System.out.println("I go to market in the evening");
	}

	@Given("I perform the following morning activities:")
	public void performMorningActivities(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.

		List<String> activities = dataTable.asList();
		for (String activity : activities) {
			System.out.println("I " + activity + " in the morning");
		}
	}

	@Given("I go to walk in the evening")
	public void go_to_walk() {
		System.out.println("I go to walk in the evening");
	}

	/*
	 * 
	 * Data Table: The DataTable parameter allows you to pass multiple activities to
	 * the method. Each row in the table corresponds to a morning activity.
	 * 
	 * List Iteration: Inside the method, you can iterate over the list of
	 * activities and perform the actions accordingly.
	 * 
	 */

}