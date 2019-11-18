package com.cg.stepdefinition;

import com.cap.elementlocator.ElementLocator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	
	
	@Given("^The User is on Register homepage page$")
	public void the_User_is_on_Register_homepage_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    com.cap.pagefactor.PageFactor.openbrowser("C:\\Users\\sgudala\\Desktop\\RegistrationForm.html");
	}

	@When("^User clicks on Registerlink$")
	public void user_clicks_on_Registerlink() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//		 com.cap.pagefactor.PageFactor.alertHandler(); 
	}

	@When("^Enters the Userid$")
	public void enters_the_Userid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		com.cap.pagefactor.PageFactor.clickmethod(com.cap.elementlocator.ElementLocator.Submit);
		Thread.sleep(1000);
//		com.cap.pagefactor.PageFactor.alertHandler();
	   com.cap.pagefactor.PageFactor.Sendvalue(com.cap.elementlocator.ElementLocator.Userid,"187394");
	  
	}

	@When("^Enters the Password$")
	public void enters_the_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		com.cap.pagefactor.PageFactor.clickmethod(com.cap.elementlocator.ElementLocator.Submit);
//		com.cap.pagefactor.PageFactor.alertHandler();
		com.cap.pagefactor.PageFactor.Sendvalue(com.cap.elementlocator.ElementLocator.Password,"sudheer1234");
		
	
	}
	
	@When("^Enters the Name$")
	public void enters_the_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		com.cap.pagefactor.PageFactor.clickmethod(com.cap.elementlocator.ElementLocator.Submit);
//		com.cap.pagefactor.PageFactor.alertHandler();
		com.cap.pagefactor.PageFactor.Sendvalue(com.cap.elementlocator.ElementLocator.Name,"sudheer");
		
	}

	@When("^Enters the Address$")
	public void enters_the_Address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		com.cap.pagefactor.PageFactor.clickmethod(com.cap.elementlocator.ElementLocator.Submit);
//		com.cap.pagefactor.PageFactor.alertHandler();
		com.cap.pagefactor.PageFactor.Sendvalue(com.cap.elementlocator.ElementLocator.Address,"canal street"); 
		
	}

	@When("^Enters the Country$")
	public void enters_the_Country() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		com.cap.pagefactor.PageFactor.clickmethod(com.cap.elementlocator.ElementLocator.Submit);
//		com.cap.pagefactor.PageFactor.alertHandler();
		com.cap.pagefactor.PageFactor.Sendvalue(com.cap.elementlocator.ElementLocator.Country,"India"); 
		
	}

	@When("^Enters the Zipcode$")
	public void enters_the_Zipcode() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		com.cap.pagefactor.PageFactor.clickmethod(com.cap.elementlocator.ElementLocator.Submit);
//		com.cap.pagefactor.PageFactor.alertHandler();
		com.cap.pagefactor.PageFactor.Sendvalue(com.cap.elementlocator.ElementLocator.Zipcode,"534326");
		
	}

	
	@When("^Enters the Email$")
	public void enters_the_Email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		com.cap.pagefactor.PageFactor.clickmethod(com.cap.elementlocator.ElementLocator.Submit);
//		com.cap.pagefactor.PageFactor.alertHandler();
		com.cap.pagefactor.PageFactor.Sendvalue(com.cap.elementlocator.ElementLocator.Email,"sudheer@hotmail.com");
		
	}

	@When("^Enters Sex-Female$")
	public void enters_Sex_Female() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		com.cap.pagefactor.PageFactor.clickmethod(com.cap.elementlocator.ElementLocator.Submit);
		//com.cap.pagefactor.PageFactor.alertHandler();
		com.cap.pagefactor.PageFactor.clickmethod(com.cap.elementlocator.ElementLocator.Sex); 
		
	}

	@When("^Enters the Language-English$")
	public void enters_the_Language_English() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		com.cap.pagefactor.PageFactor.clickmethod(com.cap.elementlocator.ElementLocator.Submit);
		//com.cap.pagefactor.PageFactor.alertHandler();
		com.cap.pagefactor.PageFactor.Sendvalue(com.cap.elementlocator.ElementLocator.Language,"English");
		
	}

	@When("^Enters About$")
	public void enters_About() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		com.cap.pagefactor.PageFactor.Sendvalue(com.cap.elementlocator.ElementLocator.About,"analyst");
	}

	@When("^Click Submit button$")
	public void click_Submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//com.cap.pagefactor.PageFactor.clickmethod(com.cap.elementlocator.ElementLocator.Submit);
	}

	@Then("^User is successfully registered$")
	public void user_is_successfully_registered() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^Browser is closed$")
	public void browser_is_closed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		com.cap.pagefactor.PageFactor.close();
		
	}

	

}
