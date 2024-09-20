package stepDefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Steps_ExpandtestingLogin extends BaseClass {
	
	@Before
	public void setup() throws IOException
	{
	//Reading configured property class
	configProp = new Properties();
	FileInputStream configPropfile = new FileInputStream("config.properties");
	configProp.load(configPropfile);
	
	 
	
	logger = LogManager.getLogger("ExpandTestingLogin"); // added logger

	String br=configProp.getProperty("browser");
	
	if(br.equals("chrome"))
	{
	configProp.getProperty("chromepath");
	driver = new ChromeDriver();
	}else if(br.equals("firefox"))
	{
	configProp.getProperty("firefoxpath");
	driver = new FirefoxDriver();
	}else if(br.equals("ie"))
	{
	configProp.getProperty("iepath");
	driver = new FirefoxDriver();
	}
	
	
	
	
	
	
	logger.info("*****Launching  Browser********");
    // Example usage of the logger
    logger.info("Logging initialized programmatically");

    logger.debug("Debug message");
    logger.error("Error message");
	}

@Given("User Launch Chrome Browser")
public void user_launch_chrome_browser() {
	
	
	//lp = new LoginPage(driver);
    
}

	@Given("Navigate to site {string}")
	public void navigate_to_site(String url) {
	
		  
	   driver.get(url);
	   driver.manage().window().maximize();
	}


	@Given("User is on Login Page")
	public void user_is_on_login_page() {
	   
	}
	@When("title of login is Test Login page for Automation Testing Practice")
	public void title_of_login_is_test_login_page_for_automation_testing_practice() {
	   
	}
	@Then("Users enters {string} and {string}")
	public void users_enters_and(String username, String password) {
	    System.out.println(username);
	    System.out.println(password);
	}

@After
	public void tearDown() {
		logger.info("*****Closing Browser********");
	   driver.quit();
	}


}
