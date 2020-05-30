package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {
	@Given("user is on login page")
	public void user_is_on_login_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("this is given part");
		//throw new io.cucumber.java.PendingException();
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		
		try {
			System.out.println("this is when part");
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//throw new io.cucumber.java.PendingException();
	}

	@And("click on login button")
	public void click_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("this is AND part");
	}
		//throw new io.cucumber.java.PendingException();
	
	@Then("user is navigate to home page")
	public void user_is_navigate_to_home_page() {
		// Write code here that turns the phrase above into concrete actions
		try {
			System.out.println("this is Then part");
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//throw new io.cucumber.java.PendingException();
	}
}
