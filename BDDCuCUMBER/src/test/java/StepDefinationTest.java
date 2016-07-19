import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinationTest {
	FirefoxDriver dr=new FirefoxDriver();
	

	@Given("^i enter in google homePage$")
	public void i_enter_in_google_homePage() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		 dr.get("https://www.google.com/?gws_rd=ssl");
	    throw new PendingException();
	}

	@When("^i enter any shahidul to search box$")
	public void i_enter_any_shahidul_to_search_box(String text) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		dr.findElement(By.id("gs_htif0")).sendKeys(text);
	    
	}

	@When("^i click on button$")
	public void i_click_on_button() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	 
	}

	@Then("^i will get search result$")
	public void i_will_get_search_result() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	 
	}

	@When("^i enter any asad to search box$")
	public void i_enter_any_asad_to_search_box() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	 
	}
}
