package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	WebDriver driver;
	@Given("^user is already on Login Page$")
	public void user_already_on_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NI7587\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html?e=1");
		
	}
	
	
	@When("^title of Login Page is Free CRM$")
	public void title_of_Login_Page_is_Free_CRM() 
	{
	    String title=driver.getTitle();
	    System.out.println(title);
	    Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
	   
	}
	
	

}
