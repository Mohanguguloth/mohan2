package Hooks_Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Stepsdefintion {

	@Given("this is hooks demo")
	public void this_is_hooks_demo() {
	    
		System.out.println("This is first scenario");
		
		
	}
	@Then("this is hooks demo1")
	public void this_is_hooks_demo1() {
		
		System.out.println("This is second scenario");
	    
		
		
		
		
	}

	
	
}
