package Hooks_Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooksdemo {
     @Before("@Sanity or @Smoke")
	public void beforescenario()
	{
		System.out.println("this is executed before evry scenario");
		
	}
	@After
	public void Afterscenario()
	{
		System.out.println("this is executed after evry scenario");	
		
	}
	
}
