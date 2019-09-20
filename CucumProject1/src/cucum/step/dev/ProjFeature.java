package cucum.step.dev;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProjFeature {
	
	@Given("^user opens login page$")
	public void open() throws Exception {
	    System.out.println("login");
	    
	}

	@When("^user enter valid username in username field$")
	public void user_enter_valid_username_in_username_field() throws Exception {
	    System.out.println("username");
	    
	}

	@When("^user enter valid password in password field$")
	public void user_enter_valid_password_in_password_field() throws Exception {
	    System.out.println("password");
	    
	}
	@When("^click ok$")
	public void click_ok() throws Exception {
	    System.out.println("Okay");
	    
	}

	@Then("^verify output$")
	public void verify_output() throws Exception {
	    System.out.println("Verify");
	    
	}

	
	

}
